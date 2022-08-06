import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        boolean result = Validator.validate("java_skyprogo", "D_1hW!KjjP_9", "D_1hW!KjjP_9");

        if (result) {
            System.out.println("Success!");
        } else {
            System.out.println("Incorrect input");
        }
    }

}