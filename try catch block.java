/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
//try catch block
public class Main
{
	public static void main(String[] args) {
	    try{
	        int d=5/0;
	        System.out.println("Rest of code in try block");
	        
	    }
	    catch(ArithmeticException e){
		System.out.println("ArithmeticException=>"+e.getMessage());
	}
}
}
