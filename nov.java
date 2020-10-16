import java.util.Scanner;

public class b_charAt
{

    /* char charAt(int index)
    Returns the char value at the specified index */
    
    public static void main(String args[])
    {
        String s;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter a string");
        s=sc.nextLine();
        System.out.println("Character="+s.charAt(2));
    }
}
