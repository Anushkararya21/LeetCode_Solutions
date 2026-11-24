class Solution {
    public int[] finalPrices(int[] prices) {
        int[] r = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int i = 1; i < prices.length; i++) {
            while(!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                int index = stack.pop();
                r[index] = prices[index] - prices[i];
            }
            stack.push(i);
        }
        while(!stack.isEmpty()) {
            int c = stack.pop();
            r[c] = prices[c];
        }
        return r;
    }
}