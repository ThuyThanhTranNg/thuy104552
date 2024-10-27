package Qlysinhvien;

public class StudentMS {
    private LinkedList <Student> list;

    public StudentMS(){
        this.list = new LinkedList<Student>();
    }
    public void addStudent(Student student){
        this.list.addLast(student);
    }

    public void printList(){
        this.list.traverse();
    }
    //Tim sinh vien
    public boolean findStudent(Student student){
        return list.findItem(student);
    }
}
