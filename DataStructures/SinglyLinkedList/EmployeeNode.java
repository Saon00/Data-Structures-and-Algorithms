public class EmployeeNode {

	private Employee employee;
	private EmployeeNode employeeNode;

	public EmployeeNode(Employee employee) {
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public EmployeeNode getEmployeeNode() {
		return employeeNode;
	}

	public void setEmployeeNode(EmployeeNode employeeNode) {
		this.employeeNode = employeeNode;
	}

	public String toString() {
		return employee.toString();
	}

}
