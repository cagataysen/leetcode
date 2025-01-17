package solutions.convert_binary_number_in_a_linked_list;

//  Definition for singly-linked list.
class ListNode {
    public int val;
    public ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}



class Solution {
    public int getDecimalValue(ListNode head) {

        if (head == null){
            return 0;
        }

        int sum = 0;

        ListNode currentNode = head;

        while (currentNode != null){
            sum = sum * 2 + currentNode.val;
            currentNode = currentNode.next;
        }
        return sum;

    }
}

