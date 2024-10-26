package Qlysinhvien;

public class LinkedList<T> { 
    private Node<T> head; // đầu của Node

    public LinkedList(){
        this.head = null;
    }
    //Duyet tung phan tu
    public void traverse(){ // duyet tung phan tu
        Node<T> tmp = head;
        while (tmp != null) {
            //In phan tu
            System.out.println(tmp.getData());
            // Chuyen den phan tu tiep theo
            tmp = tmp.getNext();
        }
    }
    //Them 1 node moi vao dau danh sach
    public void addFirst(T item){
        //Buoc 1
        //Node<T> newNode = new Node<>(item, this.head ) ;
        Node<T> newNode = new Node<>();
        newNode.setData(item);
        newNode.setNext(this.head);
        //Buoc 2
        this.head = newNode;
    }


    //Them node vao cuoi danh sach
    public void addLast(T item){
        if(head==null){
            addFirst(item);
        }else{
            Node<T> newNode = new Node<>(item, null);
            Node<T> tmp = head;
            while (tmp.getNext()!=null) {
                tmp = tmp.getNext();
            }
            tmp.setNext(newNode);
        }
    }
    

    //Them vao phia sau mot node nao do
    public void insertAfter(T key, T toInsert){
        //Buoc 1
        Node<T> newNode = new Node<>();
        newNode.setData(toInsert);
        //Buoc 2: Di tim vi tri cua key
        Node<T> tmp = head;
        //tìm node chứ key 
        //tìm đến khi nào = null or giá trị data= key
        while (tmp!=null && !tmp.getData().equals(key)) {
            tmp = tmp.getNext();
        }
        //tìm ra đc cái node chứ key, or là đi đến cuối

        //Them vao khi tmp khac null
        //2
        if(tmp!=null){
            newNode.setNext(tmp.getNext());
        }
        //3
        tmp.setNext(newNode);
   }
   //Xoa mot node
   public boolean remove(T key){
    if(head == null)
        return false;
        //Xoa neu key o vi tri dau tien
    if(head.getData().equals(key)){
        this.head = head.getNext();
        return true;
     }

        //Tao bien tam
        Node<T> prev = null;
        Node<T> cur = head;
        while (cur!=null && !cur.getData().equals(key)) {
            prev = cur;
            cur = cur.getNext();
        }
        if(cur==null)
            return false;
        prev.setNext(cur.getNext());
            return true;
   }

   public boolean findItem(T item){
        Node<T> tmp = head;
        while (tmp != null) {
            if(tmp.getData().equals(item)){
                return true;
            }
            tmp = tmp.getNext();
        }
        return false;
    }
   
}
