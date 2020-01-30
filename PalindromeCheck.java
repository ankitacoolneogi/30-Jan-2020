import java.util.Scanner;

class PalindromeCheck{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string:  ");
		
		StringBuilder build = new StringBuilder(sc.nextLine());
		StringBuilder rev =new StringBuilder(build);
		
		rev.reverse();
		System.out.println(rev + "   " + build);
		int count = build.length();
		for (int i =0 ; i<build.length() ; i++ ) {
			if (build.charAt(i) == rev.charAt(i)) {
				count--;
			}
		}
		if(count==0)
			System.out.println("String is Palindrome..");
		
		else 
			System.out.println("Not a Palindrome string..");
	}
}