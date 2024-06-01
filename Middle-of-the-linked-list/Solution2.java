/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution2 {
    public ListNode middleNode(ListNode head) {
        ListNode currentNode = head;

        int count = 0;

        while(currentNode != null){
            count++;
            currentNode = currentNode.next;
        }

        int middleIndex = count / 2;

        currentNode = head;
        for(int i = 0; i < middleIndex; i++){
            currentNode = currentNode.next;
        }
        return currentNode;

    }
}