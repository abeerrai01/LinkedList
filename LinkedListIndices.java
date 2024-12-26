import java.util.*;
public class LinkedListIndices
{
   static LinkedList obj=new LinkedList<>();
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        while(true)
        {
        System.out.println("WHAT TO DO YOU WANT TO PERFORM \n 1: ADD \n 2 : RETRIEVE \n 3 : REPLACE \n 4 : EXIT \n");
        int ch=in.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("ENTER INDEX : ");
                int index=in.nextInt();
                System.out.println("ENTER VALUE : ");
                int value=in.nextInt();
                add(index,value);
                break;
            case 2:
                System.out.println("ENTER INDEX : ");
                index=in.nextInt();
                retrieve(index);
                break;
            case 3:
                System.out.println("ENTER INDEX : ");
                index=in.nextInt();
                System.out.println("ENTER VALUE : ");
                value=in.nextInt();
                replace(index,value);
                break;
            case 4:
            {
                System.exit(0);
                break;
            }
            default:
                System.out.println("WRONG INPUT");
                break;
        }
    }
        
    }
    public static void add(int index,int value)
    {
        obj.add(index,value);
    }
    public static void retrieve(int index)
    {
        obj.get(index);
    }
    public static void replace(int index,int value)
    {
        obj.set(index,value);
    }
}
