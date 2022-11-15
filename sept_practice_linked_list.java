import java.util.Scanner;

public class sept_practice_linked_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        RR head1 = insertComplete(size1);
        int size2 = sc.nextInt();
        RR head2 = insertComplete(size2);
        RR head3 = addTwoNumber(head1,head2);
        printList(head3);
    }
    static RR addTwoNumber (RR head1, RR head2){
        RR x = head1;
        RR y = head2;
        RR head3 = new RR();
        RR z = head3;
        int carry = 0;
        while (x != null && y != null){
            if (x.data + y.data + carry > 9){
                  z.data = (x.data + y.data + carry)%10;
                  carry = (x.data + y.data + carry)/10;
                  x = x.next;
                  y = y.next;
                  z.next = new RR();
                  z = z.next;
            }
            else {
                z.data = x.data + y.data + carry;
                x = x.next;
                y = y.next;
                z.next = new RR();
                z = z.next;
                carry = 0;
            }
        }
        while (x != null){
            if (x.data + carry > 9){
                z.data = (x.data + carry)%10;
                carry = (x.data + carry)/10;
                x = x.next;
                z.next = new RR();
                z = z.next;
            }
            else {
                z.data = x.data + carry;
                x = x.next;
                z.next = new RR();
                z = z.next;
                carry = 0;
            }
        }
        while (y != null){
            if (y.data + carry > 9){
                z.data = (y.data + carry)%10;
                carry = (y.data + carry)/10;
                y = y.next;
                z.next = new RR();
                z = z.next;
            }
            else {
                z.data = y.data + carry;
                y = y.next;
                z.next = new RR();
                z = z.next;
                carry = 0;
            }
        }
        if (carry>0){
            z.data = carry;
        }
        return head3;
    }
    static RR insertElementInSorted (RR head, int value){
        if (value < head.data){
            RR insert = new RR(value);
            insert.next = head;
            head = insert;
            return head;
        }
        RR temp = head;
        while (temp.next.data < value){
            temp = temp.next;
        }
        RR insert = new RR(value);
        RR next = temp.next;
        temp.next = insert;
        insert.next = next;
        return head;
    }
    static RR reverseFirstHalf (RR head){
        RR fast = head;
        RR slow = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        RR prev = null;
        RR current = head;
        RR temp = head;
        RR next = null;
        while (current != slow){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        temp.next = slow;
        head = prev;
        return head;
    }
    static RR reverseMiddleHalf (RR head){
        RR fast = head;
        RR slow = head;
        RR p = null;
        while (fast != null && fast.next != null) {
         p = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        RR prev = null;
        RR current = p.next; //p.next
        RR next = null;
        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        p.next = prev; //p.next = prev
        return head;
    }
    static RR reverse (RR head){
        RR prev = null;
        RR current = head;
        RR next = null;
        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }
    static RR mergeTwoList(RR head1, RR head2){
        RR a = head1;
        RR b = head2;
        RR head = new RR();
        if (a.data <= b.data){
            head = a;
            a = a.next;
        }
        else {
            head = b;
            b = b.next;
        }
        RR c = head;
        while (a != null && b != null){
            if (a.data < b.data){
                c.next = a;
                a = a.next;
                c = c.next;
            }
            else{
                c.next = b;
                b = b.next;
                c = c.next;
            }
        }
        while (a != null){
            c.next = a;
            a = a.next;
            c = c.next;
        }
        while (b != null){
            c.next = b;
            b = b.next;
            c = c.next;
        }
        return head;
    }
    // DELETE NTH
    static RR insertNth(RR head, int l,int value,int index){
        // 1 index based
        if (index > l){
            System.out.println("Invalid Index");
            return head;
        }
        if (index==1){
            RR insert = new RR(value);
            insert.next = head;
            head = insert;
            return head;
        }
        int counter = 1;
        RR temp = head;
        while (counter+1 != index){
            temp = temp.next;
        }
        RR insert = new RR(value);
        RR x = temp.next;
        temp.next = insert;
        insert.next = x;
        return head;
    }
    static RR deleteMiddle(RR head,int l){
        int mid = l/2;
        int counter = 0;
        RR temp = head;
        while (counter+1!=mid){
            temp = temp.next;
            counter++;
        }
        RR x = temp.next.next;
        temp.next = x;
        return head;
    }
    static RR insertMiddle(RR head, int l, int insert){
        // c + 1 == m
        // c = = m -> m+1
        //c+2 -> m-1
        // 1 2 3 4 5 size -> 5 / temp = 2 / x = 3 / data = sc.n
        int mid = l/2;
        int counter = 0;
        RR temp = head;
        while (counter+1!= mid){
            temp = temp.next;
            counter++;
        }
        RR x = temp.next;
        RR data = new RR(insert);
        temp.next = data;
        data.next = x;
        return head;
    }
    static RR deleteLast(RR head){
        RR temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    static RR deleteFirst(RR head){
        RR temp = head.next;
        head = temp;
        return head;
    }
    static int length(RR head){
        // 1 2 3 4 5 100
        // l = 6
        int l = 0;
        RR temp = head;
        while (temp != null){
            temp = temp.next;
            l++;
        }
        return l;
    }
    static RR insertLast(RR head, int value){
        RR insert = new RR(value); // insert node
        RR temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = insert;
        return head;
    }
    static RR insertFirst(RR head, int value){
        RR temp = new RR(value); // POINTING to null
        temp.next = head;
        head = temp;
        return head;
    }
    static RR insertComplete(int size){
        Scanner sc = new Scanner(System.in);
        RR head = new RR(sc.nextInt());
        RR temp = head;
        for (int i = 1; i < size; i++) {
            temp.next = new RR(sc.nextInt());
            temp = temp.next;
        }
        return head;
    }
    static void printList(RR head){
        RR temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    static RR middle (RR head){
        RR fast = head;
        RR slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
class RR {
    int data;
    RR next;

    public RR() {
    }

    public RR(int data) {
        this.data = data;
    }
}
/* You are given a sorted Link List (input from the user) and an element Value of type int you have to insert Value in the
sorted place as per list.
Ex 10 20 30 40 50 -> list
 32 -> value
 output : 10 20 30 32 40 50
 */
