package JavaFundamental.Collection.List_Interface;

import java.util.Stack;

public class Day5_Stack {
    public static void main(String [] args){
        Stack <Integer> stack = new Stack<>();

        System.out.println("The Insert element is :");

        stack.push(20);// insert
        stack.push(15);
        stack.push(35);

        System.out.println(stack);

        System.out.println("The peek/Top  the element is : "+stack.peek());

        System.out.println("One item is remove is 35");
        stack.pop();// remove

        System.out.println("Current stack items is : "+stack);

        System.out.println("The peek/Top element is : "+stack.peek());
        System.out.println("The size of the stack element is : "+stack.size());

        stack.push(8);

        System.out.println("Current stack item is :"+stack);

        System.out.println("Current peek / top element is : "+stack.peek());

        System.out.println("Check the list of stack is not empty  : "+stack.isEmpty());






    }
}
