package linkedlist.doubly;

public class DoublyLinkedList {

    DoublyNode head;

    public DoublyLinkedList() {
        // TODO Auto-generated constructor stub
        this.head = null;
    }

    public void insertAtBegining(int data){
        DoublyNode node = new DoublyNode(data);
        if(null == head){
            head=node;
        }else{
            node.next=head;
            head.prev=node;
            head= node;
        }
    }

    public void insertAtLast(int data){
        DoublyNode node = new DoublyNode(data);
        if(null == head){
            head=node;
        }else{
            DoublyNode current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next=node;
            node.prev=current;
        }
    }

    public void deleteFromStart(){
        if(null == head){
            System.out.println("List is Empty");
        }else{
            head=head.next;
        }
    }


    public void deleteFromLast(){
        if(null == head){
            System.out.println("List is Empty");
        }else{
            DoublyNode current =head;
            while(current.next.next!=null){
                current=current.next;
            }
            current.next=null;
        }
    }

    public void deleteAfter(int data){
        DoublyNode current  = head;
        while (current.data != data){
            current = current.next;
        }
        if(current.next != null && current.next.next != null){
            current.next = current.next.next;
        } else {
            current.next = null;
        }
    }


    public void printForward(){
        DoublyNode currentNode= head;
        while(null!=currentNode){
            System.out.println(currentNode.data);
            currentNode=currentNode.next;
        }
    }


    public void printBackword(){
        DoublyNode currentNode= head;
        while(null!=currentNode.next){
            currentNode=currentNode.next;
        }
        while(head !=currentNode){
            System.out.println(currentNode.data);
            currentNode=currentNode.prev;
        }
        System.out.println(currentNode.data);
    }

}
