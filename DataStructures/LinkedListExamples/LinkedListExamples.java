import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExamples {

	public static void main(String[] args) {

		// Initializing Objects
		Employee saonEmployee = new Employee("Saon", "Sikder", 2502);
		Employee sakibEmployee = new Employee("Sakib", "Al Hasan", 2505);
		Employee muazEmployee = new Employee("Md", "Muaz", 2517);
		Employee momenatulEmployee = new Employee("Momenatul", "Islam", 2522);
		Employee anamulEmployee = new Employee("Anamul", "Haq", 2523);

		// Linked List
		LinkedList<Employee> employeeLinkedList = new LinkedList<>();

		// adding objects at the FRONT
		employeeLinkedList.addFirst(saonEmployee);
		employeeLinkedList.addFirst(sakibEmployee);
		employeeLinkedList.addFirst(muazEmployee);
		employeeLinkedList.addFirst(momenatulEmployee);
		employeeLinkedList.addFirst(anamulEmployee);

		// printing output using for each loop
//		for(Employee employee : employeeLinkedList ) System.out.println(employee);

		// printing output using iterator
		System.out.println("Total List -----");
		Iterator<Employee> iterator = employeeLinkedList.iterator();
		System.out.print("HEAD -> ");
		while (iterator.hasNext()) {
			System.out.print(iterator.next());
			System.out.print(" <=> ");
		}
		System.out.println("NULL");
		// printing the List size
		System.out.println("List's Size: " + employeeLinkedList.size());

		// adding a new object at the END
		Employee ataurEmployee = new Employee("Ataur", "Rahman", 2532);
		employeeLinkedList.addLast(ataurEmployee);
//		employeeLinkedList.add(ataurEmployee); // both add() and addLast() is same.

		// printing output using iterator
		System.out.println("Added new value -> END -----");
		iterator = employeeLinkedList.iterator();
		System.out.print("HEAD -> ");
		while (iterator.hasNext()) {
			System.out.print(iterator.next());
			System.out.print(" <=> ");
		}
		System.out.println("NULL");

		// printing the List size
		System.out.println("List's Size: " + employeeLinkedList.size());

		// removing any value from FIRST
		employeeLinkedList.removeFirst();

		// printing output using iterator
		System.out.println("Removed value -> FIRST -----");
		iterator = employeeLinkedList.iterator();
		System.out.print("HEAD -> ");
		while (iterator.hasNext()) {
			System.out.print(iterator.next());
			System.out.print(" <=> ");
		}
		System.out.println("NULL");

		// printing the List size
		System.out.println("List's Size: " + employeeLinkedList.size());

		// removing any value from LAST
		employeeLinkedList.removeLast();

		// printing output using iterator
		System.out.println("Removed value -> LAST -----");
		iterator = employeeLinkedList.iterator();
		System.out.print("HEAD -> ");
		while (iterator.hasNext()) {
			System.out.print(iterator.next());
			System.out.print(" <=> ");
		}
		System.out.println("NULL");

		// printing the List size
		System.out.println("List's Size: " + employeeLinkedList.size());

	}
}
