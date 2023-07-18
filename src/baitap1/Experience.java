/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author FPT
 */
public class Experience extends Employee{
    private int ExplnYear;
    private String ProSkill;
    public Experience(int Id, String Name, Date BirthDay, String Phone, String Email, int EmployeeType, int EmployeeCount,int ExplnYear,String ProSkill) {
        super(Id, Name, BirthDay, Phone, Email, EmployeeType, EmployeeCount);
        this.ExplnYear = ExplnYear;
        this.ProSkill = ProSkill;
    }
    public Experience(){
    }

    

    @Override
    public void ShowMe() {
        System.out.println("Thông tin nhân viên Experience: Số năm kinh nghiệm: "+ this.ExplnYear + " | Kỹ năng chuyên môn: " + this.ProSkill );
    }
    public int getExplnYear(){
        return ExplnYear;
    }
    public void setExplnYear(int ExplnYear){
        this.ExplnYear = ExplnYear;
    }
    public String getProSkill(){
        return ProSkill;
    }
    public void setProSkill(String ProSkill){
        this.ProSkill = ProSkill;
    }

    public void Accept(IVisitor visitor) {
        List<Employee> x = new ArrayList<Employee>();
        visitor.VisitExperience(this,x);
    }
}
