import java.util.ArrayList;

public class MyLinkedListStack implements IStackQueue {

    private class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }

    // topNode, thao tác thêm vào đầu của một cái linked list
    Node topNode;
    MyLinkedListStack() {
        topNode = null;
    }

    @Override
    public boolean push(int value) {
        if (!isFull()) {
            // tương đương với thao tác thêm vào đầu của một cái linked list
            Node newNode = new Node(value);
            newNode.next = topNode;
            topNode = newNode;
            return true;
        }
        return false;
    }
    @Override
    public int pop() {
        if(isEmpty())
            return -1;
        int value = topNode.value;
        topNode = topNode.next;
        return value;
    }
    @Override
    public boolean isFull() {
        return false; // khi nao day bo nho thi full, nhung ma linked list thi lam sao full duoc nen luon
    }
    @Override
    public boolean isEmpty() {
        return topNode == null;
    }
    @Override
    public void show() {
        if(isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        Node temp = topNode;
        ArrayList<Integer> tempList = new ArrayList<>(); // khoi tao mot ArrayList
        while(temp != null) {
            tempList.add(temp.value); //lay tung phan tu trong linked list them vao ArrayList
            // System.out.print(temp.value + " ");
            temp = temp.next;
        }
        for (int i = tempList.size() -1; i >= 0; i--){
            System.out.println(tempList.get(i) + "");
        }
        System.out.println();
    }
}

