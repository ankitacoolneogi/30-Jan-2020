class StringConvert{
	public static void main(String[] args) {
		

		//Converting String to StringBuilder		
		StringBuilder build = new StringBuilder("build is initialised by me..");
		System.out.println("Initial value of build is = " + build);
     	
     	//buf = "Assignment value of build..";		//NOT ALLOWED
     	
     	build = build.replace(0, build.length(),"New Assigned value of build..");
     	System.out.println("Now new value of build is = " + build);
 
     	//Converting String to StringBuffer

	 	StringBuffer buf = new StringBuffer("buf is initialised by me.. ");
     	System.out.println("Initial value of buf is = " + buf);
     	
     	//buf = "Assignment value of buf..";	//NOT ALLOWED
     	
     	buf = buf.replace(0, buf.length(),"New assigned value of buf..");
     	System.out.println("Now new value of buf is = " + buf);
 

	}
}