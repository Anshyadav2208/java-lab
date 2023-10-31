/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main implements Runnable{

    public void run() {
        System.out.println("Welcome To CSIT");
    }

    public static void main(String[] args) {
        Main t1 = new Main();
        Thread n1=new Thread(t1);
        Main t2 = new Main();
        Thread n2=new Thread(t2);
        Main t3 = new Main();
        Thread n3=new Thread(t3);
        
        n1.start();
        n2.start();
        n3.start();
    }
}