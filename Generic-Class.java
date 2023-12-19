/******************************************************************************

--------------------USE OF GENERIC CLASS--------------

*******************************************************************************/
// Use of generic class
class Mydata<E> {
    E i;

    public void set(E i1) {
        i = i1;
    }

    public E get() {
        return i;
    }
}

public class Example {
    public static void main(String args[]) {
       
        Mydata<Integer> m = new Mydata<Integer>();
        Mydata<String> m1 = new Mydata<String>();

        m1.set("Rohit");
        m1.get(); 
        
    }
}