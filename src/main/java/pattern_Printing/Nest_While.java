package pattern_Printing;
public class Nest_While {
    public static void main(String[] args)
    {
        int i=1,j=1;
        while(i<=3)
        {
            while(j<=3)
            {
                System.out.println(i+" - "+j);
                j++;
            }
            System.out.println("---------");
            i++;
        }
    }


}