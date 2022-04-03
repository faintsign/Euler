/*
    File: ProjectOne.java
    Project: Euler
    Data:   03.28.22
    Author: FaintSign

    Description:
    Outputs the sum up to and including a number N that are the multiples of 3 or 5
    For example if N = 10, print the sum of numbers that are multiples of 3 or 5 starting from [1,10]
*/

public class ProblemOne {
    
    public static int sumOfMultiples(int N){
        if(N < 0){
            throw new IllegalArgumentException();
        }
        
        int sum = 0;
        
        for(int i = 1; i <= N - 1; i++){
            if(i % 3 == 0 || i % 5 == 0){
                sum += i;
            }
        }
        
        return sum;
    }
    public static void main(String args[]) {
        try{
            System.out.println(sumOfMultiples(1000));

        }catch(IllegalArgumentException e){
            System.out.println("Please enter a positive number");

        }
    }
}