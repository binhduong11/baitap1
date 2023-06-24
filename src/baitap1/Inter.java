
package baitap1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Inter extends Employee{
    private String Majors;
    private int Semester;
    private String University_Name;

    public Inter(int Id, String Name, Date BirthDay, String Phone, String Email, int EmployeeType, int EmployeeCount, String Majors,int Semester,String University_Name) {
        super(Id, Name, BirthDay, Phone, Email, EmployeeType, EmployeeCount);
        this.Majors = Majors;
        this.Semester = Semester;
        this.University_Name = University_Name;
    }

    @Override
    public void ShowMe() {
        System.out.println("Thông tin nhân viên Inter: Chuyên ngành: "+ this.Majors + " | kỳ: " + this.Semester + " | Trường: " + this.University_Name);
    }
    public String getMajors(){
        return Majors;
    }
    public void setMajors(String Majors){
        this.Majors = Majors;
    }
    public int getSemester(){
        return Semester;
    }
    public void setSemester(int Semester){
        this.Semester = Semester;
    }
    public String getUniversity_Name(){
        return University_Name;
    }
    public void setUniversity_Name(String University_Name){
        this.University_Name = University_Name;
    }

    
    public void Accept(IVisitor visitor) {
        List<Employee> x = new ArrayList<Employee>();
        visitor.VisitInter(this,x);
    }
    
    
}
