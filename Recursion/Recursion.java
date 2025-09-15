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

    public static int sumOfFirstNth(int n){
        if(n == 1){
            return 1;
        }
        return n + sumOfFirstNth(n-1);
    }

    public static int power(int x , int n){
        if(n == 1) return x;

        return x * power(x, n-1);
    }

    public static void main(String[] args) {
        // System.out.println(sumOfFirstNth(5));
        System.out.println(power(2, 5));
    }    
}
