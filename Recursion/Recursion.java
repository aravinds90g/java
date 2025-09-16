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
    
    public static int countVowel(String str){
        if (str.isEmpty() || str == null) {
            return 0;
        }

       char firstChar = Character.toLowerCase(str.charAt(0));

       int count = isVowel(firstChar) ? 1 : 0;

       return count + countVowel(str.substring(1));
      
    }

    public static boolean  isVowel(char c){
        if(c =='a' || c=='e' ||c == 'i' || c=='o' || c=='u'){
           return true;
        }
        return false;
    }

    public static int findMax(int arr[]){
        int max = maxHelper(arr , 0);
        return max;
    }

    public static int maxHelper(int arr[] , int i){
        if (arr.length -1  == i) {
            return arr[i];
        }

        int max = maxHelper(arr,i+1);

        return Math.max(arr[i], max);
    }

    public static boolean linearSearch(int arr[], int target , int i){
          
        if (i == arr.length || i < 0) {
            return false;
        }
        
        if (arr[i] == target) {
            return true;
        }
      
       
        return linearSearch(arr, target, i+1);
        
    }

    public static boolean isSort(int arr[] , int i){
        if (i == arr.length) {
            return true;
        }

        if (arr[i-1] > arr[i]) {
            return false;
        }

        return isSort(arr, i+1);

    }

    

    public static 

    


    public static void main(String[] args) {
        // System.out.println(sumOfFirstNth(5));
        // System.out.println(power(2, 5));

        // System.out.println(countVowel("aeiou"));
        int arr[] = {1,4 , 9 ,8};
        System.out.println(isSort(arr , 1));
    }    
}
