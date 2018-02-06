import java.util.Scanner;
public class Statistic implements StatCalc{


/*    public double calculate(String[] exp){
    
        if(exp[0].equals("1"))
        {Calculator c=new Calculator();
            return c.calculate(exp);}
        

    if(exp[0].equals("2"))
        return mean(exp);

    if(exp[0].equals("3"))
        return median(exp);

    if(exp[0].equals("4"))
        return variance(exp);

    return 0.00;
}


    
public String[] getInput(){
    Scanner sc=new Scanner(System.in);
    String s;
    System.out.println("Enter option: 1.Basic Operation 2.Mean 3.Median 4.Variance");
    int opt=sc.nextInt();
    if(opt==1)
    {
        System.out.println("Enter expression:");
        s=sc.nextLine();
        String exp[]=new String[2];
        exp[0]="1";
        exp[1]=sc.nextLine();
        return exp;

    }
    System.out.println("Enter no. of values:");
    s=sc.nextLine();
    int n=sc.nextInt();
    String exp[]=new String[n+1];
    System.out.println("Enter values:");
    s=sc.nextLine();
    for(int i=1;i<=n;i++)
    {
            exp[i]=sc.nextLine();
    }
    exp[0]=""+opt;
    return exp;

}*/

public double mean(String[] values){
        int sum=0;
        for(int i=1;i<values.length;i++){
            sum+=Integer.parseInt(values[i]);
        }

        return(sum*1.0/(values.length-1));

}

public double median(String[] values){
        
        if((values.length-1)%2!=0)
            return Double.parseDouble(values[1+((values.length-1)/2)]);
        else
            return (Double.parseDouble(values[1+((values.length-1)/2)])+Double.parseDouble(values[(values.length-1)/2]))/2;

}

public double variance(String[] values){
    double m=mean(values);
    double var=0.0;
    for(int i=1;i<values.length;i++)
    {
            var+=Math.pow((Double.parseDouble(values[i])-m),2);
    }
    return var/(values.length-1);
}


}