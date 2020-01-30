import java.util.Scanner;

class FindCharacter{
	public static void main(String[] args) {
		System.out.print("Enter a string: ::  ");
		char ch;
		Scanner sc = new Scanner(System.in);

		StringBuilder build = new StringBuilder(sc.nextLine());

		System.out.print("Enter a character to search:  ");
		ch = sc.next().charAt(0);
		for(int i=0 ; i<build.length() ; i++){
			if(build.charAt(i) == ch){
				System.out.println("FOUND CHARACTER AT POSITION: " + i );
				return;
			}
		}
		System.out.println("CHARACTER NOT FOUND...");
	}
}