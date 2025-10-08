package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Recursion {

    public static int fibonacci(int n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static int sumOfFirstNth(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOfFirstNth(n - 1);
    }

    public static int power(int x, int n) {
        if (n == 1)
            return x;

        return x * power(x, n - 1);
    }

    public static int countVowel(String str) {
        if (str.isEmpty() || str == null) {
            return 0;
        }

        char firstChar = Character.toLowerCase(str.charAt(0));

        int count = isVowel(firstChar) ? 1 : 0;

        return count + countVowel(str.substring(1));

    }

    public static boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }

    public static int findMax(int arr[]) {
        int max = maxHelper(arr, 0);
        return max;
    }

    public static int maxHelper(int arr[], int i) {
        if (arr.length - 1 == i) {
            return arr[i];
        }

        int max = maxHelper(arr, i + 1);

        return Math.max(arr[i], max);
    }

    public static boolean linearSearch(int arr[], int target, int i) {

        if (i == arr.length || i < 0) {
            return false;
        }

        if (arr[i] == target) {
            return true;
        }

        return linearSearch(arr, target, i + 1);

    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static boolean isSort(int arr[], int i) {
        if (i == arr.length) {
            return true;
        }

        if (arr[i - 1] > arr[i]) {
            return false;
        }

        return isSort(arr, i + 1);

    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static int subSequence(int[] arr, List<Integer> list, int index, int n , int count , int target) {
        if (index == n) {
            int sum = 0;
            for(int i : list){
               sum += i;
            }

            if(sum == target ){
                count++;
                // System.out.println("count --> " + count);
                return 1;
            }

            return 0;

        }

        list.add(arr[index]);
       int count1 = subSequence(arr, list, index + 1, n , count,target);
        list.remove(list.size() - 1);
        int count2 =   subSequence(arr, list, index + 1, n , count,target);

        return count1 + count2;
    }
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        findSubSet(0 , arr , ans , 0);

        return ans;
    }

    public static void findSubSet(int index, int arr[], ArrayList<Integer> ans, int sum) {
        if (index == arr.length) {
            ans.add(sum);
            return;
        }

        findSubSet(index + 1, arr, ans, sum);
        findSubSet(index + 1, arr, ans, sum + arr[index]);


    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        findSubSets(0 , nums , ans , ds);
        return ans;
    }

    public static void findSubSets(int index , int arr[] , List<List<Integer>> ans , List<Integer> ds ){
         if(index == arr.length){
            ans.add(new ArrayList<>(ds));
            return;
         }

         ds.add(arr[index]);
         findSubSets(index + 1 , arr , ans , ds);
         ds.remove(ds.size()-1);
         findSubSets(index +1 , arr ,ans ,ds);
    }
 
     
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    public static List<List<Integer>> combinationSum3(int len, int target) {
         List<List<Integer>> ans = new ArrayList<>();
         List<Integer> ds = new ArrayList<>();

         findCombinationSum(1,target , len ,ans , ds);
         return ans;
    }

    public static void findCombinationSum(int index,  int target , int len , List<List<Integer>> ans , List<Integer> ds ){
        if(target == 0 && ds.size() == len){
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        if (index > 9 || target < 0 || ds.size() > len)
            return;

        ds.add(index);
        findCombinationSum(index+1,  target - index, len, ans, ds);
        ds.remove(ds.size() -1);
        findCombinationSum(index+1, target  , len, ans, ds);
    }




    public static void main(String[] args) {
      int arr[] = { 1, 2, 2};
      List<List<Integer>> ls = new ArrayList<>();

      ls = combinationSum3(3 , 9);
      System.out.println(ls);
    }
}
