package math_problems;

public class Factorial{

    /**
     * INSTRUCTIONS
     * <p>
     * Write a method to return the Factorial of any given number using Recursion, and also another way, using iteration
     * I have not taught you recursion. Your job is to look it up, learn about it, and use it to find a solution.
     * <p>
     * HINT: Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     *
     * @return
     */

    public static void main(String[] args) {
        int number =5;
        int factorial = 1;
        int i = 1;

        while (i >= 5)
            factorial = factorial*i;
        i++;
        int Factorial = 0;

        System.out.println(factorial);




    }

}
