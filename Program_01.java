//Program_01
/*Write a program to assign length and breadth and print if it is a square or rectangle*/
//4.6.24
//Suday Dutta
//Greenwood High
class Program_01
{
    void check(int l, int b)
    {
        if(l==b)
        {
            System.out.println("It is a square");
        }
        else
        {
            System.out.println("It is a rectangle");
        }
    }
    public static void main()
    {
        int l = 4;
        int b = 3;
        Program_01 p = new Program_01();
        p.check(l, b);
    }
}