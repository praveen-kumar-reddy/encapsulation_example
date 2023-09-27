package encapsulationpackage;

public class EncapsulationWithStaticExample {
    private static int staticCounter;  // static variable

    private String name;

    public EncapsulationWithStaticExample(String name) {
        this.name = name;
        staticCounter++;  // Increment the static counter for each instance created
    }

    public String getName() {
        return name;
    }
    public static void setstaticCounter(int   value) {
    	staticCounter=value;
    }

    public static int getStaticCounter() {
        return staticCounter;
    }
    

    public static void main(String[] args) {
        EncapsulationWithStaticExample obj1 = new EncapsulationWithStaticExample("praveen kumar reddy");
        EncapsulationWithStaticExample obj2 = new EncapsulationWithStaticExample("Bobby");

        System.out.println("Name of obj1: " + obj1.getName());
        System.out.println("Name of obj2: " + obj2.getName());
        
        EncapsulationWithStaticExample.setstaticCounter(25);
        System.out.println("Static counter: " + EncapsulationWithStaticExample.getStaticCounter());
    }
}

