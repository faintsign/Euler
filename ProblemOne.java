/*
    File: ProjectOne.java
    Project: Euler
    Data:   03.28.22
    Author: FaintSign

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
      System.out.println(sumOfMultiples(1000));
    }
}