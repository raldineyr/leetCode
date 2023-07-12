class Solution {
    public ListNode middleNode(ListNode head) {
        if(head == null){
            return null;
        }
        int counter = 1;
        int nodeNumber = 0;
        ListNode toCounter = head;
        while(toCounter.next != null){
            counter++;
            toCounter = toCounter.next;
        }
        if(counter % 2 != 0){
            counter += 1;
            nodeNumber +=1;
        }
        ListNode current = head;
        ListNode response = null;
            while(nodeNumber <= counter/2){
                response = current; 
                current = current.next;
                nodeNumber++;
            }
            return response;
    }
}
