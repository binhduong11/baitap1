
package baitap1;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class EmployeeFactory {
    
    
    
    public static Employee Create(int employeeCount){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập Số điện thoại: ");
        String phone = scanner.nextLine();
        System.out.print("Nhập Email: ");
        String Email = scanner.nextLine();
        System.out.print("Chọn kiểu nhân viên: 0: Experience, 1: Fresher, 2: Inter");
        int EmployeeType = scanner.nextInt();
        Random random = new Random();
        int id = random.nextInt(900)+ 100;
        switch(EmployeeType){
            case 0: 
                System.out.print("Nhập Số năm kinh nghiệm: ");
                int ExplnYear = scanner.nextInt();
                System.out.print("Kỹ năng chuyên môn : ");
                String proSkills = scanner.next();
                System.out.println("");
                
                
                
                return new Experience( id,name, new Date(), phone, Email, 0, employeeCount,ExplnYear,proSkills);
               
            
            case 1:
                System.out.print("Xếp loại tốt nghiệp: ");
                String Graduation_rank = scanner.next();
                System.out.print("Tốt nghiệp trường: ");
                String Education = scanner.next();
                return  new Fresher(id,  name, new Date(), phone,  Email, 1, employeeCount,new Date() , Graduation_rank,Education);
            case 2: 
                
                System.out.print("Chuyên ngành: ");
                String Majors = scanner.next();
                System.out.print("Học kì đang học: ");
                int Semester = scanner.nextInt();
                System.out.print("Tên trường học: ");
                String University_name = scanner.next();
                return new Inter(id,  name, new Date(), phone,  Email, 2, employeeCount,  Majors, Semester, University_name);
            default:
                throw new IllegalAccessError();
        }
    }
}
