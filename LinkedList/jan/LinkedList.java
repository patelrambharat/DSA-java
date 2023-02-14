package LinkedList.jan;

public class LinkedList {
    Node head;
    //add an element 
    public void add(int value){
       Node newNode = new Node(value);
       if(head == null){
            head = newNode;
            return;
       }

       Node temp = head;       //add to tail 
       while(temp .next != null){
        temp = temp.next;
       }
       temp. next = newNode;

    }

    // add element at front
    public void addfront(int value){
        Node newNode = new Node(value);
        newNode .next = head;
        head = newNode;
    }
    //delete by value
    public void delete(int value){
        if(head ==null){       //list is impty
            return;
        }
        Node temp = head;
       if(temp.next ==null){
        if(temp.value == value){     //only one element in the list
            head = head.next;
        }
        return;
       }
        while(temp.next != null && temp.next.value != value){    
            temp = temp.next;
        }
        temp.next = temp.next.next;

    }

    public void deleteByposition(int pos){
        if(head == null){
            return;
        }
        if(pos == 0){  //means I want to delete the head
            head = head.next;
            return;
        }
        Node temp = head;
        for(int i=0;i<pos-1;i++){
            temp = temp.next;  //traversing till position -1 node
             
        }
        temp.next = temp.next.next;
    }

    public Node middle(){
        int cnt =0;  //count the node
        Node temp = head;
        while(temp != null){
            cnt++;
            temp = temp.next;
        }
        temp = head;    //resetting temp to head
        cnt = cnt /2;      //want to go to middle element 
        for(int i=0;i<cnt;i++){
            temp = temp.next;
        }
        return temp;
    }

    public Node middleopti(){
            Node slow = head;
            Node fast = head;
            while(fast != null && fast .next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
    }
    //traverse the entire list and print the list
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.addfront(3);
        ll.print();
        // ll.deleteByposition(2);
        System.out.println("middlen is" + ll.middleopti().value);
        // ll.print();

    }
}
