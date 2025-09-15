package Recursion;




public class Recursion {


    public static int fibonacci(int n) {
       
        if (n == 0) {
            return 0;
        }
        if(n == 1){
            return 1;
        }

        return fibonacci(n-1) + fibonacci(n - 2);
    }

    public static int factorial(int n){
        if(n == 1){
            return 1;
        }

        return n*factorial(n-1);
    }

    

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }    
}
