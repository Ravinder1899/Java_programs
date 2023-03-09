public class OverRiding {
    public static void main(String[] args) {
        parent obj = new parent();
        System.out.println(obj.calculate(2, 3));
        System.out.println("***************************************************************");

        child childObj = new child();
        System.out.println(childObj.calculate(2,3));
        System.out.println("***************************************************************");

        parent upcastObj = new child();
        System.out.println(upcastObj.calculate(2, 3));
        System.out.println("***************************************************************");
    }
}

class parent {
    public int calculate(int a, int b) {
        return a + b;
    }
}

class child extends parent {
    public int calculate(int a, int b) {
        return a * b;
    }
}