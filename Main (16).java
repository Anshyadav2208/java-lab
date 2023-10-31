/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class ThreadCount extends Thread{
    ThreadCount(String s)
    {
        super(s);
         System.out.println("new thread created" + this);
         start();
    }
    public static void main(String[] args) {
        try
        {
            for(int i = 0;i<10;i++)
            {
                System.out.println("new thread created" + this);
                Thread.sleep(1500);
                
            }
        }
        catch(Exception e)
        {
            System.out.println("currently executing thread is interrupted");
        }
         System.out.println("currently executing thread is interrupted");
    }
    
}
public class Main{
    ThreadCount obj = new ThreadCount("s");
    obj.start();
}
