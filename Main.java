package Qlysinhvien;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.addFirst("Thanh Thuy");
        ll.addFirst("CTDU va Giai Thuat");
        ll.addFirst("TITV");
        // Xuat 
        //ll.traverse();

        ll.addLast("Viet Nam");
        //ll.traverse();

        ll.insertAfter("TITV", ".vn");
        //ll.traverse();
        System.out.println(ll.remove(".VN"));
        System.out.println(ll.remove(".vn"));
        System.out.println("-------");
        ll.traverse();
    }
}
