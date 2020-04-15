/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liststacktemplate;

/**
 *
 * @author Paul
 * @param <T>
 */
public class MyList<T> {

    ListNode head;
    ListNode last;
    int size = 0;

    /**
     * get the ith element stored in the list. Note that this does not return
     * the containing node, but the stored element in the node. Null if D.N.E.
     *
     * @param i
     * @return
     */
    public T get(int i) {
        ListNode x = head;
        if (i > size) {
            return null;
        }
        for (int j = i; j > 0; j--) {
            x = x.next;
        }
        return (T) x.getValue();
    }

    /**
     * Add an element to the end of the list.
     *
     * @param v the element to insert.
     * @return the modified list object
     */
    public MyList<T> add(T v) {
        ListNode node = new ListNode(v);
        if (size == 0) {
            head = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }
        size++;
        return this;
    }

    /**
     * removes an element (node) at the index specified.
     *
     * @param i
     * @return the element which was removed. null if invalid index.
     */
    public T removeAtIndex(int i) {
        /*
        Be careful here! think about edge cases. If you choose to keep a
        'last' pointer, what if the element being removed is last?
         */
        if (i == 0) {
            ListNode deleted = head;
            head = deleted.next;
            size--;
            return (T) deleted.value;
        } else if (i == (size - 1)) {
            ListNode deleted = last;
            ListNode newLast = head;
            for (int j = 0; j < i - 1; j++) {
                newLast = newLast.next;
            }
            newLast.next = null;
            last = newLast;
            size--;
            return (T) deleted.value;
        } else {
            ListNode current = head;
            for (int j = 0; j < i - 1; j++) {
                current = current.next;
            }
            ListNode deleted = current.next;
            current.next = current.next.next;
            size--;
            return (T) deleted.value;
        }
    }

    /**
     * returns the index of the element given. -1 if not found.
     *
     * @param v The element to look for.
     * @return the index or -1 if not found.
     */
    public int indexOf(T v) {
        ListNode current = head;
        for (int i = 0; i < size; i++) {
            if (current.value == v) {
                return i;
            }
            current = current.next;
        }
        return -1;
    }

    /**
     * removes the first occurrence of given element. Does nothing if the
     * element is not present in the list.
     *
     * @param v the element to remove
     * @return the modified list to allow chaining i.e.
     * ls.remove(3).remove(4)...
     */
    public MyList<T> remove(T v) {
        ListNode current = head;
        for (int i = 0; i < size; i++) {
            if (current.value == v) {
                removeAtIndex(i);
                return this;
            }
            current = current.next;
        }
        return this;
    }

    /**
     * calculates and returns the size/length of the list.
     *
     * @return the length/size.
     */
    public int size() {
        return size;
    }

    /**
     * Answers if there are any elements in the list.
     *
     * @return true if list contains at least 1 element, false otherwise.
     */
    public boolean isEmpty() {
        if (size > 0) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * A pretty toString for lists.
     *
     * @return MyList: [elem1, elem2, elem3...]
     */
    @Override
    public String toString() {
        String s = "MyList: [";
        ListNode current = head;
        for (int i = 0; i < size -1; i++) {
            s = s + current.value.toString() + ", ";
            current = current.next;
        }
        s = s + current.value.toString() + "]";
        return s;
    }

}
