final class Cattles{
    public void show(){
        System.out.println("I am a Cattle.");
    }
}

// class Cow extends Cattles{}      final class (Cattles) cannot be extended.

class Honda{
    public void show(){
        System.out.println("I am a Honda Bike");
    }
}

class Bullet extends Honda {
    public void show(){
        System.out.println("I am a Bullet.");
    }
}

public class FinalKeyword {
    @SuppressWarnings("unused")
    public static void main(String args[]){
        final int a = 10;
        // a = 11;   final variable cannot be changed once it declared.

        Bullet obj = new Bullet();
        obj.show();
    }
}
