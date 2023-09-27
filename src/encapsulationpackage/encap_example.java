package encapsulationpackage;

public class encap_example {
	private static int number;
	private static String name;
	private static String batchnumber;

	// setter method
	public static void setnumber(int value) {
		number = value;
	}

	// getter method
	public static int getnumber() {
		return number;
	}

	// setter method
	public static void setname(String value) {
		name = value;
	}

	// getter method
	public static String getname() {
		return name;
	}

	// setter method
	public static void setbatchnumber(String value) {
		batchnumber = value;
	}

	// getter method
	public static String getbatchnumber() {
		return batchnumber;
	}

	public static void main(String[] args) {
		// calling setter method
		encap_example.setbatchnumber("2010");
		encap_example.setnumber(25);
		encap_example.setname("praveen kumar reddy");

		String people = getname();
//print the getter methods (or) values
		System.out.println("full name: " + people);
		System.out.println("school number: " + encap_example.getnumber());
		System.out.println("batchnumber: " + encap_example.getbatchnumber());

	}
}
