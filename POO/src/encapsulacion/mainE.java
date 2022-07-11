package encapsulacion;

public class mainE {
	 public static void main(String[] args) {
		 
		 Empleado emp = new Empleado();
		 emp.setName("TEST");
		 emp.setOcupation("admin");
		 System.out.println(emp.getName());
		 System.out.println(emp.getOcupation());
	 }
}
