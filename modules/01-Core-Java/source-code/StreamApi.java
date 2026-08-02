// import java.io.Console;
import java.util.ArrayList;
import java.util.List;
// import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> Li = new ArrayList<>();
        Li.add(1);
        Li.add(2);
        Li.add(3);
        Li.add(4);
        Li.add(5);
        Li.add(6);

        //forEach() method

        Li.forEach(n -> System.out.print(n + " "));   // this is the contracted version

        //Working :

        // Consumer<Integer> con = new Consumer<Integer>() {
        //     public void accept(Integer n){
        //         System.out.print(n + " ");
        //     }
        // }; 
        // Li.forEach(con);

        // Consumer<Integer> con = n -> System.out.print(n + " ");   //Using Lambda function

        System.out.println();  //New line.

        // Stream :-
        Stream<Integer> s1 = Li.stream();    // Can use this only once.
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);                            //filter 
        // s2.forEach(n -> System.out.print(n + " "));   // We can use a stream only once.
        Stream<Integer> s3 = s2.map(n -> n*2);                                      //map
        // s3.forEach(n -> System.out.print(n + " "));
        int result = s3.reduce(0, (c, e) -> c + e);                       //reduce
        System.out.println(result);

        // int res = Li.stream().filter(n -> n % 2 == 0).map(n -> n * 2).reduce(0, (c, e) -> c + e);     //One liner for the all above stuff.
    }
}
