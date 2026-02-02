import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        s = s.toLowerCase();

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                count[ch - 'a']++;
            }
        }

        int oddCount = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] % 2 != 0) {
                oddCount++;
            }
        }

        if (oddCount <= 1) {
            System.out.println("Yes, it can be a palindrome permutation.");
        } else {
            System.out.println("No, it cannot be a palindrome permutation.");
        }

        sc.close();
    }
}
