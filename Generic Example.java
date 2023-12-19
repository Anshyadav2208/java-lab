/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Ex {

    void fa(Ex x) {
        System.out.println(x);
    }

    public static void main(String[] args) {
        Ex ex = new Ex();
        String[] sila = new String[] { "cat", "day" };
        ex.fa(ex);
    }
}