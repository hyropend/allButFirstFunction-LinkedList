public class Test {

    public static void main(String[] args){
        LList llist = new LList();

        llist.addToTail(10);
        llist.addToTail(40);
        llist.addToTail(20);
        llist.addToTail(30);
        llist.addToTail(40);
        llist.addToTail(50);
        llist.addToTail(60);
        llist.addToTail(40);
        llist.addToTail(70);
        llist.print();
        System.out.println("*******************************");

        llist.allButFirst(40);
        llist.print();


    }
}
