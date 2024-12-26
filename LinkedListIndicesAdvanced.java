import java.util.*;
public class LinkedListIndicesAdvanced
{
   static LinkedList obj=new LinkedList<>();
   static LinkedList obj2=new LinkedList<>();
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
                System.out.println("WE HAVE TO TWO LINKEDLIST WHERE DO YOU WANT ENTER ELEMENT \n 1: ONE LINKEDLIST \n 2 : TWO LINKEDLIST \n 3 : ADD ALL ELEMENTS OF TWO LINKEDLIST IN ONE 4 : ADD ALL ELEMENTS OF TWO LINKEDLIST IN ONE At SPECIFIED POSITION \n");
                int n=in.nextInt();
                if(n==1)
                {
                System.out.println("ENTER INDEX : ");
                int index=in.nextInt();
                System.out.println("ENTER VALUE : ");
                int value=in.nextInt();
                add(index,value);
                break;
                }
                else if(n==2)
                {
                    System.out.println("ENTER INDEX : ");
                    int index=in.nextInt();
                    System.out.println("ENTER VALUE : ");
                    int value=in.nextInt();
                    add2(index,value);
                    break;
                }
                else if(n==3)
                {
                    
                    add3(obj2);
                    break;
                }
                else
                {
                    System.out.println("ENTER INDEX : ");
                    int index=in.nextInt();
                    
                    add4(index,obj2);
                    break;
                }
                
            case 2:
            System.out.println("WE HAVE TO TWO LINKEDLIST WHERE DO YOU WANT RETRIEVE ELEMENT \n 1: ONE LINKEDLIST \n 2 : TWO LINKEDLIST \n");
                int y=in.nextInt();
                if(y==1)
                {
                    System.out.println("ENTER INDEX : ");
                int index=in.nextInt();
                retrieve(index);
                break;
                }
                else
                {
                    System.out.println("ENTER INDEX : ");
                int index=in.nextInt();
                retrieve2(index);
                break;
                }
            case 3:
            System.out.println("WE HAVE TO TWO LINKEDLIST WHERE DO YOU WANT REMOVE ELEMENT \n 1: ONE LINKEDLIST \n 2 : TWO LINKEDLIST \n");
                int z=in.nextInt();
                if(z==1)
                { 
                    System.out.println("ENTER INDEX : ");
                int index=in.nextInt();
                System.out.println("ENTER VALUE : ");
                int value=in.nextInt();
                replace(index,value);
                break;
                }
                else
                {
                    System.out.println("ENTER INDEX : ");
                int index=in.nextInt();
                System.out.println("ENTER VALUE : ");
                int value=in.nextInt();
                replace2(index,value);
                break;
                }
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
        System.out.println("ELEMENT ADDED SUCCESSFULLY");
    }
    public static void add2(int index,int value)
    {
        obj2.add(index,value);
        System.out.println("ELEMENT ADDED SUCCESSFULLY");
    }
    public static void add3(Collection c)
    {
        obj.addAll(obj2);
        System.out.println("ELEMENT ADDED SUCCESSFULLY");
    }
    public static void add4(int index,Collection c)
    {
        obj.addAll(index,c);
        System.out.println("ELEMENT ADDED SUCCESSFULLY");
    }
    public static void retrieve(int index)
    {
        System.out.println(obj.get(index));
    }
    public static void retrieve2(int index)
    {
        System.out.println(obj2.get(index));
    }
    public static void replace(int index,int value)
    {
        obj.set(index,value);
        System.out.println("ELEMENT REPLACED SUCCESSFULLY");
    }
    public static void replace2(int index,int value)
    {
        obj2.set(index,value);
        System.out.println("ELEMENT REPLACED SUCCESSFULLY");
    }

}
