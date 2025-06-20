package Linear;
//Given an array of integers, write a Java method to find the index of
// the first occurrence of a given number using Linear Search.
//Modify the Linear Search to return -1 if the element is not found.

import java.util.Scanner;

public class method {

   static public int FindNum(int a[],int num){
       for (int i = 0; i <a.length ; i++) {
           if(a[i]==num){
               return i;

           }

       }
       return -1;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int n= sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i <a.length ; i++) {
            a[i]= sc.nextInt();

        }
        System.out.println("Enter the Element to find");
        int x=sc.nextInt();

        System.out.println( "Element found at "+FindNum(a,x));

    }
}
