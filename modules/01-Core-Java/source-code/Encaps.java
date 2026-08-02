class Human {
    private int age;
    private String name;

    public Human(){
        System.out.println("Inside Constructor");  //Every time we create a new object, it'll call the constructor.

        age = 12;
        name = "John";    // Default values of the fields.
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    } 

    public void setAge(int a){
        age = a;
    }

    public void setName(String name){
        this.name = name;                   // this keyword represents the current object 
    }
}

public class Encaps {
    public static void main(String args[]){
        Human h1 = new Human();
        
        // setting(updating) values to the private fields.
        h1.setAge(30);
        h1.setName("Vivek");

        //Accessing values of private feilds.
        System.out.println("Name : " + " " + h1.getName());
        System.out.println("Age : " + " " + h1.getAge());
    }
}
