
package baitap1;

import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class EmployeeVisitor implements IVisitor {

    Scanner scanner = new Scanner(System.in);
    
    
    
    public void VisitExperience(Experience experience,List<Employee> x) {
        System.out.println("Thông tin ");
        experience.ShowInfo();
        System.out.println("Chi tiết: ");
        experience.ShowMe();
        System.out.print("Bạn có muốn sửa tên(1:có-2:không): ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Nhập tên mới: ");
            experience.setName(scanner.next());
        }
        System.out.print("Bạn có muốn sửa SDT(1:có-2:không): ");
        choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Nhập SDT mới: ");
            experience.setPhone(scanner.next());
        }
        System.out.print("Bạn có muốn sửa Email(1:có-2:không): ");
        choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Nhập Email mới: ");
            experience.setEmail(scanner.next());
        }
        System.out.print("Bạn có muốn sửa Loại nhân viên(1:có-2:không): ");
        choice = scanner.nextInt();
        if (choice == 2) {
            System.out.print("Bạn có muốn sửa năm kinh nghiệm(1:có-2:không): ");
            choice = scanner.nextInt();
            if (choice == 1) {
            System.out.println("Nhập số năm kinh nghiệm mới: ");
            experience.setExplnYear(scanner.nextInt());
            }
            System.out.print("Bạn có muốn sửa Kỹ năng chuyên môn không?(1:có-2:không): ");
            choice = scanner.nextInt();
            if (choice == 1) {
            System.out.println("Nhập Kỹ năng chuyên môn mới: ");
            experience.setProSkill(scanner.next());
        }
        }
        else{
            System.out.println("Chọn kiểu nhân viên mới(1/fresher - 2/inter : ");
            int type = scanner.nextInt();
            switch(type){
                case 1:
                    System.out.print("Nhập xếp loại tốt nghiệp");
                    String rank = scanner.next();
                    System.out.print("Nhập Tên trường học");
                    String education = scanner.next();
                    Fresher fresher = new Fresher(experience.getId(), experience.getName(), experience.getBirthDay(), experience.getPhoe(), experience.getEmai(), 1, experience.getEmployeeCount(),new Date(),rank, education);
                    x.add(fresher);
                    x.remove(experience);
                    break;
                case 2:
                    System.out.print("Nhập tên chuyên ngành:");
                    String majors = scanner.next();
                    System.out.print("Kỳ học hiện tại");
                    int semester = scanner.nextInt();
                    System.out.print("Nhập tên Trường: ");
                    String university_name = scanner.next();
                    Inter inter = new Inter(experience.getId(), experience.getName(), experience.getBirthDay(), experience.getPhoe(), experience.getEmai(), 2, experience.getEmployeeCount(),  majors,semester, university_name);
                    x.add(inter);
                    x.remove(experience);
                    break;
            }
        }
    }

    

    @Override
    public void VisitFresher(Fresher fresher, List<Employee> x) {
        System.out.println("Thông tin ");
        fresher.ShowInfo();
        System.out.println("Chi tiết: ");
        fresher.ShowMe();
        System.out.print("Bạn có muốn sửa tên(1:có-2:không): ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Nhập tên mới: ");
            fresher.setName(scanner.next());
        }
        System.out.print("Bạn có muốn sửa SDT(1:có-2:không): ");
        choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Nhập SDT mới: ");
            fresher.setPhone(scanner.next());
        }
        System.out.print("Bạn có muốn sửa Email(1:có-2:không): ");
        choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Nhập Email mới: ");
            fresher.setEmail(scanner.next());
        }
        System.out.print("Bạn có muốn sửa Loại nhân viên(1:có-2:không): ");
        choice = scanner.nextInt();
        if (choice == 2) {
            System.out.print("Bạn có muốn sửa Xếp loại tốt nghiệp(1:có-2:không): ");
            choice = scanner.nextInt();
            if (choice == 1) {
            System.out.println("Nhập Xếp loại tốt nghiệp mới: ");
            fresher.setGraduation_Rank(scanner.next());
            }
            System.out.print("Bạn có muốn sửa Trường tốt nghiệp không?(1:có-2:không): ");
            choice = scanner.nextInt();
            if (choice == 1) {
            System.out.println("Nhập trường tốt nghiệp mới: ");
            fresher.setEducation(scanner.next());
        }
        }
        else{
            System.out.println("Chọn kiểu nhân viên mới(1/Experience - 2/inter : ");
            int type = scanner.nextInt();
            switch(type){
                case 1:
                    System.out.print("Nhập Số năm kinh nghiệm:");
                    int explnYear = scanner.nextInt();
                    System.out.print("Nhập kỹ năng chuyên môn:");
                    String proSkill = scanner.next();
                    Experience experience = new Experience(fresher.getId(), fresher.getName(), fresher.getBirthDay(), fresher.getPhoe(), fresher.getEmai(), 0, fresher.getEmployeeCount(),explnYear,proSkill);
                    x.add(experience);
                    x.remove(fresher);
                    break ;
                case 2:
                    System.out.print("Nhập tên chuyên ngành:");
                    String majors = scanner.next();
                    System.out.print("Kỳ học hiện tại");
                    int semester = scanner.nextInt();
                    System.out.print("Nhập tên Trường: ");
                    String university_name = scanner.next();
                    Inter inter = new Inter(fresher.getId(), fresher.getName(), fresher.getBirthDay(), fresher.getPhoe(), fresher.getEmai(), 2, fresher.getEmployeeCount(),  majors,semester, university_name);
                    x.add(inter);
                    x.remove(fresher);
                    break;
            }
        }
    }

    @Override
    public void VisitInter(Inter inter, List<Employee> x) {
        System.out.println("Thông tin ");
        inter.ShowInfo();
        System.out.println("Chi tiết: ");
        inter.ShowMe();
        System.out.print("Bạn có muốn sửa tên(1:có-2:không): ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Nhập tên mới: ");
            inter.setName(scanner.next());
        }
        System.out.print("Bạn có muốn sửa SDT(1:có-2:không): ");
        choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Nhập SDT mới: ");
            inter.setPhone(scanner.next());
        }
        System.out.print("Bạn có muốn sửa Email(1:có-2:không): ");
        choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Nhập Email mới: ");
            inter.setEmail(scanner.next());
        }
        System.out.print("Bạn có muốn sửa Loại nhân viên(1:có-2:không): ");
        choice = scanner.nextInt();
        if (choice == 2) {
            System.out.print("Bạn có muốn sửa Chuyên ngành(1:có-2:không): ");
            choice = scanner.nextInt();
            if (choice == 1) {
            System.out.println("Nhập chuyên ngành mới: ");
            inter.setMajors(scanner.next());
            }
            System.out.print("Bạn có muốn sửa kì đang học không?(1:có-2:không): ");
            choice = scanner.nextInt();
            if (choice == 1) {
            System.out.println("Nhập kì đang học: ");
            inter.setSemester(scanner.nextInt());
        }   System.out.print("Bạn có muốn sửa tên trường không?(1:có-2:không): ");
            choice = scanner.nextInt();
            if (choice == 1) {
            System.out.println("Nhập chuyên tên trường: ");
            inter.setUniversity_Name(scanner.next());
            }
        }
        else{
            System.out.println("Chọn kiểu nhân viên mới(1/Experience - 2/Fresher : ");
            int type = scanner.nextInt();
            switch(type){
                case 1:
                    System.out.print("Nhập Số năm kinh nghiệm:");
                    int explnYear = scanner.nextInt();
                    System.out.print("Nhập kỹ năng chuyên môn:");
                    String proSkill = scanner.next();
                    Experience experience = new Experience(inter.getId(), inter.getName(), inter.getBirthDay(), inter.getPhoe(), inter.getEmai(), 0, inter.getEmployeeCount(),explnYear,proSkill);
                    x.add(experience);
                    x.remove(inter);
                    break ;
                case 2:
                    System.out.print("Nhập xếp loại tốt nghiệp");
                    String rank = scanner.next();
                    System.out.print("Nhập Tên trường học");
                    String education = scanner.next();
                    Fresher fresher = new Fresher(inter.getId(), inter.getName(), inter.getBirthDay(), inter.getPhoe(), inter.getEmai(), 1, inter.getEmployeeCount(),new Date(),rank, education);
                    x.add(fresher);
                    x.remove(inter);
                    break ;
            }
        }
    }
    
}
