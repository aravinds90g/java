import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Array {
  // public static int findSecondLargestElement(int[] arr){
  // int largest = arr[0];
  // int secondLargest = -1;
  // for(int i=0;i<arr.length;i++){
  // if(largest<arr[i]){
  // largest = arr[i];
  // }
  // }
  // for(int i=0;i<arr.length;i++){
  // if(largest>arr[i]&& arr[i]>secondLargest){
  // secondLargest=arr[i];
  // }
  // }
  // return secondLargest;
  // }

  // public static int findSecondLargestElement(int[] arr){
  // int largest = arr[0];
  // int secondLargest=0;

  // for(int i=0; i<arr.length;i++){
  // if(arr[i]>largest){
  // secondLargest = largest;
  // largest = arr[i];
  // }
  // if(secondLargest < arr[i] && largest>arr[i]) secondLargest = arr[i];
  // };
  // return secondLargest;
  // }

  // public static int findSecondSmallest(int[] arr){
  // int smallest = Integer.MAX_VALUE;
  // int secondSmallest = Integer.MAX_VALUE;
  // for(int i=0;i<arr.length; i++){
  // if(arr[i]<smallest){
  // secondSmallest = smallest;
  // smallest = arr[i];
  // }
  // if(secondSmallest > arr[i] && arr[i] > smallest) secondSmallest = arr[i];
  // }
  // return secondSmallest;
  // }

  // private static boolean ifSorted(int[] arr) {
  // for(int i=0; i<arr.length-1;i++){
  // if(arr[i]>arr[i+1]){
  // return false;
  // }
  // }

  // return true;
  // }

  // public static void leftRotate(int[] arr){
  // int rotate = arr[0];

  // for(int i=1;i<arr.length;i++){
  // arr[i-1] = arr[i];
  // }
  // arr[arr.length-1] = rotate;
  // }

  // public static void reverse(int[] arr, int low , int high) {

  // while (low<high) {
  // int temp = arr[low];
  // arr[low] = arr[high];
  // arr[high] = temp;
  // low++;
  // high--;
  // }
  // }

  // private static void leftRotateDthPlaces(int[] array,int d) {
  // reverse(array, 0, d-1);
  // reverse(array, d, array.length-1);
  // reverse(array, 0, array.length-1);
  // }

  // public static void leftRotate(int[] arr, int d) {
  // int n = arr.length;
  // ArrayList<Integer> temp = new ArrayList<>();
  // d = d % n;
  // for (int i = n-d; i < n; i++) {
  // temp.add(arr[i]);
  // }
  // for (int i = n - d - 1; i >= 0; i--) {
  // arr[i + d] = arr[i];
  // }

  // for (int i = 0; i < d; i++) {
  // arr[i] = temp.get(i);
  // }
  // }

  // public static int linerSearch(int[] arr, int target){
  // for(int i=0; i<arr.length;i++){
  // if(arr[i]==target){
  // return i;
  // }
  // }
  // return -1;
  // }

  // public static ArrayList<Integer> findUnion(int arr1[], int arr2[])
  // {
  // HashMap<Integer,Integer> freq =new HashMap<>();
  // ArrayList<Integer> unionArray = new ArrayList<>();

  // for(int i=0; i<arr1.length;i++){
  // freq.put(arr1[i],freq.getOrDefault(arr1[i],0)+1);
  // }

  // for(int i=0; i<arr2.length;i++){
  // freq.put(arr2[i], freq.getOrDefault(arr2[i], 0)+1);
  // }

  // for(int it : freq.keySet()){
  // unionArray.add(it);
  // }

  // return unionArray;
  // }

  // public static ArrayList<Integer> findUnion(int arr1[], int arr2[]) {
  // int i=0;
  // int j=0;
  // ArrayList<Integer> union = new ArrayList<>();

  // while(i<arr1.length && j<arr2.length){
  // if(arr1[i]<=arr2[j]){
  // if(union.size() ==0 || union.get(union.size()-1) != arr1[i] ){
  // union.add(arr1[i]);
  // }
  // i++;
  // }else{
  // if (union.size()==0 || union.get(union.size() - 1) != arr2[j]) {
  // union.add(arr2[j]);
  // }
  // j++;
  // }
  // }

  // while (j<arr2.length) {
  // if (union.size() == 0 || union.get(union.size() - 1) != arr2[j]) {
  // union.add(arr2[j]);
  // }
  // j++;
  // }
  // while (i<arr1.length) {
  // if (union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
  // union.add(arr1[i]);
  // }
  // i++;
  // }

  // return union;
  // }

  // public static int missingNumber(int[] arr) {
  // for (int i = 1; i <= arr.length; i++) {

  // int flag = 0;
  // for (int j = 0; j <= arr.length - 1; j++) {
  // if (arr[j] == i) {

  // flag = 1;
  // break;
  // }
  // }
  // if (flag == 0) {
  // return i;
  // }
  // }
  // return 0;
  // }
  // public static int missingNumber(int[] arr) {
  // int n = arr.length;
  // int sum = (n * (n + 1)) / 2;
  // int total = 0;
  // for (int i = 0; i < arr.length; i++) {
  // total = total + arr[i];
  // }

  // return sum - total;

  // }

  // public static int missingNumber(int[] arr) {
  // int n = arr.length;
  // int xor1 = 0;
  // int xor2 = 0;
  // for(int i=0; i<arr.length;i++){
  // xor1 = xor1 ^ (i+1);
  // xor2 = xor2 ^ arr[i];
  // }

  // return xor1 ^ xor2;

  // }

  // public static int consecutiveOnes(int[] arr){

  // int max = 0 ;
  // int count = 0;

  // for(int i=0;i<arr.length;i++){
  // if(arr[i] == 1){
  // count++;
  // }
  // else{
  // count = 0;
  // }
  // max = Math.max(max, count);
  // }

  // return max;
  // }

  // public static int findUniqNumber(int[] arr) {
  // int xor1 = 0;
  // for (int i = 0; i < arr.length; i++) {
  // xor1 = xor1 ^ arr[i];
  // }
  // return xor1;
  // }

  // public static int longestSubArray(int[] arr ,int sum){

  // int windowSum = 0;
  // int maxLength = 0;
  // int i= 0;
  // int j = 0;
  // while(i<arr.length){
  // while (j<=i&&windowSum > sum ) {
  // windowSum -= arr[j];
  // j++;
  // }
  // if(windowSum == sum) maxLength = Math.max(maxLength, i-j+1);
  // i++;
  // if(i<arr.length) windowSum += arr[i];

  // }
  // return maxLength;

  // }

  // public static int[] twoSum (int[] arr,int sum){
  // Map<Integer,Integer> map = new HashMap<>();

  // for(int i=0; i<arr.length;i++){
  // if(map.containsKey(sum-arr[i])){
  // return new int[] {map.get(sum-arr[i]),i};
  // }
  // map.put(arr[i], i);
  // }
  // return new int[] {-1,-1} ;
  // }

  // public static int[] sortColors(int[] arr){
  // int ones = 0;
  // int zeros = 0;
  // int twos = 0;

  // for(int i=0;i<arr.length;i++){
  // if(arr[i] == 0){
  // zeros++;
  // }else if(arr[i] == 1){
  // ones++;
  // }else{
  // twos++;
  // }
  // }

  // for(int i=0; i<arr.length;i++){
  // if(zeros >= i) arr[i] = 0;
  // if(zeros+ones >= i && i>zeros) arr[i] = 1;
  // if(zeros+ones+twos >=i && i > ones+zeros) arr[i] = 2;
  // }

  // return arr;
  // }

  // static int majorityElement(int[] arr){
  // Map<Integer,Integer> map = new HashMap<>();

  // for(int i=0; i<arr.length;i++){
  // map.put(arr[i], map.getOrDefault(arr[i],0)+1);
  // }

  // for(int i=0; i<arr.length;i++){
  // if(map.get(arr[i])>arr.length/2){
  // return arr[i];
  // }
  // }
  // return -1;
  // }

  // public static int[] sortColors(int[] arr){
  // int low = 0;
  // int mid = 0;
  // int high = arr.length-1;

  // while (mid<=high) {
  // if(arr[mid] == 0){
  // int temp = arr[low];
  // arr[low] = arr[mid];
  // arr[mid] = temp;
  // mid++;
  // low++;
  // }
  // else if(arr[mid] == 1){
  // mid++;
  // }

  // else if(arr[mid]==2){
  // int temp = arr[high];
  // arr[high] = arr[mid];
  // arr[mid] = temp;
  // high--;
  // }
  // }

  // return arr;

  // }

  // public static int majorityElement(int[] arr) {
  // int el = arr[0];
  // int count = 0;

  // for (int i = 1; i < arr.length; i++) {
  // if (el != arr[i]) {
  // count--;
  // } else if (el == arr[i]) {
  // count++;
  // }

  // if(count == 0){
  // el = arr[i];
  // }
  // }

  // return el;
  // }

  // public static int largestSum (int[] arr){

  // int i=0;
  // int j=0;
  // int maxSum = Integer.MIN_VALUE;
  // int sum = 0;

  // while (i<arr.length) {
  // sum = Math.max(arr[i], sum + arr[i]);
  // maxSum = Math.max(maxSum, sum);
  // i++;
  // }

  // return maxSum;
  // }

  // public static int[] largestSum (int[] arr){
  // int i=0;
  // int maxSum = 0;
  // int sum = 0;
  // int start = 0;
  // int end = 0;
  // while (i<arr.length) {
  // sum = sum + arr[i];
  // if(maxSum<sum){
  // maxSum = sum;
  // end = i;
  // }
  // if(sum<0){
  // sum = 0;
  // start = i+1;
  // }

  // i++;
  // }

  // return new int[]{start,end};
  // }

  // public static int stockSellAndBuy(int [] arr) {
  // int cost = 0;
  // int minPrice = arr[0];

  // for(int i=0; i<arr.length;i++){
  // minPrice = Math.min(minPrice, arr[i]);
  // cost = Math.max(cost, arr[i]-minPrice);
  // }

  // return cost;

  // }

  // public static int[] rearrangeArray(int[] arr) {

  // int[] array = new int[arr.length];
  // int positiveIndex = 0;
  // int negativeIndex = 0;

  // for (int i = 0; i < array.length; i++) {
  // if(arr[i]>0){
  // array[positiveIndex*2] = arr[i];
  // positiveIndex++;
  // }
  // else{
  // array[negativeIndex*2+1] = arr[i];
  // negativeIndex++;
  // }
  // }

  // return array;

  // ArrayList<Integer> positiveArr = new ArrayList<>();
  // ArrayList<Integer> negativeArr = new ArrayList<>();
  // int j = 0, k = 0;
  // for (int i = 0; i < arr.length; i++) {
  // if (arr[i] > 0) {
  // positiveArr.add(arr[i]);
  // j++;
  // } else {
  // negativeArr.add(arr[i]);
  // k++;
  // }
  // }
  // j = 0;
  // k = 0;

  // if(positiveArr.size()>negativeArr.size()){

  // for (int i = 0; i < negativeArr.size(); i++) {
  // arr[i*2] = positiveArr.get(i);
  // arr[i*2+1] = negativeArr.get(i);
  // }

  // int index = negativeArr.size()*2;

  // for (int l = negativeArr.size(); l < positiveArr.size(); l++) {
  // arr[index] = positiveArr.get(l);
  // index++;
  // }
  // }else{

  // for (int i = 0; i < positiveArr.size(); i++) {
  // arr[i*2] = positiveArr.get(i);
  // arr[i*2+1] = negativeArr.get(i);
  // }

  // int index = negativeArr.size()*2;

  // for (int l = positiveArr.size(); l < negativeArr.size(); l++) {
  // arr[index] = negativeArr.get(l);
  // index++;
  // }

  // }

  // return arr;

  // }

  // public static List<Integer> nextPermutation(List<Integer> arr) {
  // int n = arr.size();
  // int index = -1;
  // for (int i = n - 2; i >= 0; i--) {
  // if (arr.get(i) < arr.get(i + 1)) {
  // index = i;
  // break;
  // }
  // }

  // if (index == -1) {
  // // reverse the whole array:
  // Collections.reverse(arr);
  // return arr;
  // }

  // for (int i = n - 1; i > index; i--) {
  // if (arr.get(index) < arr.get(i)) {
  // int tmp = arr.get(i);
  // arr.set(i, arr.get(index));
  // arr.set(index, tmp);
  // break;
  // }
  // }

  // List<Integer> subList = arr.subList(index + 1, n);
  // Collections.reverse(subList);

  // return arr;
  // }

  // public static int[] nextPermutation(int[] arr){
  // int index = -1;
  // int n = arr.length-1;
  // for(int i=n-2; i>=0; i--){
  // if(arr[i] < arr[i+1]){
  // index = i;
  // break;
  // }
  // }

  // for(int i=n-1 ;i>index; i--){
  // if(arr[i]<arr[index]){
  // int temp = arr[i];
  // arr[i] = arr[index];
  // arr[index] = temp;
  // break;
  // }
  // }

  // reverse(arr,index+1,n);

  // return arr;
  // }

  // public static void reverse(int arr[], int start, int end){
  // while(start<end){
  // int temp = arr[start];
  // arr[start] = arr[end];
  // arr[end] = temp;
  // end--;
  // start++;
  // }
  // }

  // public static ArrayList<Integer> findLeader(int[] arr){

  // ArrayList<Integer> ans = new ArrayList<>();

  // int max = Integer.MIN_VALUE;

  // for(int i=arr.length-1; i>=0; i--){
  // if(max<arr[i]){
  // max = arr[i];
  // ans.add(arr[i]);
  // }
  // }

  // return ans;
  // }

  // public static int longestSuccessiveElement(int[] arr) {

  // Arrays.sort(arr);
  // int maxLength = 0;
  // int count = 0;
  // int lastSmaller = Integer.MIN_VALUE;
  // for (int i = 0; i < arr.length; i++) {
  // if(arr[i]-1 == lastSmaller){
  // count++;
  // lastSmaller = arr[i];
  // }else if(arr[i] != lastSmaller){
  // count = 1;
  // lastSmaller = arr[i];
  // }
  // maxLength = Math.max(maxLength, count);
  // }

  // return maxLength;

  // }

  // public static int longestSuccessiveElement(int[] arr){
  // HashSet<Integer> set = new HashSet<>();
  // int maxLength = 0;
  // for (int i = 0; i < arr.length; i++) {
  // set.add(arr[i]);
  // }

  // for(int num : set){
  // if(!set.contains(num-1)){
  // int count = 1;
  // int x = num;
  // while (set.contains(x+1)) {
  // count++;
  // x++;
  // }
  // maxLength = Math.max(maxLength, count);
  // }

  // }
  // System.out.println(set);
  // return maxLength;
  // }

  // public static void rows(int a[][], int row) {
  // for (int i = 0; i < a[0].length; i++) {
  // a[row][i] = (a[row][i]==0)?0:-1;
  // }
  // System.out.println(Arrays.deepToString(a));

  // }

  // public static void cols(int a[][], int col) {
  // for (int i = 0; i < a.length; i++) {
  // a[i][col] =( a[i][col]==0)?0: -1;
  // }
  // System.out.println(Arrays.deepToString(a));

  // }

  // public static void setZero(int[][] arr) {
  // System.out.println(Arrays.deepToString(arr));
  // int n = arr.length;
  // int m = arr[0].length;
  // // System.out.println("n"+n);j
  // // System.out.println("m"+m);
  // for (int i = 0; i < n; i++) {
  // for (int j = 0; j < m; j++) {
  // // System.out.println(i+" " +j);

  // // System.out.println(arr[1][3]);
  // if (arr[i][j] == 0) {
  // // System.out.println(arr[i][j]);
  // System.out.println(i + " " + j);
  // cols(arr, j);
  // rows(arr, i);// (arr, i, m);
  // }
  // }
  // }

  // // for (int i = 0; i < n; i++) {
  // // for (int j = 0; j < m; j++) {
  // // // System.out.println(i+" " +j);

  // // // System.out.println(arr[1][3]);
  // // if (arr[i][j] == 0) {
  // // // System.out.println(arr[i][j]);
  // // System.out.println(i + " " + j);
  // // // cols(arr, j);
  // // rows(arr, i);// (arr, i, m);
  // // }
  // // }

  // // }

  // for (int i = 0; i < n; i++) {
  // for (int j = 0; j < m; j++) {
  // if (arr[i][j] == -1) {
  // arr[i][j] = 0;
  // }
  // // System.out.print(arr[i][j] + " ");
  // }
  // // System.out.println();
  // }
  // System.out.println(Arrays.deepToString(arr));

  // // System.out.println(arr[0][0]);
  // }

  // public static void markRow(int[][] arr, int i, int m) {
  // for (int j = 0; j < m; j++) {

  // arr[i][j] = -1;
  // }
  // // System.out.println(Arrays.deepToString(arr));

  // }

  // public static void markCol(int[][] arr, int j, int n) {
  // for (int i = 0; i < n; i++) {
  // arr[i][j] = -1;
  // // System.out.println(arr[i][j]);
  // }
  // // System.out.println(Arrays.deepToString(arr));

  // }

  // public static void setZero(int arr[][]) {
  // int row = arr.length;
  // int col = arr[0].length;
  // int rowArray[] = new int[row];
  // int colArray[] = new int[col];

  // for (int i = 0; i < row; i++) {
  // for (int j = 0; j < col; j++) {
  // if(arr[i][j] == 0){
  // rowArray[i] = 1;
  // colArray[j] = 1;
  // }
  // }
  // }

  // for (int i = 0; i < row; i++) {
  // for (int j = 0; j < col; j++) {
  // if(rowArray[i] == 1 || colArray[j] == 1){
  // arr[i][j] = 0;
  // }
  // }
  // }

  // int row = arr.length;
  // int col = arr[0].length;
  // int col0 = 0;
  // for (int i = 0; i < row; i++) {
  // for (int j = 0; j < col; j++) {
  // if (arr[i][j] == 0) {
  // arr[i][0] = 0;
  // if (j != 0)
  // arr[0][j] = 0;
  // else
  // col0 = 0;
  // }
  // }
  // }

  // for (int i = 1; i < row; i++) {
  // for (int j = 1; j < col; j++) {
  // if (arr[i][j] != 0) {
  // if (arr[i][0] == 0 || arr[0][j] == 0) {
  // arr[i][j] = 0;
  // }
  // }
  // }
  // }

  // if (arr[0][0] == 0) {

  // for (int i = 0; i < arr.length; i++) {
  // arr[i][0] = 0;
  // }
  // }

  // if (col0 == 0) {
  // for (int i = 0; i < arr.length; i++) {
  // arr[0][i] = 0;
  // }
  // }

  // }

  // public static void rotate90(int arr[][]) {
  // int n = arr.length;

  // for (int i = 0; i < n; i++) {
  // for (int j = 0; j < n; j++) {
  // if (i < j) {
  // int temp = arr[i][j];
  // arr[i][j] = arr[j][i];
  // arr[j][i] = temp;
  // System.out.println(arr[i][j] + " " + arr[j][i]);
  // }
  // }
  // }
  // for (int i = 0; i < n; i++) {
  // for (int j = 0; j < n; j++) {
  // if (j < n / 2) {
  // int temp = arr[i][j];
  // arr[i][j] = arr[i][n - j - 1];
  // arr[i][n - j - 1] = temp;
  // }
  // }
  // }

  // System.out.println(Arrays.deepToString(arr));

  // }

  // public static List<Integer> spiralMatrix(int arr[][]) {
  // int row = arr.length;
  // int col = arr[0].length;
  // List<Integer> ans = new ArrayList<>();
  // int left = 0;
  // int right = col - 1;
  // int top = 0;
  // int bottom = row - 1;

  // while (left <= right && top <= bottom) {

  // for (int i = left; i <= right; i++) {
  // ans.add(arr[top][i]);
  // }
  // top++;
  // for (int i = top; i <= bottom; i++) {
  // ans.add(arr[i][right]);
  // }
  // right--;

  // // if (top <= bottom) {

  // for (int i = right; i >= left; i--) {
  // ans.add(arr[bottom][i]);
  // }
  // // }
  // bottom--;

  // // if (left <= right) {

  // for (int i = bottom; i >= top; i--) {
  // ans.add(arr[i][left]);
  // }
  // left++;
  // // }
  // }

  // return ans;

  // }

  // public static int countSubarray(int arr[], int k) {
  // int count = 0;
  // int prefixSum = 0;
  // HashMap<Integer, Integer> map = new HashMap<>();
  // map.put(0, 1);

  // for (int num : arr) {
  // prefixSum += num;
  // int remove = prefixSum - k;

  // count += map.getOrDefault(remove, 0);

  // map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);

  // }

  // return count;

  // }

  // public static int pascalTriangle(int row, int col){
  // int value = 1;
  // for (int i = 0; i < col; i++) {
  // value = value*(row - i);
  // value = value/(i+1);
  // }
  // return value;
  // }

  // public static List<Integer> pascalRow(int n) {

  // List<Integer> ans = new ArrayList<>();

  // int value = 1;

  // for (int i = 1; i < n; i++) {
  // // System.out.print(" " + value);
  // ans.add(value);
  // value = value * (n - i);
  // value = value / i;
  // }
  // ans.add(1);
  // return ans;
  // }

  // public static List<List<Integer>> pascalTriangle(int n) {

  // List<List<Integer>> ans = new ArrayList<List<Integer>>();

  // List<Integer> pasRow = new ArrayList<>();
  // for (int i = 1; i <= n; i++) {
  // pasRow = pascalRow(i);
  // ans.add(pasRow);
  // }

  // return ans;
  // }

  // public static List<Integer> majorityElement(int arr[]) {

  // List<Integer> ans = new ArrayList<>();

  // for (int i = 0; i < arr.length; i++) {
  // int count = 0;
  // for (int j = 0; j < arr.length; j++) {
  // if (arr[i] == arr[j]) {
  // count++;
  // }
  // }
  // if (count > arr.length / 3 && !ans.contains(arr[i])) {

  // ans.add(arr[i]);
  // }
  // }

  // HashMap<Integer,Integer> map = new HashMap<>();

  // for (int i = 0; i < arr.length; i++) {
  // map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
  // }
  // System.out.println(map);
  // for (int i = 0; i < arr.length; i++) {
  // if(map.get(arr[i]) > arr.length/3 && !ans.contains(arr[i])){
  // ans.add(arr[i]);
  // }
  // }

  // System.out.println(arr.length/3);

  // int count1 = 0;
  // int count2 = 0;
  // int elmt1 = 0;
  // int elmt2 = 0;

  // for (int i = 0; i < arr.length; i++) {
  // if(count1 ==0 && elmt2 != arr[i]){
  // count1++;
  // elmt1 = arr[i];
  // }
  // else if(count2==0&&elmt1 != arr[i]){
  // count2++;
  // elmt2 = arr[i];
  // }else if(elmt1 == arr[i]){
  // count1++;
  // }else if(elmt2 == arr[i]){
  // count2++;
  // }else{
  // count1--;
  // count2--;
  // }

  // }
  // count1 = 0;
  // count2 = 0;

  // for (int i = 0; i < arr.length; i++) {
  // if(arr[i] == elmt1 ) count1++;
  // if(arr[i] == elmt2) count2++;
  // }

  // if(count1>arr.length/3 ){
  // ans.add(elmt1);
  // }
  // if(count2>arr.length/3 && elmt1 != elmt2){
  // ans.add(elmt2);
  // }
  // return ans;
  // }

  // public static List<List<Integer>> threeSum(int arr[]) {
  // List<List<Integer>> ans = new ArrayList<>();
  // HashSet<List<Integer>> value = new HashSet<>();

  // for (int i = 0; i < arr.length; i++) {
  // HashSet<Integer> map = new HashSet<>();
  // for (int j = i+1; j < arr.length; j++) {
  // int k = -1*(arr[i]+arr[j]);
  // if(map.contains(k)){
  // arrList.add(0,arr[i]);
  // arrList.add(1,arr[j]);
  // arrList.add(2,k);
  // Collections.sort(arrList);
  // value.add(arrList);
  // }else{

  // map.add(arr[j]);
  // }
  // }
  // }

  // for(List<Integer> num: value){

  // ans.add(num);
  // }

  // for (int i = 0; i < arr.length-2; i++) {
  // if(i>0&&arr[i] == arr[i-1]) continue;
  // int j = i+1;
  // int k = arr.length-1;
  // while (j < k) {

  // if (arr[i] + arr[j] + arr[k] > 0) {
  // k--;
  // } else if (arr[i] + arr[j] + arr[k] < 0) {
  // j++;
  // } else {
  // List<Integer> arrList = new ArrayList<>();
  // arrList.add(0,arr[i]);
  // arrList.add(1,arr[j]);
  // arrList.add(2,arr[k]);
  // System.out.println(arrList);
  // ans.add(arrList);
  // j++;
  // k--;
  // while (arr[j] == arr[j-1]&&j<k) {
  // j++;
  // }
  // while (arr[k] == arr[k+1] && j<k) {
  // k--;
  // }
  // }
  // }
  // }

  // return ans;
  // }

  // public static List<List<Integer>> fourSum(int[] arr , int target) {

  // List<List<Integer>> ans = new ArrayList<>();
  // Arrays.sort(arr);
  // for (int i = 0; i < arr.length - 3; i++) {

  // if (0 < i && arr[i] == arr[i - 1])
  // continue;
  // for (int j = i + 1; j < arr.length-2; j++) {
  // if (j > i + 1 && arr[j] == arr[j - 1])
  // continue;
  // int k = j + 1;
  // int l = arr.length - 1;
  // while (k < l) {

  // if ((long) arr[i] + arr[j] + arr[k] + arr[l] > target) {
  // l--;
  // } else if ((long) arr[i] + arr[j] + arr[k] + arr[l] < target) {
  // k++;
  // } else{
  // List<Integer> arrList = new ArrayList<>();
  // arrList.add(0, arr[i]);
  // arrList.add(1, arr[j]);
  // arrList.add(2, arr[k]);
  // arrList.add(3, arr[l]);

  // ans.add(arrList);
  // k++;
  // l--;

  // while (k<l&&arr[k] == arr[k-1]) {
  // k++;
  // }
  // while (k<l&& arr[l] == arr[l+1]) {
  // l--;
  // }
  // }
  // }

  // }
  // }
  // return ans;
  // }

  // public static int LargestZeroSumSubarray(int arr[]){
  // int n = arr.length;
  // int maxLength = Integer.MIN_VALUE;
  // HashMap<Integer,Integer> map = new HashMap<>();

  // int sum = 0;
  // for (int i = 0; i < n; i++) {
  // sum += arr[i];
  // if(sum == 0){
  // maxLength = i+1;
  // }else if(map.containsKey(sum)){
  // maxLength = Math.max(maxLength, i-map.get(sum));
  // }else{
  // map.put(sum, i);
  // }
  // }
  // return maxLength;
  // }

  // public static int subArrayXOR(int arr[] , int target){
  // int count = 0;

  // HashMap<Integer,Integer> map = new HashMap<>();
  // map.put(0, 1);
  // int XR = 0;
  // for (int i = 0; i < arr.length; i++) {
  // XR = XR^arr[i];
  // int x = XR^target;

  // if(map.containsKey(x)){
  // count = count + map.get(x);
  // }

  // if(map.containsKey(XR)){
  // map.put(XR, map.get(XR)+1);
  // }else{
  // map.put(XR, 1);
  // }
  // }
  // return count;
  // }

  // public static List<List<Integer>> merge(int[][] arr) {

  // Arrays.sort(arr, new Comparator<int[]>() {
  // public int compare(int[] a, int[] b) {
  // return a[0] - b[0];
  // }
  // });

  // List<List<Integer>> ans = new ArrayList<>();
  // for (int i = 0; i < arr.length; i++) {

  // int start = arr[i][0];
  // int end = arr[i][1];

  // if (!ans.isEmpty() && end <= ans.get(ans.size()-1).get(1)) {
  // continue;
  // }

  // for (int j = i+1; j < arr.length; j++) {
  // if(arr[j][0]<= end){
  // end = Math.max(end, arr[j][1]);
  // }
  // }

  // List<Integer> temp = new ArrayList<>();
  // temp.add(start);
  // temp.add(end);
  // ans.add(temp);
  // }

  // return ans;
  // }

  // public static void merge(int arr1[], int arr2[]){
  // int i = arr1.length-1;
  // int j=0;

  // while(i>=0 && j<arr2.length){
  // if (arr1[i]>arr2[j]) {
  // int temp = arr1[i];
  // arr1[i] = arr2[j];
  // arr2[j] = temp;
  // }else{
  // break;
  // }
  // i--;j++;
  // }

  // Arrays.sort(arr2);
  // Arrays.sort(arr1);

  // for(int num: arr2){
  // System.out.println(num);
  // }

  // }

  // public static void missingNumber(int arr[]) {

  // int missingNo = -1;
  // int repeatingNo = -1;
  // HashMap<Integer, Integer> map = new HashMap<>();

  // for (int i = 0; i < arr.length; i++) {
  // map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
  // }

  // for (int i = 1; i <= arr.length; i++) {
  // if (map.get(arr[i - 1]) == 2) {
  // repeatingNo = arr[i - 1];
  // }
  // if (!map.containsKey(i)) {
  // missingNo = i;
  // }
  // }
  // int n= arr.length;
  // int s= 0;
  // int sn = 0;
  // int s2 = 0;
  // int sn2 = 0;
  // sn = (n*(n+1))/2;
  // sn2 = (n*(n+1)*(2*n+1))/6;

  // for (int i = 0; i < arr.length; i++) {
  // s = s + arr[i];
  // s2 = s2 + arr[i]*arr[i];
  // }

  // int val = s-sn;
  // System.out.println("value" + val);
  // int val2 = (s2-sn2)/val;
  // System.out.println("value2 "+ val2);
  // int x = (val+val2)/2;
  // System.out.println("x="+x);
  // int y = val2-x;
  // System.out.println(x);
  // System.out.println(y);
  // System.out.println(repeatingNo);
  // System.out.println(missingNo);
  // }

  // private static int merge(int[] arr, int low, int mid, int high) {
  // ArrayList<Integer> temp = new ArrayList<>(); // temporary array
  // int left = low; // starting index of left half of arr
  // int right = mid + 1; // starting index of right half of arr
  // int count = 0;
  // // storing elements in the temporary array in a sorted manner//

  // while (left <= mid && right <= high) {
  // if (arr[left] <= arr[right]) {
  // temp.add(arr[left]);
  // left++;
  // } else {
  // temp.add(arr[right]);
  // // count = count + ((mid - left )+1);
  // right++;
  // }
  // }

  // // if elements on the left half are still left //

  // while (left <= mid) {
  // temp.add(arr[left]);
  // left++;
  // }

  // // if elements on the right half are still left //
  // while (right <= high) {
  // temp.add(arr[right]);
  // right++;
  // }

  // for (int i = low; i <= high; i++) {
  // arr[i] = temp.get(i - low);
  // }

  // return count;
  // }

  // public static int countPairs(int arr[], int low, int mid, int high) {
  // int count = 0;
  // int right = mid + 1;
  // for (int i = low; i <= mid; i++) {
  // while (right <= high && arr[i] > 2L * arr[right]) {
  // right++;
  // }
  // count = count + (right - (mid + 1));
  // }

  // return count;
  // }

  // public static int mergeSort(int[] arr, int low, int high) {

  // int cnt = 0;
  // if (low >= high)
  // return 0;
  // int mid = (low + high) / 2;
  // cnt += mergeSort(arr, low, mid); // left half
  // cnt += mergeSort(arr, mid + 1, high); // right half
  // cnt += countPairs(arr, low, mid, high);
  // merge(arr, low, mid, high);
  // return cnt;
  // }

  // public static int reversePairs(int arr[]){

  // return mergeSort(arr, 0, arr.length - 1);
  // }

  // public static int maxProductSubarray(int arr[]){
  // int maxProduct = Integer.MIN_VALUE;
  // int prefix = 1;
  // int sufix = 1;

  // for (int i = 0; i < arr.length; i++) {
  // if(prefix ==0 ) prefix=1;
  // if(sufix ==0) sufix = 1;

  // prefix = prefix * arr[i];
  // sufix = sufix * arr[arr.length-i-1];

  // maxProduct = Math.max(maxProduct, Math.max(prefix, sufix));

  // }
  // return maxProduct;
  // }

  // public static int binarySearch(int arr[], int low, int high, int target) {

  // int mid = 0;
  // while(low<=high){
  // mid = (low+high)/2;
  // if(arr [mid] == target){
  // return mid;
  // }else if(arr[mid]>target){
  // high = mid-1;
  // }else {
  // low = mid+1;

  // }
  // }
  // return -1;

  // if(low>high){
  // return-1;
  // }

  // int mid = (low+high)/2;
  // if(arr[mid]<target){
  // return binarySearch(arr, mid+1, high, target);
  // }else if(arr[mid] == target){
  // return mid;
  // }else{
  // return binarySearch(arr, low, mid-1, target);
  // }
  // }

  // public static int longestSubString(String str){
  // HashSet<Character> set = new HashSet<>();
  // int maxLength = 0;
  // int len = 0;
  // char[] strArray = str.toCharArray();

  // int i = 0;
  // int j = 0;
  // while(i<=j){
  // if (j==strArray.length) {
  // break;
  // }
  // if(!set.contains(strArray[j])){
  // len++;
  // set.add(strArray[j]);
  // maxLength = Math.max(maxLength, len);
  // j++;
  // }else{
  // set.remove(strArray[i]);
  // i++;
  // len = j-i;
  // System.out.println("len: " + len);
  // }

  // }

  // return Math.max(maxLength, len);
  // }

  // public static int consecutiveOnes(int arr[], int k) {
  // int left = 0;
  // int right = 0;
  // int zeros = 0;
  // int maxLength = 0;

  // while (right < arr.length) {

  // if (arr[right] == 0) {
  // zeros++;

  // }
  // if (zeros > k) {
  // if (arr[left] == 0) {

  // zeros--;
  // }
  // left++;
  // }

  // maxLength = Math.max(maxLength, (right - left) + 1);
  // right++;

  // }
  // return maxLength;
  // }

  // public static String removeConsecutiveDuplicates(String s) {

  // char[] str = s.toCharArray();

  // String value = "";
  // for (int i = 0; i < str.length - 1; i++) {

  // if (str[i] != str[i + 1]) {
  // value = value + str[i];
  // }
  // }
  // value = value + str[str.length - 1];

  // return value;
  // }

  // public static int fruitIntoBasket(int arr[], int k) {
  // int left = 0;
  // int right = 0;
  // int maxLength = 0;
  // HashMap<Integer, Integer> map = new HashMap<>();

  // while (right < arr.length) {

  // map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);

  // if (map.size() <= k) {
  // maxLength = Math.max(maxLength, right - left + 1);
  // }

  // while (map.size() > k) {
  // int newCount = map.getOrDefault(arr[left], 0) - 1;
  // if (newCount > 0) {
  // map.put(arr[left], newCount);
  // } else {
  // map.remove(arr[left]);
  // }
  // left++;
  // }

  // right++;
  // }
  // System.out.println(map);
  // return maxLength;
  // }

  // public static int longestRepeatingChar(String s,int k){
  // int maxLength = 0;
  // int maxFreq = 0;
  // int left = 0;
  // int right = 0;
  // int len = 0;

  // HashMap<Character,Integer> map = new HashMap<>();

  // char arr[] = s.toCharArray();

  // while (right<arr.length) {
  // map.put(arr[right], map.getOrDefault(arr[right],0)+1);
  // maxFreq = Math.max(maxFreq, map.get(arr[right]));
  // len = right - left+1;

  // if(len-maxFreq<=k){
  // maxLength = Math.max(maxLength, len);
  // }else{
  // int value = map.get(arr[left]);
  // map.put(arr[left], value-1);
  // left++;
  // }

  // right++;
  // }

  // return maxLength;
  // }

  // public static int binarySubArraySum(int[] nums, int goal) {
  // Map<Integer, Integer> prefixCount = new HashMap<>();
  // prefixCount.put(0, 1); // Base case: sum 0 has 1 way

  // int sum = 0;
  // int count = 0;

  // for (int num : nums) {
  // sum += num%2;

  // // If (sum - goal) exists in map, add its frequency

  // count += prefixCount.getOrDefault(sum - goal,0);

  // // Update map with current prefix sum
  // prefixCount.put(sum, prefixCount.getOrDefault(sum, 0) + 1);
  // }

  // return count;
  // }

  // public static int subStringContains(int arr[] , int k){

  // int max = 0;

  // int rigth = k-1;
  // int left = arr.length-1;
  // int sum =0;
  // for(int i=0 ; i<k; i++){
  // sum += arr[i];
  // }

  // while (rigth>=0) {
  // sum = sum - arr[rigth];
  // sum = sum + arr[left];
  // rigth--;
  // left--;
  // max = Math.max(max, sum);
  // }

  // return max;
  // }

  // public static int largestSubString(String s, int k) {
  // HashMap<Character, Integer> map = new HashMap<>();
  // int maxLength = 0;
  // int right = 0;
  // int left = 0;
  // while (right < s.length()) {
  // map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);

  // if (map.size() <= k) {
  // maxLength = Math.max(maxLength, right - left + 1);
  // } else {
  // while (map.size() > k && left <s.length()) {
  // char leftChar = s.charAt(left);
  // map.put(leftChar, map.get(leftChar) - 1);
  // if (map.get(leftChar) == 0) {
  // map.remove(leftChar);
  // }
  // left++;
  // }
  // }

  // right++;
  // }

  // return maxLength;
  // }
  // public static int LargestDifferentInteger(int arr[], int k){
  // HashMap<Integer, Integer> map = new HashMap<>();
  // int count = 0;
  // int left = 0;

  // for (int right = 0; right < arr.length; right++) {
  // map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);

  // while (map.size() > k) {
  // int leftVal = arr[left];
  // map.put(leftVal, map.get(leftVal) - 1);
  // if (map.get(leftVal) == 0) {
  // map.remove(leftVal);
  // }
  // left++;
  // }

  // count += (right - left + 1);
  // }

  // return count;
  // }

  // public static int minWindowSubString(String s, String t) {
  // int count = 0;
  // String[] str = s.split("");
  // String[] strT = t.split("");
  // HashMap<String, Integer> map = new HashMap<>();

  // for (int i = 0; i < str.length; i++) {
  // map.put(str[i], map.getOrDefault(map, 0) + 1);
  // }
  // int right = 0;
  // int left = 0;
  // int minLength = Integer.MAX_VALUE;
  // while (right < str.length) {

  // if (map.get(str[right]) == 0) {
  // count++;
  // minLength = Math.min(right - left + 1, minLength);
  // }

  // while (count == t.length()) {
  // minLength = Math.min(right - left + 1, minLength);
  // map.put(str[left], map.get(str[left]) + 1);
  // if (map.get(str[left]) > 0) {
  // count--;
  // }
  // left++;
  // }
  // map.put(str[right], map.getOrDefault(str[right], 0) - 1);
  // right++;
  // }

  // return minLength;
  // }

  // public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
  // int n = nums1.length + nums2.length;
  // // System.out.println(n);
  // int arr[] = new int[n];
  // double value = 0.00;
  // int nums1Index = 0;
  // int nums2Index = 0;
  // for (int i = 0; i < n; i++) {
  // if (nums1Index < nums1.length && (nums2Index >= nums2.length ||
  // nums1[nums1Index] <= nums2[nums2Index])) {
  // arr[i] = nums1[nums1Index];
  // nums1Index++;
  // } else {
  // arr[i] = nums2[nums2Index];
  // nums2Index++;
  // }
  // }

  // System.out.println(n/2);
  // int i = n/2;
  // if(n%2 == 0){
  // value = (double)(arr[i] + arr[i-1])/2;
  // }else{
  // value = arr[i];
  // }

  // return value;
  // }

  // public static String longestCommonPrefix(String[] strs) {
  // int n = strs.length;
  // int minCount = 999;
  // HashMap<Integer, Character> map = new HashMap<>();
  // for (int i = 0; i < n; i++) {
  // int count = 0;
  // for (int j = 0; j < strs[i].length(); j++) {
  // if (i == 0)
  // map.put(j, strs[i].charAt(j));
  // else {
  // if (map.get(j) == strs[i].charAt(j)) {
  // count++;
  // }else{
  // break;
  // }
  // }

  // }
  // if(i!=0) minCount = Math.min(count, minCount);

  // // System.out.println(map);
  // }

  // // System.out.println(minCount);
  // String str = "";
  // for (int i = 0; i < minCount; i++) {
  // str = str + Character.toString(strs[0].charAt(i));
  // }

  // return str;
  // }

  // public static int removeElement(int[] nums, int val) {
  // int count = 0;
  // for (int i = 0; i < nums.length; i++) {
  // if (nums[i] != val) {
  // count++;
  // }
  // }

  // return count;
  // }

  // public static int findUnique(int[] arr) {
  // int unique = 0;
  // HashMap<Integer, Integer> map = new HashMap<>();
  // for (int i = 0; i < arr.length; i++) {
  // map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
  // }

  // System.out.println(map);

  // for (int num : map.keySet()) {
  // if (map.get(num) == 1) {
  // unique = num;
  // break;
  // }
  // }

  // return unique;
  // }

  // public static int[] plusOne(int[] digits) {
  // int n = digits.length;

  // // Start from last digit
  // for (int i = n - 1; i >= 0; i--) {
  // if (digits[i] < 9) {
  // digits[i]++;
  // return digits;
  // }
  // digits[i] = 0;
  // }

  // int[] result = new int[n + 1];
  // result[0] = 1; // 999 -> 1000
  // return result;
  // }

  // public static int findDuplicate(ArrayList<Integer> arr) {

  // HashMap<Integer, Integer> map = new HashMap<>();

  // for (int i = 0; i < arr.size(); i++) {
  // map.put(arr.get(i), map.getOrDefault(arr.get(i), 0) + 1);
  // }
  // int ans = -1;
  // for (int num : map.keySet()) {
  // if (map.get(num) > 1) {
  // ans = num;
  // }
  // }

  // return ans;
  // }

  // public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int
  // k) {
  // // Write your code here.
  // boolean found = false;
  // int ans[] = new int[2];
  // ans[0] = -1;
  // ans[1] = -1;
  // for (int i = 0; i < n; i++) {
  // if (arr.get(i) == k ) {
  // if (!found) {
  // ans[0] = i; // first occurrence
  // found = true;
  // }
  // ans[1] = i;
  // System.out.println(ans[1]);
  // }
  // }
  // return ans;
  // }

  // public static List<int[]> pairSum(ArrayList<Integer> arr, int s) {
  // HashMap<Integer, Integer> map = new HashMap<>();
  // List<int[]> list = new ArrayList<>();
  // int i = 0;
  // int sum = 0;
  // while (i < arr.size()) {
  // sum = s - arr.get(i);
  // if (map.containsKey(sum)) {
  // list.add(new int[]{arr.get(i) , sum});
  // }

  // map.put(arr.get(i), i);
  // i++;
  // }
  // list.sort(Comparator.comparingInt(a -> a[0]));
  // return list;
  // }

  // public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer>
  // arr1, int n, ArrayList<Integer> arr2,
  // int m) {
  // // Write Your Code Here.
  // HashMap<Integer, Integer> map1 = new HashMap<>();
  // HashMap<Integer, Integer> map2 = new HashMap<>();
  // ArrayList<Integer> ans = new ArrayList<>();
  // for (int i = 0; i < n; i++) {
  // map1.put(arr1.get(i), map1.getOrDefault(arr1.get(i), 0) + 1);
  // }
  // for (int i = 0; i < m; i++) {
  // map2.put(arr2.get(i), map2.getOrDefault(arr2.get(i), 0) + 1);
  // }

  // // int listIndex = 0;
  // for (int num : map1.keySet()) {
  // if (map2.containsKey(num)) {
  // ans.add(num);
  // }
  // }

  // return ans;
  // }

  // public boolean containsNearbyDuplicate(int[] nums, int k) {
  // HashMap<Integer, Integer> map = new HashMap<>();

  // for (int i = 0; i < nums.length; i++) {
  // if (map.containsKey(nums[i])) {
  // if (i - map.get(nums[i]) <= k) {
  // return true;
  // }
  // }
  // map.put(nums[i], i);
  // }

  // return false;
  // }

  // public int[] searchRange(int[] arr, int target) {
  // int[] ans = new int[2];

  // ans[0] = -1;
  // ans[1] = -1;
  // for (int i = 0; i < arr.length; i++) {
  // if (arr[i] == target && ans[0] == -1) {
  // ans[0] = i;
  // ans[1] = i;
  // } else if (arr[i] == target) {
  // ans[1] = i;
  // }
  // }
  // return ans;
  // }

  // public static String reverseString(String str) {
  // String arr[] = str.split(" ");
  // int n = arr.length - 1;
  // for (int i = 0; i < arr.length / 2 ; i++) {
  // String temp = arr[i];
  // arr[i] = arr[n];
  // arr[n] = temp;
  // n--;
  // }

  // String ans = "";

  // for (int i = 0; i < arr.length; i++) {
  // ans = ans + arr[i] + " ";
  // }

  // return ans;

  // }

  // public static String countAndSay(int n) {
  // String ans = "1";
  // // String str = "1";
  // for (int i = 0; i <n; i++) {
  // ans= RLE(ans);
  // }

  // return ans;
  // }

  // public static String RLE(String str) {
  // StringBuilder ans = new StringBuilder();
  // int count = 1;
  // for(int i= 1; i<=str.length(); i++){
  // if(i<str.length() && str.charAt(i) == str.charAt( i -1)){
  // count++;
  // // System.out.println(count);
  // }else{
  // ans.append(count).append(str.charAt(i-1));
  // count = 1;
  // }
  // }
  // return ans.toString();
  // }

  // public static int firstMissingPositive(int[] arr) {
  // Arrays.sort(arr);
  // int ans = 1;
  // for (int i = 0; i < arr.length; i++) {

  // if (arr[i] < ans)
  // continue;

  // if (arr[i] == ans) {
  // ans++;
  // } else if (arr[i] > ans) {
  // return ans;
  // }
  // }

  // return ans;
  // }

  // public static List<Integer> sortedArray(int[] a, int[] b) {
  // // Write your code here
  // int n = a.length;
  // int m = b.length;
  // List<Integer> list = new ArrayList<>();
  // int i = 0;
  // int j = 0;
  // while (i < n && j < m) {
  // if (a[i] <= b[j]) {
  // list.add(a[i]);
  // i++;
  // } else {
  // list.add(b[j]);
  // j++;
  // }
  // }

  // while (i < n) {
  // list.add(a[i]);
  // i++;
  // }

  // // add leftovers from b
  // while (j < m) {
  // list.add(b[j]);
  // j++;
  // }

  // return list;
  // }

  // public static int[] findArraySum(int[] a, int n, int[] b, int m) {
  // // Write your code here.

  // String val1 = "";
  // int data1 = 0;
  // for(int i=0; i<n; i++){
  // val1 = val1 + a[i];
  // }

  // data1 = Integer.parseInt(val1);

  // String val2 = "";
  // int data2 = 0;
  // for(int i=0; i<m; i++){
  // val2 = val2 + b[i];
  // }

  // data2 = Integer.parseInt(val2);

  // int data = data1 + data2;

  // String res = "";
  // res = res + data;

  // int arr[] = new int[res.length()];
  // for(int i=0; i< arr.length; i++){
  // arr[i] = res.charAt(i) - '0';
  // }

  // return arr;

  // }

  // public static String addBinary(String a, String b) {
  //   StringBuilder sb = new StringBuilder();
  //   int i = a.length() - 1;
  //   int j = b.length() - 1;
  //   int carry = 0;

  //   while (i >= 0 || j >= 0 || carry > 0) {
  //     int sum = carry;

  //     if (i >= 0) {
  //       sum += a.charAt(i) - '0';
  //       i--;
  //     }
  //     if (j >= 0) {
  //       sum += b.charAt(j) - '0';
  //       j--;
  //     }

  //     sb.append(sum % 2); 
  //     carry = sum / 2;

  //   return sb.reverse().toString();
  // }
  
  // public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
  //       // Write your code here.
  //       ArrayList<Integer> ans = new ArrayList<>();
  //       int i=0;
  //       while(i+k < arr.size()){
  //           ans.add(arr.get(i + k));
  //           i++;
  //       }
  //       int j = 0;
  //       while(j<k){
  //           ans.add(arr.get(j));
  //           i++;
  //           j++;
  //       }

  //       return ans;
  //   }
 

  // public static int singleNonDuplicate(int[] arr) {
  //   int xor = 0;
  //   for (int num : arr) {
  //     xor ^= num;
  //   }
  //   return xor;
  // }

  // public static int firstUniqChar(String s) {
  //   HashMap<Character, Integer> map = new HashMap<>();
  //   HashMap<Character, Integer> mp = new HashMap<>();
  //   for (int i = 0; i < s.length(); i++) {
  //     map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
  //     if (!mp.containsKey(s.charAt(i)))
  //       mp.put(s.charAt(i), i);
  //   }
  //  System.out.println(map);
  //   for (int i=0; i<s.length(); i++) {
  //     if(map.get(s.charAt(i)) == 1){
  //       return mp.get(s.charAt(i));
  //     }
  //   }

  //   return -1;
  // }

  // public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
  //   // Write your code here
  //   int[] ans = new int[2];
  //   Collections.sort(arr);

  //   int repeatingNum = 0;
  //   int missingNum = 0;

  //   // Find repeating number
  //   for (int i = 1; i < n; i++) {
  //     if (arr.get(i) == arr.get(i - 1)) {
  //       repeatingNum = arr.get(i);
  //       break;
  //     }
  //   }

   // // Find missing number using formula
  //   int expectedSum = n * (n + 1) / 2;
  //   int actualSum = 0;
  //   for (int x : arr)
  //     actualSum += x;

  //   // Missing = expected - (actual - repeating)
  //   missingNum = expectedSum - (actualSum - repeatingNum);

  //   ans[0] = missingNum;
  //   ans[1] = repeatingNum;
  //   return ans;
  // }
  //  public static int[] Klargest(int[] a, int k, int n) {
  //   // Write your code here

  //   Arrays.sort(a);
  //   int ans[] = new int[k];
  //   int j = 0;
  //   for (int i = n - k; i < n; i++) {
  //     ans[j] = a[i];
  //     j++;
  //   }
  //   return ans;
  // }


  // public static boolean checkPalindrome(String str) {
	
	// 	String s = str.replaceAll("[^A-Za-z]","").toLowerCase();
	// 	int n = s.length() - 1;
  //       int i=0;
	// 	while(i<n){
	// 		if(s.charAt(i) != s.charAt(n)){
	// 			return false;
	// 		}
	// 		i++;
	// 		n--;
	// 	}

	// 	return true;
	 
	// }

   
  
    public static int myAtoi(String s) {
      String str = s.trim();
      if (str.length() < 1) {
        return 0;
      }
      long num = 0;
      int i = 0;
      int sign = 1;
      if (str.charAt(i) == '-' || str.charAt(i) == '+') {
        sign = str.charAt(i) == '-' ? -1 : 1;
        i++;
      }

      while (i < str.length() && Character.isDigit(str.charAt(i))) {
        num = num * 10 + str.charAt(i) - '0';

        if (num * sign > Integer.MAX_VALUE) {
          return Integer.MAX_VALUE;
        }
        if (num * sign < Integer.MIN_VALUE) {
          return Integer.MIN_VALUE;
        }
        i++;
      }

      return (int) num * sign;
    }

    public boolean judgeCircle(String moves) {
      int count = 0;
      int count1 = 0;
      for (int i = 0; i < moves.length(); i++) {
        if (moves.charAt(i) == 'U') {
          count++;
        } else if (moves.charAt(i) == 'D') {
          count--;
        } else if (moves.charAt(i) == 'L') {
          count1++;
        } else {
          count1--;
        }
      }

      if (count == 0 && count1 == 0) {
        return true;
      } else {
        return false;
      }
    }
    

  public static void main(String[] args) {
    int arr [] = {-50,0, 52}; 
    int value = myAtoi("-00042");
    System.out.println(value);
   
  }

}