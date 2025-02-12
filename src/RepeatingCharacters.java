public class RepeatingCharacters public class RepeatingCharacters {
    public static void main(String[] args) {
        String str = "programming";
        findRepeatingCharacters(str);
    }

    public static void findRepeatingCharacters(String str) {
        char[] chars = str.toCharArray();
        System.out.println("Repeating characters:");

        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    System.out.println(chars[i]);
                    break; // Avoid duplicate prints
                }
            }
        }
    }
}{
}
