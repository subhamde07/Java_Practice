

class Queue {
    int[] arr = new int[20];
    int front = -1;
    int back = -1;
    int size = 0;
    public void add(int data){
        if(back == arr.length-1){
            System.out.println("Queue is Full!!.");
            return;
        }
        if(front == -1){
            arr[++back] = data;
            front = 0;
            size++;
        }
        else{
            arr[++back] = data;
            size++;
        }
    }

    public int peek(){
        if(front == -1){
            System.out.println("Queue Empty!!.");
            return -1;
        }
        return arr[front];
    }
    
    public int poll(){
        if(size == 0){
            System.out.println("Queue is empty!!");
            return -1;
        }
        front++;
        size--;
        return arr[front-1];
    }

    public boolean isEmpty(){
        if(size == 0) return true;
        return false;
    }

    public void print(){
        if(size == 0){
            System.out.println("Queue is empty!!");
            return;
        }
        for(int i=back ; i>=front ; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class ArrayImplement {
    public static void main(String[] args) {
        Queue q = new Queue();
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.print();

        System.out.println(q.poll());
        System.out.println(q.poll());
        q.print();
        System.out.println(q.peek());
        System.out.println(q.isEmpty());

    }
}
