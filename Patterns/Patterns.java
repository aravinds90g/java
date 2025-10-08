package Patterns;
import java.util.Scanner;

public class Patterns {
    // public static void main(String[] args) {
    // for(int i= 0; i<4 ; i++){
    // for(int j=0; j<4;j++){
    // System.out.print("* ");
    // }
    // System.out.println("");
    // }
    // }

    // public static void main(String[] args) {
    // for (int i = 0; i < 5; i++) {
    // for (int j = 5 - i; j <= 5; j++) {
    // System.out.print("* ");
    // }
    // System.out.println("");
    // }
    // }

    // public static void main(String[] args) {
    // for (int i = 0; i <=5; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print(j+" ");
    // }
    // System.out.println("");
    // }
    // }

    // public static void main(String[] args) {
    // for (int i = 0; i <= 5; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print(i + " ");
    // }
    // System.out.println("");
    // }
    // }

    // public static void main(String[] args) {
    // for (int i = 0; i <= 5; i++) {
    // for (int j = 1; j <= 5-i; j++) {
    // System.out.print( "* ");
    // }
    // System.out.println("");
    // }
    // }

    // public static void main(String[] args) {
    // for (int i = 0; i <= 5; i++) {
    // for (int j = 1; j <=5- i; j++) {
    // System.out.print(j + " ");
    // }
    // System.out.println("");
    // }
    // }

    public static void print1(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }

    // public static void print2(int n) {
    // for (int i = 0; i <= n; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print(" ");
    // }
    // for (int j = 1; j <= n-i; j++) {
    // System.out.print("* ");
    // }

    // System.out.println("");
    // }
    // }

    // public static void print3(int n) {
    // for (int i = 0; i <= n; i++) {
    // for (int j = 1; j <= n - i; j++) {
    // System.out.print(" ");
    // }
    // for (int j = 1; j <= i; j++) {
    // System.out.print("* ");
    // }

    // System.out.println("");
    // }

    // for (int i = 0; i <= n; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print(" ");
    // }
    // for (int j = 1; j <= n-i; j++) {
    // System.out.print("* ");
    // }

    // System.out.println("");
    // }
    // }

    // public static void print4(int n) {
    // for (int i = 0; i <= n; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");
    // }
    // System.out.println("");
    // }
    // for (int i = 0; i <= n; i++) {
    // for (int j = 2; j <=n-i; j++) {
    // System.out.print("*");
    // }
    // System.out.println("");
    // }
    // }
    // public static void print5(int n) {
    // int start = 0;
    // for (int i = 0; i <= n; i++) {
    // if(i%2==0) start = 0;
    // else start = 1;
    // for (int j = 1; j <= i; j++) {
    // System.out.print(start + " ");
    // start = 1-start;
    // }
    // System.out.println("");
    // }
    // }

    // public static void print6(int n){
    // for(int i=1; i<=n;i++){
    // for(int j=1; j<=i;j++){
    // System.out.print(j+" ");
    // }
    // for (int j = 1; j <= 4*(n-i); j++) {
    // System.out.print( " ");
    // }

    // for (int j = i; j >=1; j--) {
    // System.out.print(j+" ");
    // }
    // System.out.println("");
    // }
    // }

    // public static void print7(int n) {
    // int count = 1;
    // for (int i = 1; i <= n; i++) {

    // for (int j = 1; j <= i; j++) {
    // System.out.print(count + " ");
    // count++;
    // }
    // System.out.println("");
    // }
    // }

    public static void print8(int n) {
        for (int i = 1; i <= n; i++) {
            for (char j = 'A'; j < 'A' + i; j++) {
                System.out.print(j + " ");
            }

            System.out.println("");
        }
    }

    public static void print9(int n) {
        for (int i = 1; i <= n; i++) {
            for (char j = 'A'; j < 'A' + n - i; j++) {
                System.out.print(j + " ");
            }

            System.out.println("");
        }
    }

    public static void print10(int n) {
        for (int i = 1; i <= n; i++) {
            char ch = (char) ('A' + i - 1);
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
            }

            System.out.println("");
        }
    }

    public static void print11(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            for (int j = 0; j < 2 * i - 1; j++) {
                int breakPoint = (2 * i - 1) / 2;
                if (j <= breakPoint)
                    ch = (char) ('A' + j);
                else
                    ch--;
                System.out.print(ch + "");
            }
            System.out.println("");
        }
    }

    public static void print12(int n) {
        for (int i = 0; i < n; i++) {

            for (char ch = (char) ('E' - i); ch <= 'E'; ch++) {
                System.out.print(ch + "");
            }
            System.out.println("");
        }
    }

    public static void print13(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <= 2 * i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <= 2 * (n - i) - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void print14(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <= 2 * (n - i) - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <= 2 * i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // public static void print16(int n) {
    //      for (int i = 0; i < n; i++) {
    //          for (int j = 0; j < n; j++) {
    //             if(i==0) {
    //                 System.out.print("*")
    //             }
    //             elif(i==n){
    //                 System.out.println("*");
    //             } 
    //          }
             
    //      }
         
    //  }

    
   public static String[] print17(int n){
       String[] star = new String[n];
       int index = 0;

       // Top half
       for (int i = 1; i <= n / 2 + 1; i++) {
           String temp = "";
           for (int j = 1; j <= i; j++) {
               temp += "*";
           }
           star[index] = temp;
           System.out.println(temp);
           index++;
       }

       // Bottom half
       for (int i = n / 2; i >= 1; i--) {
           String temp = "";
           for (int j = 1; j <= i; j++) {
               temp += "*";
           }
           star[index] = temp;
           System.out.println(temp);
           index++;
       }

       return star;

   }
    public static void main(String[] args) {
        // print11(8);
        // print16(3);
        String[] value = print17(7);

        for(String s: value){
            System.out.println(s);
        }
    }

}
