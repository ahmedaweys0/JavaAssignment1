import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStackJava {
    public static void main(String[] args) {
        // Create a stack of integers
        Stack<Integer>   S1= new Stack<>();

        // Push some elements
        S1.pushStack(70);
        S1.pushStack(20);
        S1.pushStack(60);
        S1.pushStack(50);
        S1.pushStack(550);

        // Display the stack
        S1.display();

        // Peek at the top element
        System.out.println("Top element at peek: " + S1.peekStack());

        // Pop an element
        System.out.println("Pop element: " + S1.popStack());

        // Display again after popping
        S1.display();

        // Push another element
        S1.pushStack(40);
        S1.pushStack(50);

        // Display final stack
        S1.display();

        // Show size
        System.out.println("Current stack size: " + S1.size());

        // Check if empty
        System.out.println("Is the stack empty? " + S1.isEmpty());
    }
}

class Stack<T> {
    private static final int DEFAULT = 3;
    private int TOPON;
    private T[] ArryStackVariable;

    // No-arg constructor
    Stack() {
        this(DEFAULT);
    }

    Stack(int Inizialization) {
        TOPON = 0;
        ArryStackVariable= (T[]) (new Object[Inizialization]);
    }

    // size
    public int size() {
        return TOPON;
    }

    // push method
    public void pushStack(T Element) {
        if (size() == ArryStackVariable.length)
            Expand();
        ArryStackVariable[TOPON] = Element;
        TOPON++;
    }

    // pop method
    public T popStack() {
        if (isEmpty())
            throw new EmptyStackException();
        else {
            T Result = ArryStackVariable[--TOPON];
            ArryStackVariable[TOPON] = null;
            return Result;
        }
    }

    // peek method
    public T peekStack() {
        if (isEmpty())
            throw new EmptyStackException();
        else
            return ArryStackVariable[TOPON - 1];
    }

    // isEmpty method
    public boolean isEmpty() {
        return TOPON == 0;
    }

    // expand method balaari wayay
    public void Expand() {
        ArryStackVariable = Arrays.copyOf(ArryStackVariable, ArryStackVariable.length * 2);
    }

    // display method
    public void display() {
        if (isEmpty())
            throw new EmptyStackException();
        else {
            System.out.println("The element of the Stack is :");
            for (int x = 0; x <TOPON; x++)
                System.out.print(ArryStackVariable[x] + " ");
            System.out.println();
        }
    }
}
