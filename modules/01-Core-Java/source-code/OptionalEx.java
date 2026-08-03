import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Vivek", "Khushi", "Sanika");
        Optional<String> name = names.stream().filter(str -> str.contains("K")).findFirst();
        System.out.println(name.orElse("Not Found"));

        // Another way

        String str = names.stream().filter(s -> s.contains("V")).findFirst().orElse("Not Found");
        System.out.println(str);
    }
}
