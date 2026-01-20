import java.util.Scanner;

public class URLify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int trueLength = sc.nextInt();

        char[] a = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            a[i] = s.charAt(i);
        }

        int spaceCount = 0;
        for (int i = 0; i < trueLength; i++) {
            if (a[i] == ' ') spaceCount++;
        }
      int index = trueLength + spaceCount * 2 - 1;
      for (int i = trueLength - 1; i >= 0; i--) {
            if (a[i] == ' ') {
                a[index] = '0';
                a[index - 1] = '2';
                a[index - 2] = '%';
                index -= 3;
            } else {
                a[index] = a[i];
                index--;
            }
        }

        System.out.println(new String(a, 0, trueLength + spaceCount * 2));
    }
}
