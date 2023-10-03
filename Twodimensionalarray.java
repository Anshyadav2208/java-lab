/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Twodimensionalarray
{
    public static void main(String[] args)
    {
        int[][] a={{10,20},{30,40},{50,60}};
        
        System.out.println("Two dimensional array elements are");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<2;j++)
            {
        
        
        System.out.print(a[i][j]);
            }
            System.out.println();
    
        }
}
}