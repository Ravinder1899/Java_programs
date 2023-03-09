public class String_duplicate_characters {
    public static void main(String[] args) {
        String str = "My name is Tina";
        System.out.println(str);
        str = str.toLowerCase();
        int i, j, count;
        char[] arr = str.toCharArray();
        System.out.println("Duplicate characters in the above string : ");
        for (i = 0; i < str.length(); i++) {
            count = 1;
            for (j = i + 1; j < str.length(); j++) {
                if (arr[i] == arr[j] && arr[i] != ' ') {
                    count++;
                    arr[j] = '0';
                }
            }
            if (count > 1 && arr[i] != '0') {
                System.out.print(arr[i] + " ");
            }
        }
    }
}