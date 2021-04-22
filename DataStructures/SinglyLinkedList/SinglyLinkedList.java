public class SinglyLinkedList {

	public static void main(String[] args) {

		// Initializing Objects
		Employee saonEmployee = new Employee("Saon", "Sikder", 2502);
		Employee sakibEmployee = new Employee("Sakib", "Al Hasan", 2505);
		Employee muazEmployee = new Employee("Md", "Muaz", 2517);
		Employee momenatulEmployee = new Employee("Momenatul", "Islam", 2522);
		Employee anamulEmployee = new Employee("Anamul", "Haq", 2523);
		
		// Adding Values to front
		EmployeeLinkedList employeeLinkedList = new EmployeeLinkedList();
		employeeLinkedList.addToFront(saonEmployee);
		employeeLinkedList.addToFront(sakibEmployee);
		employeeLinkedList.addToFront(muazEmployee);
		employeeLinkedList.addToFront(momenatulEmployee);
		employeeLinkedList.addToFront(anamulEmployee);

		employeeLinkedList.printList();

	}
}
