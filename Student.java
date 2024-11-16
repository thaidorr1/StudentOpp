package opp;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Student {
    public String id , fullname , major ;
    public float gpa ;
    Date birthday ;
    public void Student (String id , String fullname , String major , float gpa , Date birthday ) {
        this.id = id ;
        this.fullname = fullname ;
        this.major = major ;
        this.gpa = gpa ;
        this.birthday = birthday ;
    }
    
    public void Enter (){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your id : "); id = input.nextLine() ;
        System.out.println("Enter your fullname : "); fullname = input.nextLine() ;
        System.out.println("Enter your major : "); major = input.nextLine() ;
        System.out.println("Enter your gpa : "); gpa = input.nextFloat();
        System.out.println("Enter you birthday "); input.nextLine() ;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat ("dd MM yyyy") ;
            birthday = sdf.parse(input.nextLine()) ;
        }
        catch (ParseException e) {
            System.out.println("dinh dang ngay sinh khong hop le");
        }
    }
    public void EditById () {
        Scanner input = new Scanner (System.in);
        System.out.print("nhap ten can sua : ");
        fullname = input.nextLine() ;
        System.out.print("nhap cong viec can sua : ");
        major = input.nextLine() ;
        System.out.print("nhap gpa can sua : ");
        gpa = input.nextFloat();
        System.out.print("nhap ngay sinh can sua : "); input.nextLine() ;
        
        SimpleDateFormat sdf = new SimpleDateFormat ("dd MM yyyy") ;
        try {
            birthday = sdf.parse(input.nextLine()) ;
        } catch (ParseException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void print () {
         SimpleDateFormat sdf = new SimpleDateFormat ("dd MM yyyy") ;
        System.out.println("Id : " + id);
        System.out.println("fullname : " + fullname);
        System.out.println("major : " + major);
        System.out.println("gpa : " + gpa);
        System.out.println("birthday  : " + sdf.format(birthday));
        System.out.println("------------------------");
    }
}
