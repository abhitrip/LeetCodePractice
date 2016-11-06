/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {

    public ListNode merge(ListNode l1,ListNode l2)
    {
        ListNode head = new ListNode(0);
        ListNode ref = head;
        while (l1!=null || l2!=null)
        {
            if(l1==null)
            {
                head.next = l2;
                return ref.next;
            }

            else if(l2==null)
            {
                head.next = l1;
                return ref.next;
            }

            else
            {
                if(l1.val<l2.val)
                {
                    head.next =l1;
                    l1 = l1.next;
                }
                else
                {
                    head.next = l2;
                    l2 = l2.next;
                }

                head = head.next;


            }


        }
        return ref.next;

    }



    public ListNode mergeSort(ListNode head)
    {
        if(head==null||head.next==null)
            return head;

        ListNode front= null;
        ListNode back = null;
        ListNode slow = head;

        ListNode fast = head.next;
        // Front Back Split
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }

        front = head;
        back = slow.next;
        slow.next = null;
        ListNode sortedfront = mergeSort(front);
        ListNode sortedback = mergeSort(back);

        ListNode sortedList = merge(sortedfront,sortedback);

        return sortedList;




    }
    public ListNode sortList(ListNode head) {
        return mergeSort(head);

    }
}
