public class Java_Six_Casting {
    public static void main(String[] args){
        short x = 1;
        int y = x + 2;
        System.out.println(y);

        //Short is a smaller byte method that is compatible with integers
        // Java reads x first then goes to integer 2 in operator
        // 2 = integer

        //Implicit Casting = Automatic conversion
        // > = Converted (In slash quotes only, not in real code)
        // byte > short > int > long > float > double
        // ^Conversions can only be done compatibly, like this one^
        // Implicit Casting happens whenever you're not gonna lose data

        double a = 1.1;
        int b = (int) a + 8;
        System.out.println(b);

        //What if it is not compatible?
        String w = "1";
        int l = Short.parseShort(w);
        int q = Integer.parseInt(w);

        int total = l + q;
        System.out.println(total);

        // Almost all Java frameworks, results strings for numerical representations
        //That is why converting it is important

    }
}
