/*
 
1.  *****
    *****
    *****
    *****
    *****


2.  *
    **
    ***
    ****
    *****


3.  *****
    ****
    ***
    **
    *


4.  1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5


5.  *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *


6.       *
        **
       ***
      ****
     *****


7.   *****
      ****
       ***
        **
         *


8.      *
       ***
      *****
     *******
    *********


9.  *********
     *******
      *****
       ***
        *


10.      *
        * *
       * * *
      * * * *
     * * * * *


11.  * * * * *
      * * * *
       * * *
        * *
         *


12.  * * * * *
      * * * *
       * * *
        * *
         *
         *
        * *
       * * *
      * * * *
     * * * * *


13.      *
        * *
       *   *
      *     *
     *********


14.  *********
      *     *
       *   *
        * *
         *


15.      *
        * *
       *   *
      *     *
     *       *
      *     *
       *   *
        * *
         *


16.           1
            1   1
          1   2   1
        1   3   3   1
      1   4   6   4   1


17.      1
        212
       32123
      4321234
       32123
        212
         1


18.   **********
      ****  ****
      ***    ***
      **      **
      *        *
      *        *
      **      **
      ***    ***
      ****  ****
      **********


19.    *        *
       **      **
       ***    ***
       ****  ****
       **********
       ****  ****
       ***    ***
       **      **
       *        *


20.    ****
       *  *
       *  *
       *  *
       ****

21.    1
       2  3
       4  5  6
       7  8  9  10
       11 12 13 14 15

22.    1
       0 1
       1 0 1
       0 1 0 1
       1 0 1 0 1

23.        *      *
         *   *  *   *
       *      *      *

24.    *        *
       **      **
       * *    * *
       *  *  *  *
       *   **   *
       *   **   *
       *  *  *  *
       * *    * *
       **      **
       *        *

25.       *****
         *   *
        *   *
       *   *
      *****

26.   1 1 1 1 1 1
      2 2 2 2 2
      3 3 3 3
      4 4 4
      5 5
      6

27.   1 2 3 4  17 18 19 20
        5 6 7  14 15 16
          8 9  12 13
            10 11

28.      *
        * *
       * * *
      * * * *
     * * * * *
      * * * *
       * * *
        * *
         *

29.      
       *        *
       **      **
       ***    ***
       ****  ****
       **********
       ****  ****
       ***    ***
       **      **
       *        *

30.         1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5


31.      4 4 4 4 4 4 4  
         4 3 3 3 3 3 4   
         4 3 2 2 2 3 4   
         4 3 2 1 2 3 4   
         4 3 2 2 2 3 4   
         4 3 3 3 3 3 4   
         4 4 4 4 4 4 4   

32.    E
       D E
       C D E
       B C D E
       A B C D E

33.    a
       B c
       D e F
       g H i J
       k L m N o
     
34.    E D C B A
       D C B A
       C B A
       B A
       A
       
35.    1      1
       12    21
       123  321
       12344321
 */
public class _q2_patternsWithKrunal {

    public static void pat1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pat2(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pat3(int n){
        for (int i = 0; i < n; i++) {
            for (int j = n-i; j >0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pat4(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
    public static void pat5(int n){
        for (int i = 0; i < 2*n; i++) {
            int cols = i>n ? 2*n-i:i;
            for (int j = cols; j>0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pat6(int n){
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j>i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pat7(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j<i; j++) {
                System.out.print(" ");
            }
            for (int j = n; j>i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pat8(int n){
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j >i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pat9(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j<i; j++) {
                System.out.print(" ");
            }
            for (int j = 2*n-i-1; j>i; j--) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
    public static void pat10(int n){
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j>i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pat11(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = n; j >i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pat12(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = n; j >i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j>i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pat13(int n){
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j >i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2*i; j++) {
                if (j==0 || j==2*i || i==n-1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
    public static void pat14(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 2*n-i+1; j >i; j--) {
                if (i==0 || j==i ||j==i-1) {
                    System.out.print("*");
                }else{

                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
    }
    public static void pat15(int n){

    }
    public static void pat16(int n){

    }
    public static void pat17(int n){

    }
    public static void pat18(int n){

    }
    public static void pat19(int n){

    }
    public static void pat20(int n){

    }
    public static void pat21(int n){

    }
    public static void pat22(int n){

    }
    public static void pat23(int n){

    }
    public static void pat24(int n){

    }
    public static void pat25(int n){

    }
    public static void pat26(int n){

    }
    public static void pat27(int n){

    }
    public static void pat28(int n){

    }
    public static void pat29(int n){

    }
    public static void pat30(int n){

    }
    public static void pat31(int n){

    }
    public static void pat32(int n){

    }
    public static void pat33(int n){

    }
    public static void pat34(int n){

    }
    public static void pat35(int n){

    }

    public static void main(String[] args) {

        pat1(5);
        pat2(5);
        pat3(5);
        pat4(5);
        pat5(5);
        pat6(5);
        pat7(5);
        pat8(5);
        pat9(5);
        pat10(5);
        pat11(5);
        pat12(5);
        pat13(5);
        pat14(5);
        pat15(5);
        pat16(5);
        pat17(5);
        pat18(5);
        pat19(5);
        pat20(5);
        pat21(5);
        pat22(5);
        pat23(5);
        pat24(5);
        pat25(5);
        pat26(5);
        pat27(5);
        pat28(5);
        pat29(5);
        pat30(5);
        pat31(5);
        pat32(5);
        pat33(5);
        pat34(5);
        pat35(5);
    }
}
