class HelloWorld
{
	public static void main(String[] arg)
	{
	for(int i=1;i<=30;i++)
		{
			if(i%7==0 && i%4==0)
			{
				System.out.println("Fun Face");
			}
			else if(i%4==0)
			{
				System.out.println("Fun");
			}
			else if(i%7==0)
			{
				System.out.println("Face");
			}
			else
			{
				System.out.println(i);
			}
		}
	}
}