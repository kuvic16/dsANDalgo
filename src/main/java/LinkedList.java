/**
 * @Author Shaiful Islam Palash | kuvic16@gmail.com
 * @CreatedAt: 1/8/2022
 */

/**
 * A linked list is a linear data structure, in which the elements are not stored at
 * contiguous memory locations. The elements in a linked list are linked using
 * pointers.In simple words, a linked list consists of nodes where each node contains a data
 * field and a reference(link) to the next node in the list.
 */
public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static LinkedList insert(LinkedList list, int data) {
        Node new_node = new Node(data);
        new_node.next = null;

        if(list.head == null) {
            list.head = new_node;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }


    public static void printList(LinkedList list)
    {
        Node currentNode = list.head;
        System.out.println("LinkedList: ");
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }


    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        printList(list);
    }

















}
