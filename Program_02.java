//Program_2
/*Write a program to input the values of length and breadth and print if it is a square or rectangle*/
//4.6.24
//Suday Dutta
//Greenwood High
import java.util.*;
class Program_02
{
    int l, b;
    String res = "";
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length below:");
        l = sc.nextInt();
        System.out.println("Enter breadth below:");
        b = sc.nextInt();
    }
    void compute()
    {
        if(l==b)
        {
            res = "square";
        }
        else
        {
            res = "rectangle";
        }
    }
    void display()
    {
        System.out.println("The shape is a "+res);
    }
    public static void main()
    {
        Program_02 s = new Program_02();
        s.input();
        s.compute();
        s.display();
    }
}