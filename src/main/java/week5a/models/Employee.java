package week5a.models;

public class Employee {
    
    //properties 
    private int EmpId;
    private int DeptId;
    private String FirstName;
    private String SurName;
    private String Email;
    private String PhoneNo;

    //Constructors
    public Employee() {

    }

    public Employee(int EmpId, int DeptId, String FirstName, String SurName, String Email, String PhoneNo){
        this.EmpId = EmpId;
        this.DeptId = DeptId;
        this.FirstName = FirstName;
        this.SurName = SurName;
        this.Email = Email;
        this.PhoneNo = PhoneNo;
    }

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }


    public int getDeptId() {
        return DeptId;
    }


    public void setDeptId(int deptId) {
        DeptId = deptId;
    }


    public String getFirstName() {
        return FirstName;
    }


    public void setFirstName(String firstName) {
        FirstName = firstName;
    }


    public String getSurName() {
        return SurName;
    }

    public void setSurName(String surName) {
        SurName = surName;
    }

 
    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }


    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
    }
   

}