/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
interface Solution {
    public void Hello();
    public void Welcome();
}

public class A implements Solution {
    public void Hello() {
        System.out.println("Hello world");
    }

    public void Welcome() {
        System.out.println("Welcome to Edureka");
    }

    public static void main(String[] args) {
        A a = new A();
        a.Hello();
        a.Welcome();
    }
}