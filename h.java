	import java.lang.System;
	import java.util.Scanner;
	class hello{
	    public static void main(String[] args) {
	    Scanner num=new Scanner(System.in);
	    int a1=num.nextInt();
	    int a2=num.nextInt();
	    int a3=num.nextInt();
	    int a4=num.nextInt();
	    int a5=num.nextInt();
	    int avg=(a1+a2+a3+a4+a5)/5;
	    if(avg<=35){
	        System.out.println("Additional cls is required");
	    }
	    else{
	        System.out.println("Excellent go ");
	    }
	    }
        
	}
