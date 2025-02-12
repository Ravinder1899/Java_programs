import java.util.HashSet;

public class UniqueCharactersInString {
    public static void main(String[] args) {
        String input = "java programming";
        System.out.println("Unique characters: " + findUniqueCharacters(input));
    }

    public static String findUniqueCharacters(String str) {
        HashSet<Character> seen = new HashSet<>();
        HashSet<Character> unique = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                unique.add(ch);
            } else {
                unique.remove(ch);
            }
        }

        // Convert unique characters back to string
        StringBuilder result = new StringBuilder();
        for (char ch : unique) {
            result.append(ch);
        }

        return result.toString();
    }
}
