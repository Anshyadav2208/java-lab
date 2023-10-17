/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
//finally block
class Main{
    public static void main(String[] args)
    {
    try{
        int divideByzero=5/1;
    }
    
    catch(ArithmeticException e){
        System.out.println("ArithmeticException=>"+e.getMessage());
    }
    finally{
         System.out.println("This is final block");
    }
    }
}