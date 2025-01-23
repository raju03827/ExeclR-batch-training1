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

 public class ltcode004 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); // Dummy head for the result list
        ListNode current = dummyHead; // Pointer to build the new list
        int carry = 0; // Variable to store carry

        // Loop until both lists are exhausted and no carry remains
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry; // Start with the carry

            // Add the value from l1 if it's not null
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next; // Move to the next node in l1
            }

            // Add the value from l2 if it's not null
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next; // Move to the next node in l2
            }

            // Update carry for the next iteration
            carry = sum / 10;
            // Create a new node with the digit value (sum % 10)
            current.next = new ListNode(sum % 10);
            current = current.next; // Move to the next node in the result list
        }

        return dummyHead.next; // Return the next node of dummy head, which is the actual result
    }

    // Utility method to create a linked list from an array
    public static ListNode createList(int[] nums) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        for (int num : nums) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummyHead.next;
    }

    // Utility method to print a linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ltcode004 solution = new ltcode004();

        // Example input: l1 = [2, 4, 3], l2 = [5, 6, 4]
        ListNode l1 = createList(new int[]{2, 4, 3});
        ListNode l2 = createList(new int[]{5, 6, 4});

        // Add the two numbers
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print the result
        printList(result); // Expected output: 7 -> 0 -> 8
    }
}

// ListNode definition
class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}