package encapsulationpackage;

public class StringEncapsulationExample {
    private static String name;
    private static int Age;
    private static String batchyear;

    public static void setname(String value) {
        name = value;
    }

    public static String getname() {
        return name;
    }
    public static void setbatchyear(String value) {
        batchyear = value;
    }
    public static String getbatchyear() {
        return batchyear;
    }
    public static void setAge(int newAge) {
        Age = newAge;
    }
 
    public static int getAge() {
        return Age;
    }
    


    public static void main(String[] args) {
        // Set the private string
        setname("praveen kumar reddy");
        setbatchyear("20");
        setAge(3);
        // Access the private string
        String retrievedString = getname();
        System.out.println("full name : " + retrievedString);
        System.out.println("batchyear in school:"+getbatchyear());
        System.out.println("student age:"+getAge());
    }
}

 