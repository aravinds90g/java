import java.util.ArrayList;
import java.util.List;

class Main {  
//   public static int[] bubbleSort(int[] arr){
//       for(int i=0;i<arr.length-1;i++){
//           boolean swapped = false;
//            for(int j=0;j<arr.length-1-i;j++){
//             if(arr[j]>arr[j+1]){

//                 int temp = arr[j];
//                 arr[j] = arr[j+1] ;
//                 arr[j+1] = temp;
//                 swapped = true;
//             }
//            }
//            if(!swapped){
//                break;
//            }
//       }
//       return arr;
//   }

//   public static int[] selectionSort(int[] arr){
//     for(int i=0;i<arr.length;i++){
//        int minIndex = i;
//         for(int j=i+1; j<arr.length;j++){
//            if(arr[minIndex]>arr[j]){
//             minIndex = j;
//            }
//         }
//         int temp = arr[i];
//         arr[i] = arr[minIndex];
//         arr[minIndex] = temp;
        
//     }
//             return arr;
//   }


    //  public static void insertionSort (int[] arr){
    //     for(int i=1;i<arr.length;i++){
    //       int temp = arr[i];
    //       int j=i-1;
    //       while(j>=0&&arr[j]>temp){
    //           arr[j+1] = arr[j];
    //           j--;
    //         }
    //       arr[j+1] = temp;
    //     }
    //  }

      //  public static void mergeSort(int[] arr){

      //      int n = arr.length;
           
      //      mS(arr, 0,  n-1);

      //  }

      //  public static void mS (int[] arr, int low, int high){
      //       if(low >= high) return;
      //       int mid = (low+ high)/2;
      //       mS(arr, low, mid);
      //       mS(arr, mid+1, high);
      //       merge(arr, low, mid, high);

      //  }

      //  public static void merge(int[] arr,int low, int mid , int high){
      //   ArrayList<Integer> temp = new ArrayList<>() ;  
      //   int left = low;
      //   int right = mid+1;
      //   while (left<=mid&&right<=high) {
      //     if(arr[left] <= arr[right]){
      //        temp.add(arr[left]);
      //        left++;
      //     }else{
      //        temp.add(arr[right]);
      //        right++;
      //     }
      //   }
      //   while (left<=mid) {
      //     temp.add(arr[left]);
      //     left++;
      //   }

      //   while (right<=high) {
      //     temp.add(arr[right]);
      //     right++;
      //   }

      //   for(int i = low ; i<=high; i++){
      //     arr[i] = temp.get(i-low);
      //   }

      //  };


     

      // public static void quickSort(int [] arr){
      //     int high = arr.length-1;
      //     qS(arr,0,high);
      // }

      // public static void qS(int[] arr, int low, int high){
      //     if(low<high){
      //       int partitons = f(arr, low, high);
      //       qS(arr, low, partitons-1);
      //       qS(arr, partitons+1, high);
      //     }
          
      // }

      // public static int f(int[] arr, int low, int high){
      //       int pivot = arr[low];
      //       int i = low;
      //       int j = high;
  
      //       while(i<j){
      //         while (arr[i]<=pivot&& i <=high-1) {
      //            i++;   
      //         }
      //         while (arr[j]>pivot&& j>=low+1) {
      //           j--;
      //         }
      //         if(i<j){
      //           int temp = arr[i];
      //           arr[i] = arr[j];
      //           arr[j] = temp;
      //         }
      //       }
      //       int temp2 = arr[low];
      //       arr[low] = arr[j];
      //       arr[j] = temp2;
      //       return j;
      // } 

      public static int[] termsOfAP(int x) {

        int arr[] = new int[x];
        int value = 1;
        int index = 0;
        // System.out.println("x"+ x);
        while (index <= x) {
          if (((value * 3 )+ 2) / 4 != 0) {
            arr[index] = value * 3 + 2;
           
            index++;
          }
          if(index == x){
            break;
          }
          value++;
          
        }

        return arr;
      }

  public static void main(String[] args) {
      System.out.println("Try programiz.pro");
      // int[] array = {1,4,3,5,2,1,2,3};
    //   int[] sortedArray = selectionSort(array);
    // insertionSort(array);
      //  mergeSort(array);
     int[] array = termsOfAP(4);

      for(int num : array){
        System.out.println(num);
      }
  }
}