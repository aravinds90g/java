import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class Code {

   // public static List<Integer> searchInSortedArray(int arr[] , int q[]){
   // List<Integer> list = new ArrayList<>();
   // for(int i=0; i<q.length; i++){
   // if(binarySearch(arr, q[i])){
   // list.add(1);
   // }else{
   // list.add(0);
   // }
   // }

   // return list;
   // }

   // public static boolean binarySearch(int arr[], int target){
   // int left = 0;
   // int right = arr.length - 1;
   // while (left<=right) {
   // int mid = left + (right - left) /2;
   // if(arr[mid] == target){
   // return true;
   // }else if( arr[mid] < target){
   // left = mid+1;
   // }else {
   // right = mid-1;
   // }
   // }

   // return false;
   // }

   // public static int monotoneIncreasingDigits(int m) {
   // char ch[] = Integer.toString(m).toCharArray();
   // int n = ch.length;
   // int marker = n;

   // for (int i = n - 1; i > 0; i--) {
   // if (ch[i] < ch[i - 1]) {
   // marker = i;
   // ch[i - 1]--;
   // }
   // }
   // for (int i = marker; i < n; i++) {
   // ch[i] = '9';
   // }

   // return Integer.parseInt(new String(ch));
   // }

   // private static List<List<Integer>> pairSum(int[] arr, int s) {
   //    List<List<Integer>> ans = new ArrayList<>();
   //    HashMap<Integer, Integer> map = new HashMap<>();

   //    for (int i = 0; i < arr.length; i++) {
   //       int sum = s - arr[i];
   //       if (map.containsKey(sum)){
   //          List <Integer> vaList = new ArrayList<>();
   //          vaList.add(arr[i]);
   //          vaList.add(sum);
   //          ans.add(vaList);
   //       }
   //       map.put(arr[i], i);
             
   //    }

   //    return ans;
   // }

   public static void changeCase(StringBuffer str) {
      
      for (int i = 0; i < str.length(); i++) {
         char currentCher = str.charAt(0);

         if (Character.isUpperCase(currentCher)) {
            str.setCharAt(i, Character.toLowerCase(currentCher));
         } else if(Character.isLowerCase(currentCher)){
            str.setCharAt(i, Character.toUpperCase(currentCher));
         }
      }

      System.out.println(str.toString());
   }

   public static int divide(int dividend, int divisor) {
      if (dividend == Integer.MIN_VALUE && divisor == -1) {
         return Integer.MAX_VALUE; 
      }

      int ans = dividend / divisor;

      return ans;
   }
  
  public static void sort(Stack<Integer> stack){
      if (stack.isEmpty()) {
         return;
      }

      int temp = stack.pop();
      sort(stack);

      insertElement(stack , temp);
  }

  public static void insertElement(Stack<Integer> stack , int temp){
      if( stack.isEmpty() || stack.peek() < temp  ){
         stack.push(temp);
         return;
      }

      int elem = stack.pop();
      insertElement(stack, temp);

      stack.push(elem);
  }
  

  public static void reverseStack(Stack<Integer> stack ){

     if (stack.isEmpty()) {
       return;
     }
      int top = stack.pop();
      reverseStack(stack);

      insertElementAtBottom(stack , top);
  }

  public static void insertElementAtBottom(Stack<Integer> stack , int temp){
        if(stack.isEmpty()){
          stack.push(temp);
          return;
        }

        int top = stack.pop();
        insertElementAtBottom(stack, temp);
        stack.push(top);
  }

   public static void main(String[] args) {
      int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    
      // System.out.println(value);
      // System.out.println(divide(-2147483648, -1));

      Stack<Integer> stack = new Stack<>();

      stack.push(5);
      stack.push(99);
      stack.push(45);
      stack.push(576);
      stack.push(53);
      stack.push(566);
      sort(stack);
      reverseStack(stack);
      System.out.println(stack);

   }

}
