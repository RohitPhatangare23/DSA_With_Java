package LinkedList;

public class Main {
    public static void main(String[] args) {
//        LL list = new LL();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.insertLast(99);
//        list.insert(100, 3);
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.delete(2));
//        list.display();
//        list.find(2);
//        list.insertRec(88, 2);
//        list.display();

//        DLL list2 = new DLL();
//        list2.insertFirst(3);
//        list2.insertFirst(2);
//        list2.insertFirst(8);
//        list2.insertFirst(17);
//        list2.display();
//
//        list2.insertLast(99);
//        list2.display();
//
//        list2.insert(8, 65);
//        list2.display();

        CLL list3 = new CLL();
        list3.insert(23);
        list3.insert(3);
        list3.insert(19);
        list3.insert(75);
        list3.display();
        list3.delete(19);
        list3.display();
    }

}
