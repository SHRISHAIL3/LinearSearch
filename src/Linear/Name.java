package Linear;

import java.util.Scanner;
//searches for a student name in an array of Strings using Linear Search.
public class Name {
    static public String names(String s[],String name){
        for (int i = 0; i <s.length ; i++) {
            if(s[i].equalsIgnoreCase(name)){
                return "i";
            }

        }
        return "-1";


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] s={"shri","sak","pam"};
        System.out.println("Enter name To know whether its present or not");
        String x=sc.next();
        String ans=names(s,x);
        System.out.println("match found "+x+" at index "+ ans);

    }
}
