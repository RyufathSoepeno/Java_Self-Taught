public class Java_Ten_If_Statements {
    public static void main(String[] args){
        int income = 12000;

        // int, double, boolean, cannot belong to an if statement,
        //Or not it will cause error because the variable don't appear outside, only the if statement
        //And a method inside an if statement cannot print an answer

        boolean HasHighIncome = false;
        if(income > 8000){
            HasHighIncome = true;
            // When if statement is correct, it will be the confirmed output
        }
        System.out.println(HasHighIncome);
        // Booleans don't need and else clause, because they will work, only two obvious outputs

        //OR FOR A MORE EASIER METHOD

        boolean HASHIGHINCOME = income > 7000;
        System.out.println(HASHIGHINCOME);
    }
}
