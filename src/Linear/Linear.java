package Linear;


import java.util.Scanner;

public class Linear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The size of an array");
        int n= sc.nextInt();
        int a[]=new int[n];

        System.out.println("Enter the elemnts");
        for (int i = 0; i <a.length ; i++) {
            a[i]= sc.nextInt();

        }

        System.out.println("Enter The Elemnt which u want to find");
        int x= sc.nextInt();
        int count=0;

        for (int i = 0; i <a.length ; i++) {
            if(a[i]==x){
                count++;

            }


        }

        if(count>0){
            System.out.println(x+"Element found ,no of times"+count);
        }else{
            System.out.println("NO element found");
        }
    }
}
