class Solution {
    public int getDecimalValue(ListNode head) {
        int ans = 0; 
        for (; head != null; head = head.next) {
            ans = ans << 1 | head.val;
        }
        return ans;
    }
}
