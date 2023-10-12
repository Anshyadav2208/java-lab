/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Automobile
{
	public void start() {
		System.out.println("Engine starts running");
	}
	public void stop(){
	    	System.out.println("Engine stops running");
	    	
	}
	public void seatings()
	    {
        	    	System.out.println("4 seatings");
}
class Car extends Automobile{
    public void No_Of_tyres()
    {
        	System.out.println("There are 4 tyres");
    }
    public void fuel()
    {
        	System.out.println("petrol");
    }
    public void fuel(String fuel){
        	System.out.println("Also runs on diesel");
        	}
        	public void seatings(){
        	    	System.out.println("4 seatings");
        	    	
        	}
}
class Bike extends Automobile{
    public void No_of_tyres()
    {
        	System.out.println("There are 2 tyres");
    }
    public void fuel(){
        	System.out.println("petrol");
    }
    public void seatings()
    {
        	System.out.println("2 seatings");
    }
}
}
