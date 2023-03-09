import java.util.*;

public class Reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number you want to reverse");
        int num = sc.nextInt();
        int temp = num;
        int rev = 0, ld;
        while (temp != 0) {
            ld = temp % 10;
            rev = (rev * 10) + ld;
            temp = temp / 10;
        }
        System.out.println("Reverse of " + num + "is " + rev);
    }
}
