import java.util.Scanner;

public class Calculator implements Calc{



String stack[]=new String[50]; 
int top=-1;


public void expStack(String exp){
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
		stack[++top]=""+calculate(s1);
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


public double calculate(String exp){
    
    int a;
    expStack(exp);
    String temp[]=new String[50];
    int t=-1;
    for(int i=0;i<top+1;i++)
    {
   
        if(stack[i].equals("*"))
        {
            a=Integer.parseInt(temp[t--])*Integer.parseInt(stack[i+1]);
            
            temp[++t]=""+a;
            i++;

        }
        else
        if(stack[i].equals("/"))
        {
            a=Integer.parseInt(temp[t--])/Integer.parseInt(stack[i+1]);
            
            temp[++t]=""+a;
            i++;
            
        }
        else
            temp[++t]=stack[i];
        
    }
    stack=temp;
    
    int result=Integer.parseInt(stack[0]);
    for(int i=1;i<t;i++)
    {
        
        if(stack[i].equals("+"))
        {
           
            result+=Integer.parseInt(stack[i+1]);
            
                
        }
        else
        if(stack[i].equals("-"))
        {
            result-=Integer.parseInt(stack[i+1]);
            }
    }
    
    return (double)result;


}

public static void main(String args[]){

Scanner sc=new Scanner(System.in);
Calculator calc=new Calculator();
System.out.println("Enter an expression:");
String e=sc.nextLine();
System.out.println(calc.calculate(e));

}

}
