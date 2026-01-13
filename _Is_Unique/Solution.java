public class IsUnique {

    // Brute Force Approach
    // Time: O(n^2), Space: O(1)
    static boolean isUniqueBrute(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    // Better Approach using extra space
    // Time: O(n), Space: O(1)
    static boolean isUniqueBetter(String s) {
        if (s.length() > 128) return false;
        boolean[] seen = new boolean[128];

        for (char c : s.toCharArray()) {
            if (seen[c]) return false;
            seen[c] = true;
        }
        return true;
    }

    // Optimal (Sorting)
    // Time: O(n log n), Space: O(1)
    static boolean isUniqueOptimal(String s) {
        char[] arr = s.toCharArray();
        java.util.Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) return false;
        }
        return true;
    }
}
