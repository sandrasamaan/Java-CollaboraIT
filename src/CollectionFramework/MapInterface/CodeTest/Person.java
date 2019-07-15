package CollectionFramework.MapInterface.CodeTest;

import java.util.Date;

public class Person implements Comparable <Person>{
    /*

1. Create POJO class person
    person - ID(Long), Name, Date(Date class), Address

2. Ceate with HashMap and user person class as value ..
    1. Add the data by calling constructor of person class
    2. Remove
    3. Clone
    4. ContainKey
    5. Loop Using key/value pair
     */

    private long personID;
    private String name;
    private Date DOB;
    private String address;



    public Person(long personID, String name, Date DOB, String address) {
        this.personID = personID;
        this.name = name;
        this.DOB = DOB;
        this.address = address;
    }

    public long getPersonID() {
        return personID;
    }

    public void setPersonID(long personID) {
        this.personID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personID=" + personID +
                ", name='" + name + '\'' +
                ", DOB=" + DOB +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
