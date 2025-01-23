package solutions.middle_of_the_linked_list;

import solutions.convert_binary_number_in_a_linked_list.ListNode;

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
