public class TwoPointer {


    public static int[] twoSum (int []arr , int target){
        int ans[] = new int[2];
        
        int right = arr.length-1;
        int left = 0;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if(sum == target){
                ans[0] = left;
                ans[1] = right;
                break;
            }

            if(sum<target){
                left++;
            }else{
                right--;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int arr[] = { 5,3,3,2,4,8,0,3};
        int value[] = twoSum(arr, 8);

        for (int i = 0; i < value.length; i++) {
            System.out.println(value[i]);
        }
    }
}
