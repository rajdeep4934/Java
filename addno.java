class ADDNumber{
public static void main(String[]args)
{
	int c=0;
	for(int i=0;i<args.length;i++)
	{
		c+=Integer.parseInt(args[i]);
	}
	System.out.println("addition is"+c);
}
}

