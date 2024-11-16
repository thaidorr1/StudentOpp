
package opp;


import java.util.Scanner ;


public class Opp {
public static void main (String[] args ) {
        StudentList a  = new StudentList () ;
        Scanner input = new Scanner (System.in);
        while (true ) {
            System.out.println("------------BANG SINH VIEN-----------");
            System.out.println("1.Nhap sinh vien");
            System.out.println("2.In ra danh sach sinh vien");
            System.out.println("3.Xoa sinh vien theo id ");
            System.out.println("4.Chinh sua sv theo id ");
            System.out.println("5.Thoat ");
            System.out.print("Nhap lua chon : "); 
            int lc = input.nextInt() ;
            switch (lc) {
                case 1 :
                    Student s1 = new Student () ;
                     s1.Enter(); 
                    a.AddStudent(s1);
                    break ;
                case 2 :
                    a.PrintSv(); 
                    break ;
                case 3 :
                    System.out.print("Nhap id sv ban can xoa :");
                    input.nextLine() ;
                    String idDelete = input.nextLine() ;
                    a.DeleteSv(idDelete);
                    break ;
                case 4 :
                    input.nextLine() ;
                    System.out.print("Nhap id sv can sua : ");
                    String id = input.nextLine() ;
                    a.EditIdStudent(id);
                    break ;
                case 5 : 
                    System.out.println("good byee");
                    return ;
            }
        }
    }
}
