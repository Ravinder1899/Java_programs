public class ArmstrongNumber {
    public static boolean isArmstrong(int num) {
        int originalNum = num, sum = 0, digits = 0;

        // Count the number of digits
        int temp = num;
        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        // Calculate sum of digits each raised to the power of 'digits'
        temp = num;
        while (temp > 0) {
            int lastDigit = temp % 10;
            sum += Math.pow(lastDigit, digits);
            temp /= 10;
        }

        return sum == originalNum;
    }

    public static void main(String[] args) {
        int num = 153; // Change this number to test
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is NOT an Armstrong number.");
        }
    }
}
