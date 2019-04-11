/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int mul = 1, num1 = 0, num2 = 0;
        while (l1 != null) {


            num1 = num1 + l1.val * mul;
            mul = mul * 10;
            l1 = l1.next;
        }
        mul = 1;

        while (l2 != null) {
            num2 = num2 + l2.val * mul;
            mul = mul * 10;
            l2 = l2.next;
        }


        int res = (num1 + num2);
        ListNode fin = null;

        if (res == 0) {
            ListNode a = new ListNode(0);
            return a;
        }

        while (res > 0) {
            if (fin == null) {
                fin = new ListNode(res % 10);
            } else {
                ListNode pwd = new ListNode(res % 10);
                pwd.next = fin;
                fin = pwd;
            }
            res = res / 10;
        }
        ListNode fin2 = null;

        while (fin != null) {

            if (fin2 == null) {
                fin2 = new ListNode(fin.val);
            } else {

                ListNode pwd = new ListNode(fin.val);
                pwd.next = fin2;
                fin2 = pwd;

            }
            fin = fin.next;

        }


        return fin2;
    }

}