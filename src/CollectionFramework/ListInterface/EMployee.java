package CollectionFramework.ListInterface;

public class EMployee {
    private int empID;
    private String empFullName;

    public EMployee(int empID, String empFullName, String empAddress, String empDepartment) {
        this.empID = empID;
        this.empFullName = empFullName;
        this.empAddress = empAddress;
        this.empDepartment = empDepartment;
    }

    private String empAddress;



    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpFullName() {
        return empFullName;
    }

    public void setEmpFullName(String empFullName) {
        this.empFullName = empFullName;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public String getEmpDepartment() {
        return empDepartment;
    }

    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment;
    }

    private String empDepartment;
}

