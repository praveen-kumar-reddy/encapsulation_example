package encapsulationpackage;

public class encap {
	private int num;
	private String name;
	private String role;
//getter method
	public String getname() {
		return name;
	}
//setter method
	public void setname(String name) {
		this.name = name;
	}
//getter method
	public int getnum() {
		return num;
	}
//setter method
	public void setnum(int num) {
		this.num = num;
	}
//getter method
	public String getrole() {
		return role;
	}
//setter method
	public void setrole(String role) {
		this.role = role;
	}

	public static void main(String[] args) {

		encap obj = new encap();
		obj.setname("praveen");
		obj.setrole("39");
		obj.setnum(10);

		System.out.println("Name:" + obj.getname());
		System.out.println("number:" + obj.getnum());
		System.out.println("roll number:" + obj.getrole());
	}

}
