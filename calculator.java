class Calculator{
public static void main(String[]args){
	class Operator=args[0];
	
	int num1=Integer.parseInt(args[1]);
	int num2=Integer.parseInt(args[2]);
	
	int calculation;
	switch(Operator){
		case"+";
		num3=num1+num2;
		break;
		
		case"-";
		num3=num1-num2;
		break;
		
		case"/";
		num3=num1/num2;
		break;
		
		case"x";
		num3=num1*num2;
		break;
		
	}
	System.out.println("calculation is "+num3);
}
}
}
		