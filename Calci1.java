import java.util.*;
public class Calci1
{
	public static void main(String[] args) {
		AA:while("True"!=null) {
	    System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Divide");
       
	    System.out.println("Enter the operation of your choice:");
     
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    Add add=new Add();
	    Subtract sub=new Subtract();
	    Multiply mul=new Multiply();
	    Divide div=new Divide();
        if(n==1) {
        	add.Add();
        }
        else if(n==2) {
        	sub.Subtract();
        }
        else if(n==3) {
        	mul.Multiply();
        }
        else if(n==4) {
        	div.Divide();
        }
        else {
        	System.out.println("Invalid option!!!!");
        	continue AA;
        }
        
    AA1:while("True"!=null) {    
	System.out.println("Do you want to continue(Y/N):"); 
    Scanner ch=new Scanner(System.in);
    char c=ch.next().charAt(0);
    
        if(c=='Y'||c=='y') {
        	continue AA;
        }
        else if(c=='N'||c=='n'){
        	break AA;
        }
        else if(c!='Y'&&c!='N'&&c!='y'&&c!='n') {
        	System.out.println("Wrong choice");
        	continue AA1;
        }
	}
		}
	}
}
System.out.println("ADDITION");
class Add {
    void Add()
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("How many numbers do you want to add?:");

        int n=sc.nextInt();

        double num[]=new double[n];

        System.out.println("Enter numbers to add:");

        for(int i=0;i<n;i++){
            num[i]=s.nextDouble();

        }
        double sum=0;
        for(int i=0;i<num.length;i++)
        {
            sum+=num[i];
        }
        System.out.println("Addition of given numbers is:"+sum);
    }
}
System.out.println("MULTIPLICATION");
class Multiply{
    void Multiply(){
        
    System.out.println("Enter no.of operands:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    double a[]=new double[n];
    System.out.println("Enter the numbers:");
    for(int i=0;i<n;i++){
        a[i]=sc.nextDouble();
       
       
    }
    double mul=1;
    for(int j=0;j<n;j++){
        mul=mul*a[j];
    }
    System.out.println("multiplication of given numbers is:"+mul);
}}
System.out.println("DIVISION");
class Divide{
    void Divide()
    {
         Scanner sc=new Scanner(System.in);
        
          System.out.println("Enter number1:");
    double n1=sc.nextInt();
    System.out.println("enter number2:");
    double n2=sc.nextInt();
    double  d=n1/n2;
    System.out.println("Division of given numbers is:"+d);
    }
}
System.out.println("SUBTRACTION");
class Subtract{
    void Subtract()
    {
         Scanner sc=new Scanner(System.in);
        
          System.out.println("Enter first number:");
    double n1=sc.nextInt();
    System.out.println("Enter second number:");
    double n2=sc.nextInt();
    double  s=n1-n2;
    System.out.println("subtraction of given numbers is:"+s);
    }
}
