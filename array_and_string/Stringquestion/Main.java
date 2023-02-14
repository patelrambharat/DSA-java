import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sample input in camel case, kebab-case, snake_case or Pascal case: ");
        String input = scanner.nextLine();
        String output = "";
        if (input.contains("_")) {
            String[] words = input.split("_");
            for (String word : words) {
                output += word.substring(0, 1).toUpperCase() + word.substring(1);
            }
        } else if (input.contains("-")) {
            String[] words = input.split("-");
            for (String word : words) {
                output += word.substring(0, 1).toUpperCase() + word.substring(1);
            }
        } else if (input.matches("[a-z]+([A-Z][a-z]+)+")) {
            String[] words = input.split("(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])");
            for (String word : words) {
                output += word.substring(0, 1).toUpperCase() + word.substring(1);
            }
        } else {
            output = input;
        }
        System.out.println("Output in Pascal case: " + output);
    }
}
