/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class MultithreadingDemo implements Runnable {

    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running by Java");
        } catch (Exception e) {
            System.out.println("Exception is caught here");
        }
    }

    public static void main(String[] args) {
        int n = 5; 

        for (int i = 0; i < n; i++) {
            Thread thread = new Thread(new MultithreadingDemo());
            thread.start();
        }
    }
}