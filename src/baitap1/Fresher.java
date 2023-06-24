/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap1;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Fresher extends Employee{

    private Date Graduation_date;
    private String Graduation_Rank;
    private String Education;
    
    public Date getGraduation_date(){
        return Graduation_date;
    }
    public void setGraduation_date(Date Graduation_date){
        this.Graduation_date = Graduation_date;
    }
    public String getGraduation_Rank(){
        return Graduation_Rank;
    }
    public void setGraduation_Rank(String Graduation_Rank){
        this.Graduation_Rank = Graduation_Rank;
    }
    public String getEducation(){
        return Education;
    }
    public void setEducation(String Education){
        this.Education = Education;
    }
    
    public Fresher(int Id, String Name, Date BirthDay, String Phone, String Email, int EmployeeType, int EmployeeCount,Date Graduation_date,String Graduation_Rank,String Education) {
        super(Id, Name, BirthDay, Phone, Email, EmployeeType, EmployeeCount);
        this.Education = Education;
        this.Graduation_Rank = Graduation_Rank;
        this.Graduation_date = Graduation_date;
    }
    

    @Override
    public void ShowMe() {
        System.out.println("Thông tin nhân viên Fresher: Thời gian tốt nghiệp: "+ this.Graduation_date + " | Xếp loại tốt nghiệp: " + this.Graduation_Rank + " | Trường: " + this.Education);
    }

    
    public void Accept(IVisitor visitor) {
        List<Employee> x = new ArrayList<Employee>();
        visitor.VisitFresher(this, x);
    }
    
}
