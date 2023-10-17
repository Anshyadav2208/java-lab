/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
//two types of exception of array(NullPointerException & ArrayIndexOutOfBoundsException)
class MultiCatch{
    public static void main(String[] args)
    {
        String s=null;
        int arr[]={10,20,30};
        try{
            System.out.println(arr[2]);
            System.out.println(s.length());
            
            
        
    }
    
    catch(ArrayIndexOutOfBoundsException e1){
        
        System.out.println("Exception Index Out Of Bounds"+e1);
    }
    catch(NullPointerException e2)
    {
         System.out.println("Exception NullPointer"+e2);
    }
    }
}