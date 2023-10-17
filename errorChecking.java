/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class errorChecking
{
    public static void main(String []args){

try{
    int x=10;
    int y=0;
    int z=x/y;
    System.out.println(z);
    
}
catch(Exception err)
{
    System.out.println(err.getMessage());
    
}
}
}