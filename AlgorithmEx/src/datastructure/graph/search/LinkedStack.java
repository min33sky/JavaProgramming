package datastructure.graph.search;

/**
 * Created by kjnam on 2016. 5. 22..
 */
public class LinkedStack {
    StackNode top;

    public boolean isEmpty() {
        return (top == null);
    }

    public void push(int item) {
        StackNode newNode = new StackNode();
        newNode.data = item;
        newNode.link = top;
        top = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Delete Failed. Linked Stack is Empty!");
            return 0;
        } else {
            int item = top.data;
            top = top.link;
            return item;
        }
    }
}
