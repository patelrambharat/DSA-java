import java.util.*;
	public class Main{
	static boolean isPalindrome (String str) {
	int si = 0;
	int ei = str.length() - 1;
	while (si <= ei) {
	if (str.charAt(si) != str.charAt(ei)) {
	return false;
	} else {
	si++;
	ei--;
	}
	}
	return true;
	}
	// TC: O(N^3)
	static void palindromeSubStrs(String s) {
	//Write your code here
	int n = s.length();
	ArrayList<String> list = new ArrayList();
	// TC: O(N^3)
	for (int i = 0; i < n; i++) {
	for (int j = i; j < n; j++) {
	String str = s.substring(i, j + 1);
	if (isPalindrome(str) == true) {
	list.add(str);
	}
	}
	}
	// TC: O(N*logN)
	// lexo order
	Collections.sort(list);
	// TC: O(N)
	for (int i = 0; i < list.size() - 1; i++) {
	String currString = list.get(i);
	String nextString = list.get(i + 1);
	if (currString.equals(nextString) == false) {
	System.out.println(currString);
	} else {
	continue;
	}
	}
	System.out.println(list.get(list.size() - 1));
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        palindromeSubStrs(s);
    }
}