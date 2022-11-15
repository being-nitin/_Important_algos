public class FloydCycleAlgo {
    public static boolean detectLoop(Node head){
        // with the help of two pointers
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
