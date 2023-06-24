
package baitap1;

import java.util.Date;

public abstract class Employee {
    private int Id;
    private String Name;
    private Date BirthDay;
    private String Phone;
    private String Email;
    private int EmployeeType;
    private int EmployeeCount;

    public Employee(int Id, String Name, Date BirthDay,String Phone , String Email, int EmployeeType, int EmployeeCount) {
        this.Id = Id;
        this.Name = Name;
        this.BirthDay = BirthDay;
        this.Phone = Phone;
        this.Email = Email;
        this.EmployeeType = EmployeeType;
        this.EmployeeCount = EmployeeCount;
    }
    public void ShowInfo(){
        System.out.println("Thông tin nhân viên(ShowInfo): ID: "+ this.Id + " | Tên: "+ this.Name + " | Ngày sinh: " + this.BirthDay + " | Phone: " + this.Phone + " | Email: "+ this.Email + " | Loại: " + ((this.EmployeeType == 0) ? "Experience" :(this.EmployeeType == 1) ? "Fresher" :(this.EmployeeType == 2) ? "Intern" : "Unknown") + " | EmployeeCount: " + this.EmployeeCount);
    }
    public int getId(){
        return Id;
    }
    public void setId(int id){
        this.Id = id;
    }
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public Date getBirthDay(){
        return BirthDay;
    }
    public void setBirthDay(Date BirthDay){
        this.BirthDay = BirthDay;
    }
    public String getPhoe(){
        return Phone;
    }
    public void setPhone(String Phone){
        this.Phone = Phone;
    }
    public String getEmai(){
        return Email;
    }
    public void setEmail(String Email){
        this.Email = Email;
    }
    public int getEmployeeType(){
        return EmployeeType;
    }
    public void setEmployeeType(int EmployeeType){
        this.EmployeeType = EmployeeType;
    }
    public int getEmployeeCount(){
        return EmployeeCount;
    }
    public void setEmployeeCount(int EmployeeCount){
        this.EmployeeCount = EmployeeCount;
    }
    public abstract void ShowMe();
    public abstract void Accept(IVisitor visitor);
}
