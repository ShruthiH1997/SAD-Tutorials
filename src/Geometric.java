import java.util.Scanner;
import java.io.*;
public class Geometric implements GeomCalc{
String stack[]=new String[50]; 
int top=-1;

/*public double calculate(String[] exp){
	
if(exp[0].equals("1")){
Calculator c=new Calculator();
return c.calculate(exp);}
		
	if(exp[0].equals("2"))
		return retSin(Double.parseDouble(exp[1]));

	if(exp[0].equals("3"))
		return retCos(Double.parseDouble(exp[1]));

	if(exp[0].equals("4"))
		return retTan(Double.parseDouble(exp[1]));

		return 0.00;
}
	
public String[] getInput(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter option: 1.Basic Operation 2.Sin 3.Cos 4.Tan");
	int opt=sc.nextInt();
	System.out.println(opt);
	String exp[]=new String[2];
	if(opt==1)
	{
		exp[0]="1";
		System.out.println("Enter expression:");
		String s=sc.nextLine();
		s=sc.nextLine();
		exp[1]=s;
		System.out.println(exp[1]+"abcd");
		

	}
	else{
	System.out.println("Enter value:");
	double n=sc.nextDouble();
	exp[1]=""+n;
	exp[0]=""+opt;
	}
	return exp;

}*/

public double retSin(double no)
{
	return Math.sin(no);
}

public double retCos(double no)
{
	return Math.cos(no);
}

public double retTan(double no)
{
	return Math.tan(no);
}

}