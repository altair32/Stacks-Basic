import java.util.*;
class stackintro
{
    public static void main(String[] args)
    {   Scanner sc=new Scanner(System.in);
        Stack<Integer> stk=new Stack<>();
        for (int i=0;i>-1;i++)
    {   int n=sc.nextInt();
        if(n==-1)
        break;
        pushelement(stk,n);
        
    }
    popelement(stk);
         
    }   
    static void pushelement(Stack stk, int x)
    {
        stk.push(x);
        System.out.println(stk);

    }
    static void popelement(Stack stk)
    {
        System.out.println("Pop starts");
        int x=(Integer)stk.pop();
        System.out.println(x);
        System.out.println("stack: " + stk);  
    }
}
