package encapsulationpackage;

public class EncapsulationExample {
    private String name;
    private int age;
    

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    public static void main(String[] args) {
        EncapsulationExample obj = new EncapsulationExample();

        // Set data using the setter methods
        obj.setName("John Doe");
        obj.setAge(30);

        // Access data using getter methods
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());

        // Attempting to set age to a negative value
        obj.setAge(-5);
    }
}
