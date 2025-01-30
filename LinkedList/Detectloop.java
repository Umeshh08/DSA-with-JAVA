
class Detectloop{

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addfirst(int data){
        Node Newnode = new Node(data);
        if(head==null){
            head = tail = Newnode;
        }else{
        Newnode.next = head;
        head = Newnode;
    }
}
    public void print(){
        if (head == null) {
            System.out.println("Linklist is empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;

        }
        System.out.println();
    }
    public boolean loopornot(){
        Node slow  = head;
        Node fast = head;

        while (fast!= null && fast.next!=null) {
             slow = slow.next;
            fast = fast.next.next;
            if(fast==slow){
                return true;
               
            }
        }
        return false;

    }
    public static void removecycle(){

        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast!=null && fast.next!=null) {
            slow =  slow.next;
            fast =  fast.next.next;
            if(slow==fast){
                cycle = true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        slow = head;
        Node prev = null;
        while(fast!=slow){
            prev = fast;
            fast = fast.next;
            slow = slow.next;
        }

        prev.next = null;

    }


    
public static void main(String[] args) {
    Detectloop li = new Detectloop();
    // li.addfirst(5);
    // li.addfirst(5);
    // li.addfirst(5);
    // li.print();
    head = new Node(2);
    Node temp  = new Node(3);
    head.next = temp;
    head.next.next = new Node(1);
    head.next.next.next =temp;
    System.out.println(li.loopornot());
    li.removecycle();
    System.out.println(li.loopornot());
}
}