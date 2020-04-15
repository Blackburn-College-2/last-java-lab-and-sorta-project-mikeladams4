/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liststacktemplate;

/**
 *
 * @author Paul
 */
public class ListNode<T> {
    
    T value;
    ListNode next;
    
    /**
     * Create a new ListNode given a value.
     *
     * @param v
     */
    ListNode(T v) {
        value = v;
        System.out.println("Node created. Value : " + v.toString());
    }

    /**
     * return the value being held by this Node.
     *
     * @return
     */
    public T getValue() {
        return value;
    }
}
