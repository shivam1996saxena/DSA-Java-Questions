public class Customer {
    String name;
    int Contact_Number;
    String address;
    int roomNo;
    public static int No_of_visitors = 0;
    Customer (String name, int Contact_Number, String address,int roomNo){
        this.name = name;
        this.Contact_Number = Contact_Number;
        this.address = address;
        this.roomNo = roomNo;
        No_of_visitors++;
    }
    public void print(){
        System.out.println("Customer Name:"+" "+name);
        System.out.println("Customer Address:"+" "+address);
        System.out.println("Customer Contact Number:"+" "+Contact_Number);
        System.out.println("Room No:"+" "+roomNo);
    }
}
    class hotel {
        public static void main(String[] args) {
            Customer vedanshi = new Customer("Vedanshi", 998765431, "Punjab",202);
            vedanshi.print();
            System.out.println(Customer.No_of_visitors);
            Customer shivam = new Customer("Shivam", 123456789, "Noida",203);
            shivam.print();
            System.out.println(Customer.No_of_visitors);
            Customer mahi = new Customer("Mahi", 123456, "Kashmir",104);
            mahi.print();
            System.out.println(Customer.No_of_visitors);
            Customer om = new Customer("Raju", 3356848, "Bangalore",105);
            om.print();
            System.out.println(Customer.No_of_visitors);
        }
    }