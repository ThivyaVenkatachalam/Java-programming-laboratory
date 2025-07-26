import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner t = new Scanner(System.in);
	    int n = t.nextInt();
	    int fact=1;
	    for(int i=1;i<=n;i++)
	    {
	        fact = fact*i;
	    }
		System.out.println("The factorial is "+fact);
	}
}
