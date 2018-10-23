//Driver class for 
public class ListTester {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLL = new MyLinkedList<>();
        int removed = -1;
        myLL.add(0);
        myLL.displayList(); // 0
        System.out.println(myLL+"\n");
        removed = myLL.remove(0);
        System.out.println("I removed " + removed);
        myLL.displayList(); //empty

        myLL.add(0);
        myLL.add(1);
        myLL.add(2);
        myLL.displayList(); //0 1 2
        System.out.println(myLL+"\n");
        removed = myLL.remove(0);
        myLL.displayList(); // 1 2
        System.out.println(myLL+"\nI removed " + removed);
        myLL.add(0,0);      // 0 1 2
        removed = myLL.remove(1);
        myLL.displayList(); // 0 2
        System.out.println(myLL+"\nI removed " + removed);
        myLL.add(1,1);     // 0 1 2
        removed = myLL.remove(2);    // 0 1
        myLL.displayList();
        System.out.println(myLL+"\nI removed " + removed);
    }
}