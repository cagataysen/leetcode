package solutions.convert_binary_number_in_a_linked_list;





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

