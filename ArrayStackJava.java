import java.util.Arrays;
import java.util.EmptyStackException;
public class ArrayStackJava<T> {
    private static final int DEFAULT = 3;
    private int kor;
    private T[] stackarray;

    //No Argument Constructor

    ArrayStackJava() {this(DEFAULT);
    }
    ArrayStackJava(int InitialSize) {
        kor = 0;
        stackarray = (T[]) (new Object[InitialSize]);

    }
    //size method

    public int size() {
        return kor;
    }

    //push method

    public void push(T element) {
        if (size() == stackarray.length)
            Expand();
        stackarray[kor] = element;
        kor++;
    }

    //pop method

    public T pop() {
        if (isEmpty())
            throw new EmptyStackException();
        else {
            //top--;
            T natiijo = stackarray[--kor];
            stackarray[kor] = null;
            return natiijo;
        }
    }

    //peek method

    public T peek(){
        if (isEmpty())
            throw new EmptyStackException();
        else
            return stackarray[kor-1];
    }

    //isEmpty method

    public boolean isEmpty(){
        return kor ==0;
    }

    //expand method

    public void Expand(){
        stackarray = Arrays.copyOf(stackarray,stackarray.length*4);
    }

    //display

    public void displaymethod(){
        if (isEmpty())
            throw new EmptyStackException();
        else
            System.out.println("Elements of an array: ");
        for (int n = 0; n<kor;n++)
            System.out.println(stackarray[n] + " ");
        System.out.println();
    }
}