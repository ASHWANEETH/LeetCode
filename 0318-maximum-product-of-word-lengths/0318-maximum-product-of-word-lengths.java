class Solution {
    public int maxProduct(String[] words) {

        int n = words.length;
        int[] masks = new int[n];

        // Create bitmask for every word
        for (int i = 0; i < n; i++) {

            for (char c : words[i].toCharArray()) {
                int bit = c - 'a';
                masks[i] |= (1 << bit);
            }
        }

        int max = 0;

        // Compare every pair
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if ((masks[i] & masks[j]) == 0) {
                    max = Math.max(max,
                            words[i].length() * words[j].length());
                }
            }
        }

        return max;
    }
}