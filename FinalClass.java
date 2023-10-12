/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

**************************************************************************/

final class FinalClass{
    public void display(){
    System.out.println("this is final method");

    }
    }
    class Main extends FinalClass{

    public final void display(){
    System.out.println("the final method to draw is overriden");
    }
    public static void main(String []args) {
        Main obj= new Main;
        obj.display();
    }
    }

