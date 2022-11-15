import java.util.Scanner;

public class sept_doubly_practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        pair p = insertComplete(size);
//        int index = sc.nextInt();
        int value = sc.nextInt();
//        p.head = insertFirst(p.head,value);
//        p.head = insertNth(p.head,p.tail,size,index,value);
        p.head = insertElementInSorted(p.head,value);
        printList(p.head);
    }
    static LL insertElementInSorted (LL head, int value){
        if (value < head.data){
            LL insert = new LL(value);
            insert.next = head;
            head.prev = insert;
            head = insert;
            return head;
        }
        LL temp = head;
        while (temp.next.data < value){
            temp = temp.next;
        }
        LL insert = new LL(value);
        LL next = temp.next;
        temp.next = insert;
        insert.prev = temp;
        insert.next = next;
        next.prev = insert;
        return head;
    }
    static LL insertNth (LL head, LL tail, int size, int index, int value){
        int m = size/2;
        if (index > size){
            System.out.println("Enter Valid Index");
            return head;
        }
        if (index < m){
            int c = 0;
            LL temp = head;
            while (c+1 != index){
                temp = temp.next;
                c++;
            }
            LL insert = new LL(value);
            LL x = temp.next;
            temp.next = insert;
            insert.prev = temp;
            insert.next = x;
            x.prev = insert;
            return head;
        }
        // 1 2 3 4 insert 5 /c = 5/tem = 5 /ind 4/x 4
        if (index > m){
            int c = size;
            LL temp = tail;
            while (c-1 != index){
                temp = temp.prev;
                c--;
            }
            LL insert = new LL(value);
            LL x = temp.prev;
            temp.prev = insert;
            insert.next = temp;
            insert.prev = x;
            x.next = insert;
            return head;
        }
        return head;
    }
    static LL insertLast (LL tail, int data){
        LL insert = new LL(data);
        tail.next = insert;
        insert.prev = tail;
        tail = insert;
        return tail;
    }
    static LL insertFirst (LL head,int data){
        LL insert = new LL(data);
        insert.next = head;
        head.prev = insert;
        head = insert;
        return head;
    }
    static void reverse (LL tail){
        LL temp = tail;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.prev;
        }
        System.out.println("START");
    }
    static pair insertComplete(int size){
        // 1 2 3 4 5 -> 1 2 3 4 5
        Scanner sc = new Scanner(System.in);
        LL head = new LL(sc.nextInt());
        LL tail = null;
        head.prev = tail;
        LL temp = head;
        tail = head;
        for (int i = 1; i < size; i++) {
            temp.next = new LL(sc.nextInt());
            temp = temp.next;
            temp.prev = tail;
            tail = tail.next;
        }
        pair p = new pair(head,tail);
        return p;
    }
    static void printList(LL head){
        LL temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
class LL {
    int data;
    LL next;
    LL prev;

    public LL(int data) {
        this.data = data;
    }

    public LL(int data, LL next, LL prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
class pair {
    LL head;
    LL tail;

    public pair(LL head, LL tail) {
        this.head = head;
        this.tail = tail;
    }
}
// pair.head -> pair.tail
