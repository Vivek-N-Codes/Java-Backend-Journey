enum Status{        // It is a class.
    Running, failed, pending, success;  // This are objects and said to be Named Constants.
}

enum Laptop{
    macBook(2000), XPS(2200), Surface(1500), Thinkpad(1800), Lenovo;

    private int price;

    private Laptop(int price){  // Constrctor of enum should always private as we create object of enum within it (i.e. same class) only.
        this.price = price;
    }

    
    private Laptop() {   //Default constructor.
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

}

public class Enumeration {
    public static void main(String[] args) {
        Status s = Status.Running;
        System.out.println(s.ordinal());   // Will print the index of Running i.e. 0.

        Status ss[] = Status.values(); // In-built method to access all Status in an array.
        
        switch(s){
            case Running:
                System.out.println("All Good.");
                break;
            case failed:
                System.out.println("Try Again.");
                break;
            case pending:
                System.out.println("Please wait");
                break;
            default:
                System.out.println("Done.");
                break;
        }

        // Laptop lap = Laptop.macBook;
        // System.out.println(lap + " : " + lap.getPrice() + "$");

        for(Laptop laps : Laptop.values()){
            System.out.println(laps + " : " + laps.getPrice() + "$");
        }
        
        Laptop laps = Laptop.Lenovo;  // Will be the object with no prize since it calling the default constructor; 
    }
}
