public class OverLoading {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static String print(String str) {
        return str;
    }

    public static String print(String str1, String str2, String str3) {
        return str1 + " " + str2 + " " + str3;
    }

    public final String finalFunc(String str) {
        return str;
    }

    public final String finalFunc(String str1, String str2) {
        return str1 + " " + str2;
    }

    // Overloaded main function
    public static String main(String str) {
        return str;
    }

    public static void main(String args[]) {
        OverLoading obj = new OverLoading();
        System.out.println(OverLoading.add(2, 3));
        System.out.println(OverLoading.add(2, 3, 4));
        System.out.println("**********************************************************");

        System.out.println(OverLoading.print("Hello"));
        System.out.println(OverLoading.print("Hello", "john", "!!"));
        System.out.println("**********************************************************");

        System.out.println(obj.finalFunc("I am in overloaded final function"));
        System.out.println(obj.finalFunc("Hello i am John","from overloaded final function"));
        System.out.println("**********************************************************");

        System.out.println(OverLoading.main("Hi i am in overloaded main function"));
    }

}