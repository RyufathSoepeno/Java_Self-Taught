public class Java_Seven_Arithmetic_Expressions {
    public static void main(String[] args){
        // main method only works when you put the bracket, otherwise it wont yellow
        int result = 10 + 3;
        System.out.println(result);
        //You need to convert to float to see remainders, because java sees it as a whole number
        double result_2 = (double)10 / (double)3;
        System.out.println(result_2);
        // Numbers done in an operation is called Operands
        //(Conversion_Method) int
        int key = 7;
        int y = key++;
        System.out.println(y);
        System.out.println(key);

        int row = 7;
        int x = ++row;
        System.out.println(x);
        System.out.println(row);

        int groove = 7;
        groove += 3;
        groove += 3;
        System.out.println(groove);

        double a = 1.1;
        double b = a + 8;
        System.out.println(b);
    }
}
