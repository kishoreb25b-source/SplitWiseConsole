package SplitWiseConsole;

class Main{


    // SplitWiseConsole.Main Method=>java start from main
    public static void main(String[] args) {
        //VARIABLE
        final String REASON_EXPENSE="Dinner";
        final double TOTAL_AMOUNT=1200;
        final int Total_Person=4;
        final double SHARE_PER_PERSON;

        System.out.println("=== SplitWise-Console ===");
        System.out.println("Reason for the Expense:"+REASON_EXPENSE);
        System.out.println("Number Person in Expense:" +Total_Person);
        System.out.println("Total Amount in Expanse:" +TOTAL_AMOUNT);

        //LOGIC
        SHARE_PER_PERSON=TOTAL_AMOUNT/Total_Person;
        System.out.println("The Share Per Person:"+SHARE_PER_PERSON);

        System.out.println("=== Thanks for coming ===");
    }
}