import java.util.Arrays;
import java.util.List;

class Student{
    private String name;
    private int age;
    public Student() {      //Default Constructor.

    }

    public Student(String name) {
      
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name = " + name + ", age = " + age + "]";
    }
    

    
}

public class MethodReferenceEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Vivek", "Khushi", "Sanika");
        // List<String> Unames = names.stream().map(str -> str.toUpperCase()).toList();     // This will also work.
        

        // Method Reference 
        List<String> Unames = names.stream().map(String :: toUpperCase).toList();    // :: => Method Reference.
        /*  

            Passing method as a parameter to another method, using only class from which the passing method belongs to,
            the method reference operator and the method name only.

        */

        System.out.println(Unames);

        Unames.forEach(System.out :: println);   // for print it'll also work the same.

        // Constructor Reference

        // List<Student> students = names.stream().map(name -> new Student(name)).toList();  // Using Lambda Function.

        List<Student> students = names.stream().map(Student :: new).toList();   // Constructor Reference
        
        System.out.println(students);

    }
}
