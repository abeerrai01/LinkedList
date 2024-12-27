import java.util.*;
class Student{
    int id;
    String name;
    
    Student(int id,String name){
        this.id=id;
        this.name=name;
        
    }
    public String toString(){
        return id+" "+name;
    }
}
public class StudentLinkedList{
    public static void main(String[] args)
    {
     Scanner in=new Scanner(System.in);
     System.out.println("ENTER NUMBER OF STUDENTS : ");   
     int n=in.nextInt();
     LinkedList<Student> obj=new LinkedList<>();
     for(int i=0;i<n;i++)
     {
        System.out.println("ENTER NAME OF STUDENT "+(i+1)+" : ");
        String name=in.nextLine();
        System.out.println("ENTER ID OF STUDENT "+(i+1)+" : ");
        int id=in.nextInt();
        in.nextLine();
        obj.add(new Student(id,name));
     }
     while(true)
     {
        System.out.println("\nMENU : ");
        System.out.println("1. Display");
        System.out.println("2. Add");
        System.out.println("3. Delete");
        System.out.println("4. Exit");
        System.out.print("Enter your choice : ");
        int choice=in.nextInt();
        in.nextLine(); // Consume newline
        switch(choice)
        {
            case 1:
                System.out.println(obj);
                break;
            case 2:
                System.out.println("ENTER NAME OF STUDENT : ");
                String name=in.nextLine();
                System.out.println("ENTER ID OF STUDENT : ");
                int id=in.nextInt();
                in.nextLine();
                obj.add(new Student(id,name));
                break;
            case 3:
                System.out.println("ENTER ID OF STUDENT TO BE DELETED : ");
                id=in.nextInt();
                in.nextLine();
                for(int i=0;i<obj.size();i++)
                {
                    if(obj.get(i).id==id)
                    {
                        obj.remove(i);
        }
     }
    }
}
    }
}