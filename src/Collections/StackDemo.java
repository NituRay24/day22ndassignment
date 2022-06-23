package Collections;
import java.util.*;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Iterator;
public class StackDemo {
    public void demoOfStack()
    {
        Stack<String> strStack = new Stack<>();
        System.out.println(strStack.isEmpty()); // true
        System.out.println(strStack.size()); // 0
//System.out.println(strStack.peek()); // EmptyStackException
        strStack.add("Nithin");
        strStack.push("rahul");// to insert element into the stack
        strStack.push("Sushma");
        strStack.push("Amol");
        System.out.println("Push neha returns: "+ strStack.push("Jiya"));
        strStack.push("Amit");
        System.out.println(strStack);
        strStack.pop(); // To remove an element from the top of the stack
        System.out.println(strStack);
        strStack.remove("Amol"); // To remove a particular element from the stack
        System.out.println(strStack);
        System.out.println(strStack.indexOf("Jiya dehradun")); // returns -1 if that element is not present
        System.out.println("Add ashwini returns: "+strStack.add("Ashwini"));
        strStack.add("Narsing");
        System.out.println(strStack);
    }



    public static void main(String[] args)
    {
        StackDemo stk=new StackDemo();
        stk.demoOfStack();
    }

}
