import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class ParallelStreams {
    public static void main(String[] args) {
        int size = 10_000;
        Random ran = new Random();
        List<Integer> nums = new ArrayList<>(size);

        for (int i = 1; i <= size; i++) {
            nums.add(ran.nextInt(100)); // should have to specify the upper bound.
        }

        Long seqStart = System.currentTimeMillis();
        int sum1 = nums.stream().map(n -> n * 2).mapToInt(n -> n).sum();
        System.out.println("Seq sum : " + sum1);
        Long seqEnd = System.currentTimeMillis();

        Long ParStart = System.currentTimeMillis();
        int sum2 = nums.parallelStream().map(n -> n * 2).mapToInt(n -> n).sum();
        System.out.println("Par sum : " + sum2);

        Long ParEnd = System.currentTimeMillis();

        System.out.println("Seq : " + (seqEnd - seqStart));
        System.out.println("Par : " + (ParEnd - ParStart));

    }
}