public class MyLinkedListQueue implements IStackQueue {

    public class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    // có 2 thao tác chính: thêm phần tử vào đầu linked list (push) và xóa phần tử
    // cuối của linked list (pop)
    Node headNode;
    Node tailNode;

    MyLinkedListQueue() {
        headNode = tailNode = null;
    }

    @Override
    public boolean push(int value) {
        if (isFull()) {
            return false;
        }

        Node newNode = new Node(value);
        if (isEmpty()) {
            headNode = tailNode = newNode;
        } else { // thêm node vào cuối linked list
            tailNode.next = newNode;
            tailNode = newNode;
        }
        // always keep tracking tail pointer
        return true;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int value = headNode.value;
        if (headNode == tailNode) { // trường hợp khi linked list có 1 node vừa làm head vừa làm tail
            headNode = tailNode = null;
        } else {
            headNode = headNode.next;
        }
        return value;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return (headNode == null && tailNode == null);
    }

    @Override
    public void show() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return;
        }
        Node curNode = headNode;
        while (curNode != null) {
            System.out.println(curNode.value + "");
            curNode = curNode.next;
        }
        System.out.println();
    }

}
