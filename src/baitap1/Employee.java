package baitap1;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public abstract class Employee {

    private int Id;
    private String Name;
    private Date BirthDay;
    private String Phone;
    private String Email;
    private int EmployeeType;
    private int EmployeeCount;
    private List<Certificate> list_Certificate;

    public Employee(int Id, String Name, Date BirthDay, String Phone, String Email, int EmployeeType, int EmployeeCount) {
        this.Id = Id;
        
//        try {
//            setName(Name);
//        } catch (Exception e) {
//            System.out.println("tên không hợp lệ");
//            this.Name = null;
//        }
        this.Name = Name;
        this.BirthDay = BirthDay;
        this.Phone = Phone;
        this.Email = Email;
        this.EmployeeType = EmployeeType;
        this.EmployeeCount = EmployeeCount;
    }

    public Employee() {
        this.list_Certificate = new ArrayList<>();
    }

    public void ShowInfo() {
        System.out.println("Thông tin nhân viên(ShowInfo): ID: " + this.Id + " | Tên: " + this.Name + " | Ngày sinh: " + this.BirthDay + " | Phone: " + this.Phone + " | Email: " + this.Email + " | Loại: " + ((this.EmployeeType == 0) ? "Experience" : (this.EmployeeType == 1) ? "Fresher" : (this.EmployeeType == 2) ? "Intern" : "Unknown") + " | EmployeeCount: " + this.EmployeeCount);
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) throws NameException {
        if (Name == null || "2".equals(Name)) {
            throw  new NameException("Tên không hợp lệ");
        }
        this.Name = Name;
    }
    

    public Date getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(Date BirthDay) {
//        Date currentDate = new Date();
//        if( (BirthDay.after(currentDate)) ){
//            throw new BirthDayException("Ngày sinh không hợp lệ");
//        }
        this.BirthDay = BirthDay;
    }

    public String getPhoe() {
        return Phone;
    }

    public void setPhone(String Phone) throws PhoneException{
        if ( (Pattern.matches("\\d{10}", Phone) == false )) {
            throw  new PhoneException("Số điện thoại không hợp lệ");
        }
        this.Phone = Phone;
    }

    public String getEmai() {
        return Email;
    }

    public void setEmail(String Email) throws EmailException{
        if( (Pattern.matches("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}", Email)) == false ){
            throw new EmailException("Email Không hợp lệ");
        }
        this.Email = Email;
    }

    public int getEmployeeType() {
        return EmployeeType;
    }

    public void setEmployeeType(int EmployeeType) {
        this.EmployeeType = EmployeeType;
    }

    public int getEmployeeCount() {
        return EmployeeCount;
    }

    public void setEmployeeCount(int EmployeeCount) {
        this.EmployeeCount = EmployeeCount;
    }
    public void AddCertificate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên bằng cấp:");
        String Certificatename = sc.next();
        System.out.println("Chọn xếp loại 0:Giỏi / 1:khá / 2:TB: ");
        int rank = Integer.parseInt(sc.next());
        
        Certificate x = new Certificate(this.list_Certificate.size(), Certificatename, rank, new Date());
        this.list_Certificate.add(x);
    }
    public void ShowCertificate(){
        for (int i = 0; i < this.list_Certificate.size(); i++) {
            System.out.println("Tên bằng cấp: " + this.list_Certificate.get(i).getCertificateName() );
            System.out.println("Xếp loại bằng cấp: " + this.list_Certificate.get(i).getCertificateRank());
            System.out.println("Thời hạn bằng cấp: " + this.list_Certificate.get(i).getCertificateDate());
            System.out.println("-----"  );
        }
    }

    public abstract void ShowMe();

    public abstract void Accept(IVisitor visitor);
    
}
