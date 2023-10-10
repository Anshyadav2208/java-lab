/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
//creATE A parent class with two methods area and parameter
class Parent
{
  void display ()
  {
    System.out.println ("This is the parent class");
  }
  void show (int num)
  {
    System.out.println ("the number in the parent class" + num);
  }
}

class Child extends Parent
{
  @Override void display ()
  {
    System.out.println ("This is the child class");
  }
  void show (double num)
  {
    System.out.println ("The number in the child class is" + num);
  }
}

public class Main
{
  public static void main (String[]args) {
  Parent parentObj = new Parent ();
    Child childObj = new Child ();
    parentObj.show (5);
    childObj.show (7.5);
    parentObj.display ();
    childObj.display ();
}
}
