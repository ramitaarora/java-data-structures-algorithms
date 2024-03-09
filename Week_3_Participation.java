import java.util.Stack;

public class Week_3_Participation {

    public static String ReverseString(String str) {
        char[] reverseString = new char[str.length()];
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        int j = 0;
        while (!stack.isEmpty()) {
            reverseString[j++] = stack.pop();
        }

        return new String(reverseString);
    }

    public static void main(String[] args) {
        System.out.println(ReverseString("pcc"));
    }
}
