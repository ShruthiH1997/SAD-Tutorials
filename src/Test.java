import java.util.Scanner;

public class Test {
	static String stack[]=new String[50]; 
	static int top=-1;


	public static void expStack(String exp){
	    String s1="";
	  top=-1; 
	  int flag=1;
	for(int i=0;i<exp.length();i++){
		if(exp.charAt(i)=='(')
		{
			if(s1!="")
				{stack[++top]=s1;}
			s1="";
			flag=0;
			continue;
		}
		if(exp.charAt(i)==')'){
			flag=1;
			stack[++top]=""+s1;
			s1="";
			continue;
		}
		if(flag==0)
		{
			s1+=exp.charAt(i);
			continue;
		}
		if(exp.charAt(i)==','||exp.charAt(i)=='}'||exp.charAt(i)=='{'||exp.charAt(i)=='+'||exp.charAt(i)=='-'||exp.charAt(i)=='*'||exp.charAt(i)=='/')
	  {
		 if(s1!="")
		 {
		 stack[++top]=s1;}
		 if(exp.charAt(i)!=',')
		  stack[++top]=""+exp.charAt(i);
		  s1="";
	 continue;
	  }
	  s1+=exp.charAt(i);
	}
	stack[++top]=s1;
	
	}
	
	
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter:");
		expStack(sc.nextLine());
		for(int i=0;i<top;i++){
			System.out.println(stack[i]);
		}
		
		
		
		
		
		
		
	}
}
