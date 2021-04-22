public class EmployeeLinkedList {

	private EmployeeNode head;

	public void addToFront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		node.setEmployeeNode(head);
		head = node;
	}

	public void printList() {
		EmployeeNode current = head;
		System.out.print("HEAD -> ");
		while (current != null) {
			System.out.print(current);
			System.out.print(" -> ");
			current = current.getEmployeeNode();
		}
		System.out.println("NULL");
	}
}
