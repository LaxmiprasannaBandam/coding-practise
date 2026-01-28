//Brute force
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String s1 = sc.next();
	    String s2 = sc.next();
	    if(s1.length() != s2.length()){
	        System.out.println("No");
	        return;
	    }
	    char[] b = s2.toCharArray();
	    boolean found;
	    for(int i = 0; i<s1.length();i++){
	        found = false;
	        for(int j = 0; j<b.length;j++){
	            if(s1.charAt(i) == b[j]){
	                b[j] = '#';
	                found = true;
	                break;
	            }
	        }
	        if(!found){
	            System.out.println("No");
	            return;
	        }
	    }
	    System.out.println("Yes");
	    
	    
	    
	}
	}


// Better
char[] a = s1.toCharArray();
char[] b = s2.toCharArray();
Arrays.sort(a);
Arrays.sort(b);
System.out.println(Arrays.equals(a, b) ? "Yes" : "No");
//Best
int[] freq = new int[256];

for(char c : s1.toCharArray()) freq[c]++;
for(char c : s2.toCharArray()) freq[c]--;

for(int x : freq){
    if(x != 0){
        System.out.println("No");
        return;
    }
}
System.out.println("Yes");
