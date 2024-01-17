package StackandQueue.CustomStack;

public class StackMain {
    public static void main(String[] args) throws Exception{
        customStack stack = new customStack(5); // if size if 5 but u want to push one more item then it show stack is full
    // parent is used as type also //  but above rhs u write DynamicStack instead of customStack then it will add one more because dynamic size is double of customStack
                             // also if both side DynamicStack it also add item
        stack.push(33);
        stack.push(2);
        stack.push(5);
        stack.push(8);
        stack.push(27);
        stack.push(10);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
      //     System.out.println(stack.pop());


    }
}
