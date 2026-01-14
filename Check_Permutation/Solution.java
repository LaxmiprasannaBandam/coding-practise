//Brute Force Approach
static boolean checkPermutationBrute(String s1, String s2) {
    if (s1.length() != s2.length()) return false;

    StringBuilder sb = new StringBuilder(s2);

    for (int i = 0; i < s1.length(); i++) {
        char c = s1.charAt(i);
        int index = sb.indexOf(String.valueOf(c));
        if (index == -1) return false;
        sb.deleteCharAt(index);
    }
    return true;
}
//Better Approach (Sorting)
static boolean checkPermutationSort(String s1, String s2) {
    if (s1.length() != s2.length()) return false;

    char[] a = s1.toCharArray();
    char[] b = s2.toCharArray();

    java.util.Arrays.sort(a);
    java.util.Arrays.sort(b);

    return java.util.Arrays.equals(a, b);
}
//Optimal Approach (Character Count)
static boolean checkPermutationOptimal(String s1, String s2) {
    if (s1.length() != s2.length()) return false;

    int[] count = new int[128];

    for (char c : s1.toCharArray()) {
        count[c]++;
    }

    for (char c : s2.toCharArray()) {
        count[c]--;
        if (count[c] < 0) return false;
    }

    return true;
}

  
