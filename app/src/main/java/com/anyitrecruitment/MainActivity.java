package com.anyitrecruitment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    /******************************************/

    public static final String ARTIST_NAME = "net.simplifiedcoding.firebasedatabaseexample.artistname";
    public static final String ARTIST_ID = "net.simplifiedcoding.firebasedatabaseexample.artistid";

    //view objects
    /* EditText editTextName;
    Spinner spinnerGenre;
    Button buttonAddArtist;
    ListView listViewArtists; */
    //Contact
    ListView listViewContacts;
    EditText txtContactDetails; //t1 out
    EditText txtContactEmail;
    EditText txtContactFirstName;
    EditText txtContactId;
    EditText txtContactInstitution;
    EditText txtContactJobType;
    EditText txtContactLastName;
    EditText txtContactPassword;
    EditText txtContactPhoneNumber;


    //a list to store all the artist from firebase database
    List<Contact> contactList;

    //our database reference object
    DatabaseReference databaseContacts;

    /******************************************/

    Button btnadd;
    Spinner spinner;
    DatabaseReference dbref;
    ValueEventListener listener;
    ArrayList<String> list;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /************************************************/

        //getting the reference of artists node
        databaseContacts = FirebaseDatabase.getInstance().getReference("Contact");

        //getting views
        txtContactEmail = (EditText) findViewById(R.id.txtContactEmail);
        txtContactFirstName = (EditText) findViewById(R.id.txtContactFirstName);
        txtContactId = (EditText) findViewById(R.id.txtContactId);
        txtContactInstitution = (EditText) findViewById(R.id.txtContactInstitution);
        txtContactJobType = (EditText) findViewById(R.id.txtContactJobType);
        txtContactLastName = (EditText) findViewById(R.id.txtContactLastName);
        txtContactPassword = (EditText) findViewById(R.id.txtContactPassword);
        txtContactPhoneNumber = (EditText) findViewById(R.id.txtContactPhoneNumber);

        //list to store artists
        contactList = new ArrayList<>();

        /************************************************/

        txtContactDetails = (EditText) findViewById(R.id.txtContactDetails);
        spinner = (Spinner) findViewById(R.id.spinnerdata);
        btnadd = (Button) findViewById(R.id.btnadd);
        dbref = FirebaseDatabase.getInstance().getReference("AndroidSpinner");
        //Please change your database URL to https://androidspinner-34692-default-rtdb.europe-west1.firebasedatabase.app

        list=new ArrayList<String>();
        adapter=new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,list);
        spinner.setAdapter(adapter);


        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertdata();
                addContact();
            }
        });

        fetchdata();
    }

    /*
     * This method is saving a new artist to the
     * Firebase Realtime Database
     * */
    private void addContact() {
        //getting the values to save
        //String contactId = txtContactId.getText().toString().trim();
        String contactFirstName = txtContactFirstName.getText().toString().trim();
        String contactLastName = txtContactLastName.getText().toString().trim();
        String contactEmail = txtContactEmail.getText().toString().trim();
        String contactPassword = txtContactPassword.getText().toString().trim();
        String contactPhoneNumber = txtContactPhoneNumber.getText().toString().trim();
        String contactInstitution = txtContactInstitution.getText().toString().trim();
        String contactJobType = txtContactJobType.getText().toString().trim();
        String contactDetails = txtContactDetails.getText().toString().trim();

        /*
        String name = editTextName.getText().toString().trim();
        String genre = spinnerGenre.getSelectedItem().toString();
        */

        //checking if the value is provided
        if (!TextUtils.isEmpty(contactFirstName)) {

            //getting a unique id using push().getKey() method
            //it will create a unique id and we will use it as the Primary Key for our Artist
            String contactId = databaseContacts.push().getKey();

            //creating an Artist Object
            //Artist artist = new Artist(id, name, genre);
            Contact contact = new Contact(contactId, contactFirstName, contactLastName, contactEmail, contactPassword, contactPhoneNumber, contactInstitution, contactJobType, contactDetails);

            //Saving the Artist
            databaseContacts.child(contactId).setValue(contact);

//setting edittext to blank again
            txtContactId.setText("");

            //displaying a success toast
            Toast.makeText(this, "Artist added", Toast.LENGTH_LONG).show();
        } else {
            //if the value is not given displaying a toast
            Toast.makeText(this, "Please enter a name", Toast.LENGTH_LONG).show();
        }
    }


    public void insertdata() {
        String data = txtContactDetails.getText().toString().trim();
        dbref.push().setValue(data)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        txtContactDetails.setText("");
                        list.clear();
                        fetchdata();
                        adapter.notifyDataSetChanged();
                        Toast.makeText(getApplicationContext(), "Inserted Successfully", Toast.LENGTH_LONG).show();
                    }
                });
    }
    public void fetchdata()
    {
        listener=dbref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot mydata : snapshot.getChildren())
                    list.add(mydata.getValue().toString());
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}