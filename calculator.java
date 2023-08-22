import java.util.*;
class Calculator 
{
	static Scanner sc=new Scanner(System.in);
	static boolean a=true,b=true;
	public static void main(String[] args) 
	{
		System.out.println("\t\t"+""+(char)2+""+(char)3+"Welcome to VIJAY's Calculator"+""+(char)2+""+(char)3);
		do
		{
			System.out.println("please select opertion you want to perform\n1.Addidion\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
			int input_1=sc.nextInt();
			switch (input_1)
			{
			case 1:{//select how many operants for Addition
				    System.out.println("Select how Many Operants to perform Addition..\n1.2-operands\n2.3-operands");
					int input_2=sc.nextInt();
					switch (input_2)
					{
					case 1:{//you are Choosing 2-operands
						    System.out.println("Enter two values to perform... ");
							int n1=sc.nextInt();
							int n2=sc.nextInt();
							System.out.println(n1+"+"+n2+"="+add(n1,n2));
						break;}
					case 2:{//you are Choosing 3-operator
						    System.out.println("Enter three values to perform... ");
							int n1=sc.nextInt();
							int n2=sc.nextInt();
							int n3=sc.nextInt();
							System.out.println(n1+"+"+n2+"+"+n3+"="+add(n1,n2,n3));
						break;}
					
					}
				break;}
			case 2:{//Subtraction
				      System.out.println("Select how Many Operants to perform Subtraction..\n1.2-operands\n2.3-operands");
					int input_2=sc.nextInt();
					switch (input_2)
					{
					case 1:{//you are Choosing 2-operands
						    System.out.println("Enter two values to perform... ");
							int n1=sc.nextInt();
							int n2=sc.nextInt();
							System.out.println(n1+"-"+n2+"="+sub(n1,n2));
						break;}
					case 2:{//you are Choosing 3-operator
						    System.out.println("Enter three values to perform... ");
							int n1=sc.nextInt();
							int n2=sc.nextInt();
							int n3=sc.nextInt();
							System.out.println(n1+"-"+n2+"-"+n3+"="+sub(n1,n2,n3));
						break;}
					}
				break;}
			case 3:{//Multiplication
				     System.out.println("Select how Many Operants to perform Multiplication..\n1.2-operands\n2.3-operands");
					int input_2=sc.nextInt();
					switch (input_2)
					{
					case 1:{//you are Choosing 2-operands
						    System.out.println("Enter two values to perform... ");
							int n1=sc.nextInt();
							int n2=sc.nextInt();
							System.out.println(n1+"*"+n2+"="+multiply(n1,n2));
						break;}
					case 2:{//you are Choosing 3-operator
						    System.out.println("Enter three values to perform... ");
							int n1=sc.nextInt();
							int n2=sc.nextInt();
							int n3=sc.nextInt();
							System.out.println(n1+"*"+n2+"*"+n3+"="+multiply(n1,n2,n3));
						break;}
					}
				break;}
			 case 4:{//Division
				      System.out.println("Select how Many Operants to perform Division..\n1.2-operands\n2.3-operands");
					int input_2=sc.nextInt();
					switch (input_2)
					{
					case 1:{//you are Choosing 2-operands
						    System.out.println("Enter two values to perform... ");
							int n1=sc.nextInt();
							int n2=sc.nextInt();
							System.out.println(n1+"/"+n2+"="+divide(n1,n2));
						break;}
					case 2:{//you are Choosing 3-operator
						    System.out.println("Enter three values to perform... ");
							int n1=sc.nextInt();
							int n2=sc.nextInt();
							int n3=sc.nextInt();
							System.out.println(n1+"/"+n2+"/"+n3+"="+divide(n1,n2,n3));
						break;}
					}
				 break;}
			case 5:{//Exit
                      a=false;
					  System.out.println("Thank you For Using Me"+""+(char)2);
				break;}
			
			}
		}
		while (a);
		
	}
	  //methods are Starting
	public static int add(int n1,int n2)
	{
	  return n1+n2;	
	}
	public static int add (int n1,int n2,int n3)
	{
		return n1+n2+n3;
	}
	public static int sub(int n1,int n2)
	{
		return n1-n2;
	}
	public static int sub (int n1,int n2,int n3)
	{
			return n1-n2-n3;
	}
	public static int multiply(int n1,int n2)
	{
		return n1*n2;
	}
	public static int multiply(int n1,int n2,int n3)
	{
		return n1*n2*n3;
	}
	public static int divide(int n1,int n2)
	{
		return n1/n2;
	}
	public static int divide(int n1,int n2,int n3)
	{
		return n1/n2/n3;
	}
}
