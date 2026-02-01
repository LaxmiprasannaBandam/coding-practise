//optimal
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		for(int i = 0; i<n;i++){
		    A[i] = sc.nextInt();
		}
		ArrayList<Integer> ans = new ArrayList<>();
		int max = A[n-1];
		ans.add(max);
		for(int i=n-2;i>=0;i--){
		    if(A[i] > max){
		        max = A[i];
		        ans.add(A[i]);
		    }
		}
		Collections.reverse(ans);
		System.out.println(ans);
    sc.close();
		
	}
}
// Bruteforce
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            boolean isLeader = true;

            for (int j = i + 1; j < n; j++) {
                if (A[j] > A[i]) {
                    isLeader = false;
                    break;
                }
            }

            if (isLeader) {
                ans.add(A[i]);
            }
        }

        System.out.println(ans);
        sc.close();
    }
}

