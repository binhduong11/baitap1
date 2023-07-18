/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class NewClass {
    List<Employee> _list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    IVisitor visitor = new EmployeeVisitor();
   public static void main(String[] args) {
       
       
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        NewClass myObject = new NewClass();
        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Hiển thị thông tin các nhân viên");
            System.out.println("2. Thêm nhân viên");
            System.out.println("3. Sửa thông tin nhân viên");
            System.out.println("4. Xóa nhân viên");
            System.out.println("5. Hiển thị theo loại nhân viên");
            System.out.println("6. Hiển thị bằng cấp");
            System.out.println("7. Thêm bằng cấp");
            System.out.println("8. Thoát");
            System.out.print("Vui lòng chọn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("chọn phương thức 1/showinfo - 2/showMe");
                    int show = scanner.nextInt();
                    switch (show) {
                        case 1:
                            myObject.ShowInfo();
                            break;
                        case 2:
                            myObject.ShowMe();
                            break;
                        default:
                            throw new AssertionError();
                    }
                    break;
                case 2:
                    myObject.add();
                    break;
                case 3:
                    myObject.edit();
                    break;
                case 4:
                   myObject.delete();
                    break;
                case 5:
                   myObject.displayEmployeeByType();
                    break;
                case 6:
                    myObject.ShowCertificate();
                    break;
                case 7:
                    myObject.AddCertificate();
                    break;
                case 8:
                    System.out.println("Ứng dụng kết thúc.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 8);
       
       
       
       
       
       
//        List<Employee> x = new ArrayList<>();
//        EmployeeFactory siuu = new EmployeeFactory();
//        Employee hihi = EmployeeFactory.Create(0);
//        x.add(hihi);
//        for (int i = 0; x.size() > i; i++) {
//           Employee c = x.get(i);
//           c.ShowInfo();
//           c.ShowMe();
//       }
//        IVisitor visitor = new EmployeeVisitor();
//        if (hihi instanceof Experience) {
//           // Employee haha = (Experience) hihi;
//           visitor.VisitExperience((Experience) hihi, x);
//       }
//        for (int i = 0; x.size() > i; i++) {
//           Employee c = x.get(i);
//           c.ShowInfo();
//           c.ShowMe();
//       }
    }
   public void ShowInfo(){
       for (int i = 0; i < _list.size(); i++) {
           Employee x = _list.get(i);
           x.ShowInfo();
       }
   }
   public void ShowMe(){
       System.out.println("Nhập id nhân viên cần hiển thị");
       int id = scanner.nextInt();
       for (int i = 0; i < _list.size(); i++) {
           Employee x = _list.get(i);
           if (x.getId() == id ) {
           x.ShowMe();
       }
   }
   }
   public void add(){
       Employee employee = EmployeeFactory.Create(_list.size() +1);
       _list.add(employee);
   }
   public void edit(){
       System.out.println("Nhập id nhân viên cần sửa");
       int id = scanner.nextInt();
       for (int i = 0; i < _list.size(); i++) {
           Employee x = _list.get(i);
           if (x.getId() == id ) {
               if (x instanceof Experience) {
                   visitor.VisitExperience((Experience) x, _list);
               }
               else if(x instanceof Fresher){
                   visitor.VisitFresher((Fresher) x, _list);
               }
               else{
                   visitor.VisitInter((Inter) x, _list);
               }
           }
       }
   }
   
   public void delete(){
       System.out.println("Nhập id nhân viên cần xóa");
       int id = scanner.nextInt();
       for (int i = 0; i < _list.size(); i++) {
           Employee x = _list.get(i);
           if (x.getId() == id ) {
           _list.remove(x);
           return;
            }
        }
   }
   
   public void displayEmployeeByType(){
       System.out.println("Chọn loại nhân viên cần nhập 0: Experience - 1: fresher - 2: Inter");
       int type = scanner.nextInt();
       switch (type) {
           case 0:
               System.out.println("Nhân viên Experience");
               for (int i = 0; i < _list.size(); i++) {
                   Employee x = _list.get(i);
                    if(x instanceof Experience){
                        x.ShowInfo();
                        x.ShowMe();
                    }             
            }
               break;
            case 1:
                System.out.println("Nhân viên fresher");
               for (int i = 0; i < _list.size(); i++) {
                   Employee x = _list.get(i);
                    if(x instanceof Fresher){
                        x.ShowInfo();
                        x.ShowMe();
                    }             
            }
                break;
            case 2:
                System.out.println("Nhân viên inter");
               for (int i = 0; i < _list.size(); i++) {
                   Employee x = _list.get(i);
                    if(x instanceof Inter){
                        x.ShowInfo();
                        x.ShowMe();
                    }             
            }
                break;
           default:
               throw new AssertionError();
       }
   }
  
   public void AddCertificate(){
       System.out.println("Nhập id nhân viên");
       int id = scanner.nextInt();
       for (int i = 0; i < _list.size(); i++) {
           Employee x = _list.get(i);
           if (x.getId() == id ) {
           x.AddCertificate();
           return;
            }
        }
   }
   public void ShowCertificate(){
       System.out.println("Nhập id nhân viên");
       int id = scanner.nextInt();
       for (int i = 0; i < _list.size(); i++) {
           Employee x = _list.get(i);
           if (x.getId() == id ) {
           x.ShowCertificate();
           return;
            }
        }
   }
}
