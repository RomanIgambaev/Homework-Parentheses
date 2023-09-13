import java.util.Scanner;

public class Main {
    static boolean chekingValidParentheses(String s) {
        int left = 0;
        int right = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                left++;
            } else if (c == ')') {
                right++;
            } else {
                System.out.println("Можно вводить только скобки");
                continue;
            }

            if (right > left || right < left) {
                return false;
            }
        }

        return left == right;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку с круглыми скобками: ");
        String input = scanner.nextLine();
        boolean isValid = chekingValidParentheses(input);
        System.out.println("Результат проверки: " + isValid);
    }
}
