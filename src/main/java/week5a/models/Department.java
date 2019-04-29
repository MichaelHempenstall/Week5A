package week5a.models;

public class Department {

    //properties 
    private int DeptId;
    private String DeptName;
    private String DeptDescription;

    //Constructors
    public Department() {

    }

    public Department(int DeptId, String DeptName, String DeptDescription) {
        this.DeptId = DeptId;
        this.DeptName = DeptName;
        this.DeptDescription = DeptDescription;
    }

    public int getDeptId() {
        return DeptId;
    }

    public void setDeptId(int deptId) {
        DeptId = deptId;
    }

  
    public String getDeptName() {
        return DeptName;
    }

    public void setDeptName(String deptName) {
        DeptName = deptName;
    }


    public String getDeptDescription() {
        return DeptDescription;
    }


    public void setDeptDescription(String deptDescription) {
        DeptDescription = deptDescription;
    }

}