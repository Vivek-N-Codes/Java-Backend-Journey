class Mobile{
    private String Brand;
    private int prize;
    static String type;

    public Mobile(){
        Brand = "";
        prize = 1000;
        System.out.println("Inside Constructor.");
    }

    static{
        type = "smartphone";
        System.out.println("Inside static block.");
    }

    public void set(String Brand, int prize){
        this.Brand = Brand;
        this.prize = prize;
    }

    public String getBrand(){
        return this.Brand;
    }

    public int getPrize(){
        return this.prize;
    }

    public static void show(Mobile obj){      //can be accessed by class name & can't use non-static variables directly. (can use with object)
        System.out.println(obj.Brand + " " + obj.prize);
    }
}

class A{
    public A(){
        System.out.println("Inside A's Constructor.");
        System.out.println("Object created.");
    }

    public void show(){
        System.out.println("Inside Method of class A.");
    }
}

public class StaticM {
    public static void main(String [] args){
        Mobile obj1 = new Mobile();
        Mobile obj2 = new Mobile();
        obj1.set("Apple", 1500);
        obj2.set("Samsung", 1700);

        System.out.println("1: " + obj1.getBrand() + " " + obj1.getPrize());
        System.out.println("2: " + obj2.getBrand() + " " + obj2.getPrize());

        Mobile.show(obj1);
        Mobile.show(obj2);

        try {
            Class.forName("Mobile");  //Loads class & static block of the class at runtime even if object is not created.
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Mobile class could not be loaded", e);
        }

        new A(); // create object without refference variable (name). => Anonymous object.
        // We cant use the Anonymous object again, but we can use it to call a method of class.
        new A().show();
    }
}
