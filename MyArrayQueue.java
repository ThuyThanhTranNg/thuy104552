public class MyArrayQueue implements IStackQueue {
    private int[] array;
    private int SIZE;
    private int headIndex;
    private int tailIdex;

    MyArrayQueue(int size){
        SIZE = size;
        array = new int [SIZE];
        headIndex = tailIdex = -1;
    }

    @Override
    public boolean push(int value) {
        if(!isFull()){
            if(isEmpty()){
                headIndex ++;
            }
            tailIdex++;
            array[tailIdex] = value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        int value = -1;
        if (!isEmpty()){
        }
            value = array[headIndex];
            headIndex++;
            if (headIndex > tailIdex){
                headIndex = tailIdex = -1; 
            }

        return value;
    }

    @Override
    public boolean isFull() {
        return tailIdex == SIZE-1;
    }

    @Override
    public boolean isEmpty() {
        return(headIndex == -1) && (tailIdex == -1);
    }

    @Override
    public void show() {
        if(isEmpty()){
            System.out.println("Queue is emtpy!");
        }else{
            for (int i = headIndex; i <= tailIdex; i++){
                System.out.println(array[i] +"");
            }
        }
    }
    public int count(){
        if(isEmpty()){
            return 0;
        return tailIdex - headIndex +1;
        }
    }
    
}
