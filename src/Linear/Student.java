package Linear;
//A teacher has a list of student roll numbers who submitted an assignment.
// She wants to check whether a particular student (say, roll number 105) submitted it or not.
import java.util.Scanner;
public class Student {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rollno[]={101,102,103,104,105,106};

        System.out.println("Enter rollno to know either submitted or not");
        int x=sc.nextInt();
        boolean submitted =false;

        for (int i = 0; i < rollno.length; i++) {
            if (rollno[i]==x){
                submitted=true;
                break;
            }else {
                submitted=false;
            }

        }
        if(submitted != false){
            System.out.println("submitted");
        }else {
            System.out.println("not submitted");
        }
    }
}
