package com.anyitrecruitment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class ProjectActivity extends AppCompatActivity
{
    EditText txtProjectName;
    EditText txtProjectTypeOfTransport;
    EditText txtProjectReferenceNumber;
    EditText txtProjectPassword;
    EditText txtProjectOrigin;
    EditText txtProjectDepartureDate;
    EditText txtProjectDepartureTime;
    EditText txtProjectDestination;
    EditText txtProjectArrivalDate;
    EditText txtProjectArrivalTime;
    EditText txtProjectLenderInstitutionRegistrar;
    EditText txtProjectLenderCity;
    EditText txtProjectLenderCountry;
    EditText txtProjectBorrowerInstitutionRegistrar;
    EditText txtProjectBorrowerCity;
    EditText txtProjectBorrowerCountry;
    EditText txtProjectTransportPlanFile;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);

        txtProjectName = findViewById(R.id.txtProjectName);

        String name = getIntent().getStringExtra("name");

        txtProjectName.setText(name + ", Welcome to Project Activity");
    }
}