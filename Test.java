package Qlysinhvien;

public class Test {
    public static void main(String[] args) {
        StudentMS sms = new StudentMS();
        Student s1 = new Student("MS01", "Thanh Thuy", 18, 9.8f);
        Student s2 = new Student("MS02", "Thanh Trang", 18, 7.8f);
        Student s3 = new Student("MS03", "Thanh Thu", 18, 9.6f);
        Student s4 = new Student("MS04", "Vu Vuong", 18, 8.6f);
        sms.addStudent(s1);
        sms.addStudent(s2);
        sms.addStudent(s3);
        sms.addStudent(s4);
        

        sms.printList();
        System.out.println(("-------"));
        Student s5 = new Student("MS04", "Vu Vuong", 18, 8.6f);
        System.out.println(sms.findStudent(s5));
    }
    
}
