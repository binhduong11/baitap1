package baitap1;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class EmployeeFactory {

    public static Employee Create(int employeeCount) {
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
        int id = random.nextInt(900) + 100;
        switch (EmployeeType) {
            case 0:
                System.out.print("Nhập Số năm kinh nghiệm: ");
                int ExplnYear = scanner.nextInt();
                System.out.print("Kỹ năng chuyên môn : ");
                String proSkills = scanner.next();
                System.out.println("");
                Experience experience = new Experience();
                try {
                    experience.setId(id);
                    experience.setName(name);
                    experience.setPhone(phone);
                    //experience.setBirthDay(BirthDay);
                    experience.setEmail(Email);
                    experience.setExplnYear(ExplnYear);
                    experience.setEmployeeCount(0);
                    experience.setProSkill(proSkills);
                } catch (NameException | PhoneException | EmailException e) {
                    System.out.println("Dã xảy ra lỗi thêm thất bại ");
                    System.out.println(e.getMessage());
                    return null;
                }

                //return new Experience( id,name, new Date(), phone, Email, 0, employeeCount,ExplnYear,proSkills);
                return experience;

            case 1:
                System.out.print("Xếp loại tốt nghiệp: ");
                String Graduation_rank = scanner.next();
                System.out.print("Tốt nghiệp trường: ");
                String Education = scanner.next();
                Fresher fresher = new Fresher();
                try {
                    fresher.setId(id);
                    fresher.setName(name);
                    fresher.setPhone(phone);
                    
                    fresher.setBirthDay(new Date());
                    fresher.setEmail(Email);
                    fresher.setEducation(Education);
                    fresher.setEmployeeCount(1);
                    fresher.setGraduation_Rank(Graduation_rank);
                } catch (NameException | PhoneException | EmailException e) {
                    System.out.println("Dã xảy ra lỗi thêm thất bại ");
                    System.out.println(e.getMessage());
                    return null;
                }
                //return new Fresher(id, name, new Date(), phone, Email, 1, employeeCount, new Date(), Graduation_rank, Education);
                return fresher;
            case 2:

                System.out.print("Chuyên ngành: ");
                String Majors = scanner.next();
                System.out.print("Học kì đang học: ");
                int Semester = scanner.nextInt();
                System.out.print("Tên trường học: ");
                String University_name = scanner.next();
                //return new Inter(id, name, new Date(), phone, Email, 2, employeeCount, Majors, Semester, University_name);
                
                Inter inter = new Inter();
                try {
                    inter.setId(id);
                    inter.setName(name);
                    inter.setPhone(phone);
                    
                    inter.setBirthDay(new Date());
                    inter.setEmail(Email);
                    inter.setUniversity_Name(University_name);
                    inter.setEmployeeCount(2);
                    inter.setSemester(Semester);
                    inter.setMajors(Majors);
                } catch (NameException | PhoneException | EmailException e) {
                    System.out.println("Dã xảy ra lỗi thêm thất bại ");
                    System.out.println(e.getMessage());
                    return null;
                }
                
                return inter;
            default:
                throw new IllegalAccessError();
        }
    }
}
