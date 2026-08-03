/*
    sealed 
    non-sealed
    final
*/

sealed class A extends Thread implements Cloneable permits B, C{  // A class can extend other class, can implements interfaces and permits subclasses at a time.

}

non-sealed class B extends A{  // subclass should be final, sealed or non-sealed.

}

final class C extends A{

}

// class D extends A {}    // Not valid since D is not permitted to extend A.

class D extends B {}   // B shouldn't be final in order to extend it, so make it non-sealed or make it sealed and permits the extending classes.


// For interfaces => only sealed, non-sealed works.
//Interfaces cannot be final.

sealed interface X permits Y {

}
non-sealed interface Y extends X{

}
public class SealedClasses {
    public static void main(String[] args) {
        
    }
}
