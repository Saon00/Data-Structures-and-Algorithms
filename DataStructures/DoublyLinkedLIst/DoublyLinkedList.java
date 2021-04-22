public class DoublyLinkedList {

    public static void main(String[] args) {

        // Initializing Objects
        Student saon = new Student("Saon", "Sikder", 2502);
        Student sakib = new Student("Sakib", "Al Hasan", 2505);
        Student muaz = new Student("Md", "Muaz", 2517);
        Student momenatul = new Student("Momenatul", "Islam", 2522);
        Student anamul = new Student("Anamul", "Haq", 2523);

        // adding references to the list
        StudentLinkedList list = new StudentLinkedList();
        list.addFront(saon);
        list.addFront(sakib);
        list.addFront(muaz);
        list.addFront(momenatul);
        list.addFront(anamul);


        list.printList();
        System.out.println("Size is: " + list.getSize());

        // adding a new student at the end
        Student iAmEnd = new Student("I'm", "End", 3000);
        list.addToEnd(iAmEnd);

        list.printList();
        System.out.println("Size is: " + list.getSize());

        // removing from the FRONT
        list.remvoeFromFront();
        list.printList();
        System.out.println("Size is: " + list.getSize());

        // removing from the END
        list.removeFromEnd();
        list.printList();
        System.out.println("Size is: " + list.getSize());

    }
}