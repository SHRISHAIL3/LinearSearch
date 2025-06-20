package Linear;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//A teacher has a list of student roll numbers who submitted an assignment.
//A few students may have submitted it more than once due to system error.
//Write a Java program using Linear Search to return all positions where a particular
//roll number (e.g., 105) appears
public class Student1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int submitted[]={101,102,103,101,103,104,105,106,104,106,108};
        int pos[]=new int[submitted.length];

        System.out.println("Enter student roll no to submitted or not:");
        int x=sc.nextInt();

        int count=0;
        List f=new ArrayList();

        for (int i = 0; i <submitted.length ; i++) {
            if(submitted[i]==x){
                count++;
                f.add(i);

            }

        }

        if(count>0){
//            we are storinf here in object because we didnt specfied in arraylist ..
           for(Object index:f){
               System.out.println("Student submitted at this particular pos "+index);
           }
        }else{
            System.out.println("NOT FOUND");
        }


    }
}

