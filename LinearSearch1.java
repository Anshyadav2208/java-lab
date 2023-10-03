/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

//wap to demonstrate passing of single dimensional array to a function to perform linear search//
public class LinearSearch1
{
  public static int Search (int key, int[]a)
  {
     for (int i:a)
     {
         if (i==key) {
             return i;
         }
         i++;
     }
     return -1;
	  
  }
  public static void main (String[]args)
  {
    int[] a1 = { 10, 20, 30, 50, 70, 90 };
    int key = 50;
    int i = Search (key,a1);
    if (i == -1)
      System.out.println ("Element not found");
    else
      System.out.println ("Element found ");
  }
}
