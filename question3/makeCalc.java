package question3;

public class makeCalc {
    public static void main(String[] args) {

        ///this will use the two integers in the 7th line and print out the answers when using the operations
        calculator solve = new calculator(600,6);
        System.out.println("The answer when added is : " + solve.addition());

        System.out.println("-----------------------------------");

        System.out.println("The answer when subtracted is : " + solve.subtract());

        System.out.println("-----------------------------------");

        System.out.println("The answer when multiplied is : " + solve.multiply());

        System.out.println("-----------------------------------");

        System.out.println("The answer when divided is : " + solve.divide());

    }
}
