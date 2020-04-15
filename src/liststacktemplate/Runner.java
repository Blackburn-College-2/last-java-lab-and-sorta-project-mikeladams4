
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
        MyList<String> ls1 = new MyList().add("a").add("b").add("c").add("d");
        System.out.println(ls1);
        System.out.println("get index3: " + ls1.get(3));
        System.out.println("remove x: " + ls1.remove("x"));
        System.out.println("remove c: " + ls1.remove("c"));
        System.out.println(ls1);
        System.out.println("index of a: " + ls1.indexOf("a"));
        ls1.removeAtIndex(0);
        System.out.println("removed index 0: " + ls1);
        System.out.println(ls1.size());
        MyList<String> ls2 = new MyList().add("a").add("b");
        ls2.removeAtIndex(1);
        ls2.add("d");
        System.out.println(ls2);
        MyStack stack = new MyStack<Integer>();
        stack.push(50);
        stack.push(3);
        stack.push(40000);
        stack.push(233);
        System.out.println("My stack:");
        System.out.println(stack);
        MyStack stack2 = new MyStack<String>();
        stack2.push("hi").push("hello").push("last pushed");
        System.out.println(stack2);

    }

}
