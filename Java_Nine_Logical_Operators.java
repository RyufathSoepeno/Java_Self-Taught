public class Java_Nine_Logical_Operators {
    public static void main(String[] args){
        //And Operator
        int temp = 22;
        boolean isWarm = temp > 20;
        boolean isWarm_2 = temp > 20 && temp < 30;
        System.out.println(isWarm_2);
        System.out.println(isWarm && isWarm_2);

        //Or Operator
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean isEligible = hasHighIncome || hasGoodCredit;
        System.out.println(isEligible);

        int FirstYearChoice = 30;
        int SecondYearChoice = 33;
        // Always start from left of the Or operator
        boolean AnyAreTrue = FirstYearChoice > 31 || SecondYearChoice > 31;
        System.out.println(AnyAreTrue);

        //Not operator
        //To reverse a value
        boolean Franklin = true;
        boolean Michael = false;
        boolean Trevor = false;
        //We can make order of operations
        boolean AreAllIn = (Franklin || Trevor) && ! Michael;
        boolean buddies = Franklin && ! Michael;
        System.out.println(AreAllIn);
        System.out.println(buddies);
    }
}