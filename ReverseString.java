import java.util.Scanner;


class ReverseString{
	public static void main(String[] args) {
		//StringBuilder build = new StringBuilder();
		System.out.print("Enter a string: ::  ");

		Scanner sc = new Scanner(System.in);

		StringBuilder build = new StringBuilder(sc.nextLine());
		System.out.println("Initial String is::  ");
		System.out.println("\t\t" + build);
		StringBuilder rev = new StringBuilder();

		for (int i = build.length()-1 ; i >= 0 ; i-- ) {
			rev.append(build.charAt(i)); 
			
		}
		System.out.println("After Reverse... String looks Like:  ");
		System.out.println("\t\t" + rev);
	}
}