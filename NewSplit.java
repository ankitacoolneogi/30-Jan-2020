import java.util.Scanner;

class NewSplit {


	int count=0;
	public static void main(String[] args) {
		System.out.print("Enter a string: ::  ");
		Scanner sc = new Scanner(System.in);

		String build = new String(sc.nextLine());
		System.out.print("Enter a string for splitting: ");

		String delimeter = new String(sc.nextLine());
		NewSplit obj=new NewSplit();
		String []tokens = obj.mysplit(build, delimeter);
		int m=0;
		for (String s : tokens ) {
			
			System.out.println(s);
			m++;
			if(m==obj.count+1)
				break;
			
			
		}

	}

	String [] mysplit(String build, String str){

		int i, size=0,  j=0,p=0;


		String []strtokens = new String[100];
		int del_len=str.length();
		
		for(i=0;i<=build.length()-del_len;i++){
			String s=build.substring(i,i+del_len);

			if(str.matches(s)){
				strtokens[j]=build.substring(p,i);
				p=i+del_len;
				i=i+del_len-1;
				j++;
				this.count++;
			}
		}
		if(j==0)
		{
			strtokens[j]=build;
			return strtokens;
		}
		strtokens[j]=build.substring(p,build.length());
		return strtokens;

	}
}