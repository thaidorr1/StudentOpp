package opp;


import java.util.ArrayList;

class StudentList  {
    ArrayList<Student> s1 = new ArrayList<> () ;
    public void AddStudent (Student a ) {
        s1.add(a) ;
    }
    public void PrintSv () {
        if (s1.isEmpty()) {
            System.out.println("danh sach sv trong ");
        }
        else {
            for (Student x : s1) {
                x.print(); 
            }
        }
    }
    public void DeleteSv (String id ) {
        for(Student x : s1 ) {
            if (x.id.equals(id)) {
                s1.remove(x) ;
                System.out.println("Da xoa thanh cong");
                break ;
            }
        }
    }
    public void EditIdStudent (String id) {
        for(Student x : s1 ) {
            if (x.id.equals(id)) {
               x.EditById();
                System.out.println("thanh cong !!");
                return ;
            }
            else {
                System.out.println("id sv can chinh sua kh dung !");
            }
        }
    }
} 