/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Ex {
    public void printArray(String[] s) {
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }

    public static void main(String[] args) {
        Ex ex = new Ex();
        String[] animals = new String[] { "cat", "dog", "cow" };
        ex.printArray(animals);
    }
}
