// We will use Annotations like this in frameworks like Hibernate and Spring Boot
@Deprecated
class Abc{
    @Deprecated
    public void showTheDataBelongsToThisClassOnly(){
        System.out.println("In a Abc class.");
    }
}

@SuppressWarnings("deprecation")
class Bcd extends Abc{
    @Override       // shows Bugs (Logical Errors) at compile time.
    public void showTheDataBelongsToThisClassOnly(){ 
        System.out.println("In a Bcd class.");
    }
}
public class Annotations {
    public static void main(String[] args) {
        Bcd b = new Bcd();
        b.showTheDataBelongsToThisClassOnly();
    }
}
