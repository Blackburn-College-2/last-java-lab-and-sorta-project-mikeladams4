
import liststacktemplate.MyList;
import liststacktemplate.MyStack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Paul
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyList list = new MyList();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println("Size: " + list.size());
        System.out.println("List: " + list.toString());
        System.out.println("3 is located at index: " + list.indexOf(3));
        System.out.println("Value removed at index 3: " + list.removeAtIndex(3));
        System.out.println("Size: " + list.size());
        System.out.println("List: " + list.toString());
        list.remove(5);
        System.out.println("Size: " + list.size());
        System.out.println("List: " + list.toString());
        MyStack stack = new MyStack();
        stack.push(8);
        stack.push(3);
        stack.push(44);
        stack.push(9);
        System.out.println("Stack: " + stack.toString());
        System.out.println("Stack peek: " + stack.peek());
        System.out.println("Stack pop: " + stack.pop());
        System.out.println("Stack: " + stack.toString());
    }

}
