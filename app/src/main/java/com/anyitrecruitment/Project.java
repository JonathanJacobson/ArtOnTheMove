package com.anyitrecruitment;
import com.google.firebase.firestore.IgnoreExtraProperties;

@IgnoreExtraProperties
public class Project
{
    private String projectName;
    private String projectTypeOfTransport;
    private String projectReferenceNumber;
    private String projectPassword;
    private String projectOrigin;
    private String projectDepartureDate;
    private String projectDepartureTime;
    private String projectDestination;
    private String projectArrivalDate;
    private String projectArrivalTime;
    private String projectLenderInstitutionRegistrar;
    private String projectLenderCity;
    private String projectLenderCountry;
    private String projectBorrowerInstitutionRegistrar;
    private String projectBorrowerCity;
    private String projectBorrowerCountry;

    public Project()
    {

    }

    public Project(String projectName, String projectTypeOfTransport, String projectReferenceNumber, String projectPassword, String projectOrigin, String projectDepartureDate, String projectDepartureTime, String projectDestination, String projectArrivalDate, String projectArrivalTime, String projectLenderInstitutionRegistrar, String projectLenderCity, String projectLenderCountry, String projectBorrowerInstitutionRegistrar, String projectBorrowerCity, String projectBorrowerCountry, String projectTransportPlanFile)
    {
        this.projectName = projectName;
        this.projectTypeOfTransport = projectTypeOfTransport;
        this.projectReferenceNumber = projectReferenceNumber;
        this.projectPassword = projectPassword;
        this.projectOrigin = projectOrigin;
        this.projectDepartureDate = projectDepartureDate;
        this.projectDepartureTime = projectDepartureTime;
        this.projectDestination = projectDestination;
        this.projectArrivalDate = projectArrivalDate;
        this.projectArrivalTime = projectArrivalTime;
        this.projectLenderInstitutionRegistrar = projectLenderInstitutionRegistrar;
        this.projectLenderCity = projectLenderCity;
        this.projectLenderCountry = projectLenderCountry;
        this.projectBorrowerInstitutionRegistrar = projectBorrowerInstitutionRegistrar;
        this.projectBorrowerCity = projectBorrowerCity;
        this.projectBorrowerCountry = projectBorrowerCountry;
        this.projectTransportPlanFile = projectTransportPlanFile;
    }

    private String projectTransportPlanFile;

    public String getProjectName()
    {
        return projectName;
    }

    public void setProjectName(String projectName)
    {
        this.projectName = projectName;
    }

    public String getProjectTypeOfTransport()
    {
        return projectTypeOfTransport;
    }

    public void setProjectTypeOfTransport(String projectTypeOfTransport)
    {
        this.projectTypeOfTransport = projectTypeOfTransport;
    }

    public String getProjectReferenceNumber()
    {
        return projectReferenceNumber;
    }

    public void setProjectReferenceNumber(String projectReferenceNumber)
    {
        this.projectReferenceNumber = projectReferenceNumber;
    }

    public String getProjectPassword()
    {
        return projectPassword;
    }

    public void setProjectPassword(String projectPassword)
    {
        this.projectPassword = projectPassword;
    }

    public String getProjectOrigin()
    {
        return projectOrigin;
    }

    public void setProjectOrigin(String projectOrigin)
    {
        this.projectOrigin = projectOrigin;
    }

    public String getProjectDepartureDate()
    {
        return projectDepartureDate;
    }

    public void setProjectDepartureDate(String projectDepartureDate)
    {
        this.projectDepartureDate = projectDepartureDate;
    }

    public String getProjectDepartureTime()
    {
        return projectDepartureTime;
    }

    public void setProjectDepartureTime(String projectDepartureTime)
    {
        this.projectDepartureTime = projectDepartureTime;
    }

    public String getProjectDestination()
    {
        return projectDestination;
    }

    public void setProjectDestination(String projectDestination)
    {
        this.projectDestination = projectDestination;
    }

    public String getProjectArrivalDate()
    {
        return projectArrivalDate;
    }

    public void setProjectArrivalDate(String projectArrivalDate)
    {
        this.projectArrivalDate = projectArrivalDate;
    }

    public String getProjectArrivalTime()
    {
        return projectArrivalTime;
    }

    public void setProjectArrivalTime(String projectArrivalTime)
    {
        this.projectArrivalTime = projectArrivalTime;
    }

    public String getProjectLenderInstitutionRegistrar()
    {
        return projectLenderInstitutionRegistrar;
    }

    public void setProjectLenderInstitutionRegistrar(String projectLenderInstitutionRegistrar)
    {
        this.projectLenderInstitutionRegistrar = projectLenderInstitutionRegistrar;
    }

    public String getProjectLenderCity()
    {
        return projectLenderCity;
    }

    public void setProjectLenderCity(String projectLenderCity)
    {
        this.projectLenderCity = projectLenderCity;
    }

    public String getProjectLenderCountry()
    {
        return projectLenderCountry;
    }

    public void setProjectLenderCountry(String projectLenderCountry)
    {
        this.projectLenderCountry = projectLenderCountry;
    }

    public String getProjectBorrowerInstitutionRegistrar()
    {
        return projectBorrowerInstitutionRegistrar;
    }

    public void setProjectBorrowerInstitutionRegistrar(String projectBorrowerInstitutionRegistrar)
    {
        this.projectBorrowerInstitutionRegistrar = projectBorrowerInstitutionRegistrar;
    }

    public String getProjectBorrowerCity()
    {
        return projectBorrowerCity;
    }

    public void setProjectBorrowerCity(String projectBorrowerCity)
    {
        this.projectBorrowerCity = projectBorrowerCity;
    }

    public String getProjectBorrowerCountry()
    {
        return projectBorrowerCountry;
    }

    public void setProjectBorrowerCountry(String projectBorrowerCountry)
    {
        this.projectBorrowerCountry = projectBorrowerCountry;
    }

    public String getProjectTransportPlanFile()
    {
        return projectTransportPlanFile;
    }

    public void setProjectTransportPlanFile(String projectTransportPlanFile)
    {
        this.projectTransportPlanFile = projectTransportPlanFile;
    }

    @Override
    public String toString()
    {
        return "Project{" +
                "projectName='" + projectName + '\'' +
                ", projectTypeOfTransport='" + projectTypeOfTransport + '\'' +
                ", projectReferenceNumber='" + projectReferenceNumber + '\'' +
                ", projectPassword='" + projectPassword + '\'' +
                ", projectOrigin='" + projectOrigin + '\'' +
                ", projectDepartureDate='" + projectDepartureDate + '\'' +
                ", projectDepartureTime='" + projectDepartureTime + '\'' +
                ", projectDestination='" + projectDestination + '\'' +
                ", projectArrivalDate='" + projectArrivalDate + '\'' +
                ", projectArrivalTime='" + projectArrivalTime + '\'' +
                ", projectLenderInstitutionRegistrar='" + projectLenderInstitutionRegistrar + '\'' +
                ", projectLenderCity='" + projectLenderCity + '\'' +
                ", projectLenderCountry='" + projectLenderCountry + '\'' +
                ", projectBorrowerInstitutionRegistrar='" + projectBorrowerInstitutionRegistrar + '\'' +
                ", projectBorrowerCity='" + projectBorrowerCity + '\'' +
                ", projectBorrowerCountry='" + projectBorrowerCountry + '\'' +
                ", projectTransportPlanFile='" + projectTransportPlanFile + '\'' +
                '}';
    }
}
