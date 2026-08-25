class Solution {
    public int kSimilarity(String s1, String s2) {

        if (s1.equals(s2)) {
            return 0;
        }

        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.offer(s1);
        visited.add(s1);

        int swaps = 0;

        while (!queue.isEmpty()) {

            int size = queue.size();

            while (size-- > 0) {

                String current = queue.poll();

                // Find first position that is different
                int i = 0;

                while (current.charAt(i) == s2.charAt(i)) {
                    i++;
                }

                // Try swapping i with every possible j
                for (int j = i + 1; j < s2.length(); j++) {

                    // Character needed at i
                    if (current.charAt(j) == s2.charAt(i)
                            && current.charAt(j) != s2.charAt(j)) {

                        char[] arr = current.toCharArray();

                        // Swap i and j
                        char temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;

                        String next = new String(arr);

                        if (next.equals(s2)) {
                            return swaps + 1;
                        }

                        if (!visited.contains(next)) {
                            visited.add(next);
                            queue.offer(next);
                        }
                    }
                }
            }

            swaps++;
        }

        return -1;
    }
}