public class StudentLinkedList {

    private StudentNode head;
    private StudentNode tail;
    private int size;

    // Adding values at FRONT
    public void addFront(Student student) {
        StudentNode node = new StudentNode(student);

        if (head == null) {
            tail = node;
        } else {
            head.setPrevious(node);
            node.setNext(head);
        }

        head = node;
        size++;
    }

    // Adding values at END
    public void addToEnd(Student student) {
        StudentNode node = new StudentNode(student);
        if (tail == null) {
            head = node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
        }

        tail = node;
        size++;
    }

    // Removing values from FRONT
    public StudentNode remvoeFromFront() {
        if (isEmpty()) {
            return null;
        }
        StudentNode removeNode = head;

        if (head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrevious(null);
        }

        head = head.getNext();
        size--;
        removeNode.setNext(null);
        return removeNode;
    }

    // Removing values from END
    public StudentNode removeFromEnd() {
        if (isEmpty()) {
            return null;
        }
        StudentNode removeNode = tail;
        if (tail.getPrevious() == null) {
            head = null;
        } else {
            tail.getPrevious().setNext(null);
        }

        tail = tail.getPrevious();
        size--;
        removeNode.setPrevious(null);
        return removeNode;
    }

    // Getting the SIZE of the list
    public int getSize() {
        return size;
    }

    // Checking the is EMPTY or not
    public boolean isEmpty() {
        return head == null;
    }

    // Printing the list
    public void printList() {
        StudentNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" <=> ");
            current = current.getNext();
        }
        System.out.println("NULL");
    }

}