import java.util.*;
class Stack
{
  int top=-1;
  Scanner in=new Scanner(System.in);
  LinkedList<Integer> obj=new LinkedList<Integer>(); 
  public void push(int x)
  {
       obj.push(x);
        System.out.println("ELEMENT PUSHED IN STACK : "+x);
    }
  public void pop()
  {
    if(obj.isEmpty())
    {
        System.out.println("Stack underflow");
    }
    else
    {
        int y=obj.pop();
        System.out.println("ELEMENT POPPED FROM STACK : "+y);
    }
  }
  public void peek()
  {
    if(obj.isEmpty())
    {
        System.out.println("Stack underflow");
    }
    else
    {
        System.out.println("Top element is "+obj.peek());
    }
  }
  public void display()
  {
    if(obj.isEmpty())
    {
        System.out.println("Stack underflow");
    }
    else
    {
        for(int i=obj.size()-1;i>=0;i--)
        {
            System.out.println(obj.get(i));
        }
    }
  }
}
public class LinkedListArrayList
 {
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        Stack obj=new Stack();
        boolean flag=true;
        while(flag)
        {
        System.out.println("Enter Your Choice : \n 1 : Push \n 2 : Pop \n 3 : Peek \n 4 : Display \n 5 : Exit \n");
        int ch=in.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Enter Element : ");
                int x=in.nextInt();
                obj.push(x);
                break;
            case 2:
                obj.pop();
                break;
            case 3:
                obj.peek();
                break;
            case 4:
                obj.display();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("wrong choice");
                break;
        }
        System.out.println("Do you want to continue : \n 1 : Yes \n 2 : No \n");
        int x=in.nextInt();
        if(x==1)
         {
            flag=true;
         }
         else
         {
            flag=false;
         }
    }
    
}
 }