class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> processed = new ArrayList<>();
        for (int num : nums) {
            List<Integer> temporary = new ArrayList<>();
            while (num > 0) {
                temporary.add(num % 10);
                num /= 10;
            }
            Collections.reverse(temporary);
            processed.addAll(temporary);
        }
        int[] ans = new int[processed.size()];
        for (int i = 0; i < ans.length; ++i) {
            ans[i] = processed.get(i);
        }
        return ans;
    }
}
