import java.util.*;
import java.util.Scanner;

public class marksheet01
{
    public static void main(String args[])
    {
        Scanner user=new Scanner(System.in);
        String name;
        int d,userinput;
        String sub1,sub2,sub3,sub4,sub5,sub6;
        int a,marks1, marks2, marks3, marks4, marks5, marks6;
        System.out.println("Please enter your full name: ");
        name=user.next();
//marks and subject input   
        System.out.println("Please enter Subject-1: ");
        sub1=user.next();
        marks1=user.nextInt();
        System.out.println("Please enter Subject-2: ");
        sub2=user.next();
        marks2=user.nextInt();
        System.out.println("Please enter Subject-3: ");
        sub3=user.next();
        marks3=user.nextInt();
        System.out.println("Please enter Subject-4: ");
        sub4=user.next();
        marks4=user.nextInt();
        System.out.println("Please enter Subject-5: ");
        sub5=user.next();
        marks5=user.nextInt();
        System.out.println("Please enter Subject-6: ");
        sub6=user.next();
        marks6=user.nextInt();
//prompt to generate marksheet
        System.out.println("Press 1 to generate the marksheet of the student"+name);
        userinput=user.nextInt();
//total marks
        System.out.println("Total marks scored by the student is: "+(marks1+marks2+marks3+marks4+marks5+marks6));
//percentage
        a=((marks1+marks2+marks3+marks4+marks5+marks6)/600)*100;
        System.out.println("The percentage scored by student is: "+a);
//grade
        if (a>90)
        {
            System.out.println(a+"Grade-A");
        }
        else if (a>80)
        {
            System.out.println(a+"Grade-B");
        } 
        else if (a>70)
        {
            System.out.println(a+"Grade-C");
        }
        else
        {
            System.out.println(a+"Grade-D");
        }
//divisiion        
        System.out.println("Enter student's percentage:");
        d=user.nextInt();

        if (d>60)
        {
            System.out.println("First Division");
        }
        else if (d<60 && d>45)
        {
            System.out.println("Second Division");
        } 
        else if (d>30 && d<45)
        {
            System.out.println("Third Division");
        }
        else
        {
            System.out.println("FAIL");
        }
    }
}
