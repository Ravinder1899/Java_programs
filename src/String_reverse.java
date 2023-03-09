public class String_reverse {
    public static String stringReverse(String str)
    {
        String revStr = "";
        for(int i = 0; i < str.length(); i++)
        {
             revStr = str.charAt(i) + revStr;
        }
        return revStr;
    }

    public static void main(String args[])
    {
        String str = "My name is tina";
        String revStr = stringReverse(str);
        System.out.println(revStr);
    }
}
