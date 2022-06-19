import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        String text = "аббб енвотао пвоотф фывв абв абв";
        Function<String, List<String>> function = generateDictionary(text);
        System.out.println(function.apply(text));
    }

    public static Function<String, List<String>> generateDictionary(String text) {
        return x -> Arrays.stream(text.split(" "))
                .sorted()
                .distinct()
                .collect(Collectors.toList());
    }
}
