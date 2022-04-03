/*
    File: ProblemTwo.java
    Project: Euler
    Date: 03/30/22
    Author: FaintSign
    
    Description:
    Calculate the sum of the even fibonacii numbers
*/ 

public class problemTwo {
    
    public static int fibonaciiSum(int N){
        int sum = 0; // -> The number of even numbers
        int firstTerm = 0; // -> The first term starting at 0
        int secondTerm = 1; // -> The second term starting at 1

        while(firstTerm <= N ){
            
            int fibonaciiTerm = firstTerm + secondTerm; // -> The sum of the first and second terms

            // The first term will be equal to the second term
            // The second term will now be equal to the fibonacii term
            firstTerm = secondTerm;
            secondTerm = fibonaciiTerm;

            if(fibonaciiTerm % 2 == 0){
                sum+= fibonaciiTerm;
            }
        }

        return sum;
    }

    public static void main(String[] args){

        final int MAX_NUMBER = 4000000;
        System.out.println(fibonaciiSum(MAX_NUMBER));

    }
    
}
