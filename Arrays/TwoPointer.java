import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwoPointer {

    public static int[] twoSum(int[] arr, int target) {
        int ans[] = new int[2];

        int right = arr.length - 1;
        int left = 0;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                ans[0] = left;
                ans[1] = right;
                break;
            }

            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return ans;
    }
    
    


    public static List<List<Integer>> threeSum(int[] arr) {

        List<List<Integer>> ans = new ArrayList<>();
        
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i - 1])
                continue;
            int j = i + 1;
            int k = arr.length - 1;
            while (j < k) {
               int sum = arr[i] + arr[j] + arr[k];
                if (sum == 0) {
                    System.out.println(arr[i]);
                    System.out.println(arr[j]);
                    System.out.println(arr[k]);
                }
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[j]);
                    list.add(arr[k]);
                    ans.add(list);
                    System.out.println(list);
                    k--;
                    j++;
                    while (arr[j] == arr[j - 1] && j < k) {
                        j++;
                    }

                    while (arr[k] == arr[k + 1] && j < k) {
                        k--;
                    }
                }
            }

        }

        return ans;

    }
     
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        HashMap<Integer , Integer> map = new HashMap<>();


        for(int i=0; i<n; i++){
           map.put(arr.get(i), map.getOrDefault(arr.get(i), 0) + 1);
        }

        for(int num : map.keySet()){
           if(map.get(num) > 1){
            return num;
           } 
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 5, 3, 0, -5, 4, 8, 3 };
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,6,6,6,6,3));

        
        
        // for (int i = 0; i < value.length; i++) {
        // System.out.println(value[i]);
        // }
      int value =  findDuplicate(list, list.size());
      System.out.println(value);
    }
}
