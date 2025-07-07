
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


     public static void insertionSort (int[] arr){
        for(int i=1;i<arr.length;i++){
          int temp = arr[i];
          int j=i-1;
          while(j>=0&&arr[j]>temp){
              arr[j+1] = arr[j];
              j--;
            }
          arr[j+1] = temp;
        }
     }
  public static void main(String[] args) {
      System.out.println("Try programiz.pro");
      int[] array = {1,4,3,5,2};
    //   int[] sortedArray = selectionSort(array);
    insertionSort(array);
      for(int num : array){
        System.out.println(num);
      }
  }
}