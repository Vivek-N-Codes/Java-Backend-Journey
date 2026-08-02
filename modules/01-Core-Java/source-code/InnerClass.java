class A{
    public void show(){
        System.out.println("In a Show.");
    }
    class Bin{
        public void config(){
            System.out.println("In a Config.");
        }
    }
    static class Cin{
        public void run(){
            System.out.println("Running Cin...");
        }
    }
}

class Animal{
    public void show(){
        System.out.println("In a Jungle.");
    }
}

abstract class India{
    public abstract void show();
}
public class InnerClass {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        // Bin obj1 = new Bin();   // Can not create object of Inner class directly.
        A.Bin obj1 = obj.new Bin();   // Valid syntax

        A.Cin obj2 = new A.Cin();      // No need of object to get instantiate for Static class, only outer class name is enough.

        Animal lion = new Animal(){       // Anonymous class.
            public void show(){
                System.out.println("In a Jungle of Lion.");
            }
        };
        lion.show();

        India india = new India() {    // Anonymous + Abstract class.
            public void show(){
                System.out.println("India is Great.");
            }
        };
    }
}
