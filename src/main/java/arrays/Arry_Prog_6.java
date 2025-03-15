package arrays;
import java.util.Scanner;

public class Arry_Prog_6 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n=sc.nextInt();
        String[] colors=new String[n];
        int sz=colors.length;
        System.out.println("Print Any "+n+" Colors Name");
        for(int i=1;i<sz;i++)
        {
            System.out.println(i);
            colors[i]=sc.next();
        }
        System.out.println("---------");
        for(int i=0;i<sz;i++)
        {
            System.out.println(colors[i]);
        }
    }
}
