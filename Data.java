// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.ArrayList;

class Data {
    // public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2) {
    //     int i = 0;
    //     int j = 0;
    //     ArrayList<Integer> temp = new ArrayList<>();
    //     while (i < arr1.length && j < arr2.length) {
    //         if (arr1[i] <= arr2[j]) {
    //             if (temp.size() == 0 || temp.get(temp.size() - 1) != arr1[i]) {
    //                 temp.add(arr1[i]);
    //             }
    //             i++;
    //         } else {
    //             if (temp.size() == 0 || temp.get(temp.size() - 1) != arr2[j]) {
    //                 temp.add(arr2[j]);
    //             }
    //             j++;
    //         }
    //     }

    //     while (i < arr1.length) {
    //         if (temp.size() == 0 || temp.get(temp.size() - 1) != arr1[i]) {
    //             temp.add(arr1[i]);
    //         }
    //         i++;
    //     }

    //     while (j < arr2.length) {
    //         if (temp.size() == 0 || temp.get(temp.size() - 1) != arr2[j]) {
    //             temp.add(arr2[j]);
    //         }
    //         j++;
    //     }

    //     return temp;
    // }

    // public static long LCM(int x, int y) {
      
    //   long result = 0;
      
    //   for(int i=0 ; i<=x*y ; i++){
    //      if(i%x ==0 && i%y==0){
    //        result = i;
    //        break; 
    //      }
    //   }

    //   return result;
    // }
    
    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { 2, 3, 4, 5 };
        // ArrayList<Integer> value = findUnion(arr1, arr2);

        // System.out.println(value);
        // long l = LCM(9,10); 
        // System.out.println(l);
    }
}
