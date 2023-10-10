/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
 class Animal
{
    public void eat(){
         System.out.println("i can eat");
         
    }
}
class Dog extends Animal
{
    public void eat()
    {
    super.eat();
    System.out.println(" i eat dog food");
    }
    public void bark(){
        System.out.println("i can bark");
        
    }
} 
class Main3{
    
	public static void main(String[] args)
	{
	Dog labrador = new Dog();
	labrador.eat();
	labrador.bark();
	
	}
}