/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
//one try Multiple catch 
import java.util.Scanner;
public class Test{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
    try{
        int n=Integer.parseInt(scn.nextLine());
        if(99%n==0)
       System.out.println("is a factor of 99");
    }
    
    catch (ArithmeticException ex){
        System.out.println("Arithmetic"+ex);
    }
    catch(NumberFormatException ex)
    {
         System.out.println("Number Format Exception" + ex);
    }
    }
}