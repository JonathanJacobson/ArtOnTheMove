package com.anyitrecruitment;

import com.google.firebase.firestore.IgnoreExtraProperties;

@IgnoreExtraProperties
public class Contact
{
    private String contactId;
    private String contactFirstName;
    private String contactLastName;
    private String contactEmail;
    private String contactPassword;
    private String contactPhoneNumber;
    private String contactInstitution;
    private String contactJobType;
    private String contactDetails;

    public Contact()
    {

    }

    public Contact(String contactId, String contactFirstName, String contactLastName, String contactEmail, String contactPassword, String contactPhoneNumber, String contactInstitution, String contactJobType, String contactDetails)
    {
        this.contactId = contactId;
        this.contactFirstName = contactFirstName;
        this.contactLastName = contactLastName;
        this.contactEmail = contactEmail;
        this.contactPassword = contactPassword;
        this.contactPhoneNumber = contactPhoneNumber;
        this.contactInstitution = contactInstitution;
        this.contactJobType = contactJobType;
        this.contactDetails = contactDetails;
    }

    @Override
    public String toString()
    {
        return "Contact{" +
                "contactId='" + contactId + '\'' +
                ", contactFirstName='" + contactFirstName + '\'' +
                ", contactLastName='" + contactLastName + '\'' +
                ", contactEmail='" + contactEmail + '\'' +
                ", contactPassword='" + contactPassword + '\'' +
                ", contactPhoneNumber='" + contactPhoneNumber + '\'' +
                ", contactInstitution='" + contactInstitution + '\'' +
                ", contactJobType='" + contactJobType + '\'' +
                ", contactDetails='" + contactDetails + '\'' +
                '}';
    }

    public String getContactId()
    {
        return contactId;
    }

    public void setContactId(String contactId)
    {
        this.contactId = contactId;
    }

    public String getContactFirstName()
    {
        return contactFirstName;
    }

    public void setContactFirstName(String contactFirstName)
    {
        this.contactFirstName = contactFirstName;
    }

    public String getContactLastName()
    {
        return contactLastName;
    }

    public void setContactLastName(String contactLastName)
    {
        this.contactLastName = contactLastName;
    }

    public String getContactEmail()
    {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail)
    {
        this.contactEmail = contactEmail;
    }

    public String getContactPassword()
    {
        return contactPassword;
    }

    public void setContactPassword(String contactPassword)
    {
        this.contactPassword = contactPassword;
    }

    public String getContactPhoneNumber()
    {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(String contactPhoneNumber)
    {
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public String getContactInstitution()
    {
        return contactInstitution;
    }

    public void setContactInstitution(String contactInstitution)
    {
        this.contactInstitution = contactInstitution;
    }

    public String getContactJobType()
    {
        return contactJobType;
    }

    public void setContactJobType(String contactJobType)
    {
        this.contactJobType = contactJobType;
    }

    public String getContactDetails()
    {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails)
    {
        this.contactDetails = contactDetails;
    }
}