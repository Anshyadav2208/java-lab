/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class ArrOfString
{
    
	public static void main(String[] args) {
	    String[][]s=new String[2][2];
	    Scanner sc=new Scanner(System.in);
	    for(int i=0;i<2;i++)
	    {
	        for(int j=0;j<2;j++)
	        {
	        System.out.println("Enter String");
	        s[i][j]=sc.nextLine();
	        }
	    }
	    for(String []k:a)
	    for(String val:k)
	    {
	        System.out.println(val);
	    }
	}
}
