package hackerrank;

public class HRLinkedListPrintInReverse {

    public static void main(String[] args) {

        LinkedList list1 = new LinkedList();
        list1.addElementAtBegining("H");
        list1.addElementAtBegining("G");
        list1.addElementAtBegining("F");
        list1.addElementAtBegining("E");
        list1.addElementAtBegining("D");
        list1.addElementAtBegining("C");
        list1.addElementAtBegining("B");
        list1.addElementAtBegining("A");

        list1.printList();

        System.out.println("--------------------------");
        reversePrint(list1.head);

    }

    static void reversePrint(Node head) {
        Node current = head;

        if(current ==  null)
            return;

        reversePrint(head.next);

        System.out.println(head.data);
    }


}
