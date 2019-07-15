package CollectionFramework.MapInterface.CodeTest;

import java.util.Date;

public class Person1 {
    private long personID;
    private String personName;
    private Date personDOB;

    public Person1() {
    }

    public Person1(long personID, String personName, Date personDOB, String personAddress) {
        this.personID = personID;
        this.personName = personName;
        this.personDOB = personDOB;
        this.personAddress = personAddress;
    }

    private  String personAddress;

    public long getPersonID() {
        return personID;
    }

    public void setPersonID(long personID) {
        this.personID = personID;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Date getPersonDOB() {
        return personDOB;
    }

    public void setPersonDOB(Date personDOB) {
        this.personDOB = personDOB;
    }

    public String getPersonAddress() {
        return personAddress;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "personID=" + personID +
                ", personName='" + personName + '\'' +
                ", personDOB=" + personDOB +
                ", personAddress='" + personAddress + '\'' +
                '}';
    }

    public void setPersonAddress(String personAddress) {
        this.personAddress = personAddress;
    }
}
