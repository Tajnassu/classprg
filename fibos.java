class fibos
{
  public static void main(String[] arg)
  {
 	
     int n=8,firstTerm = 0,secondTerm =1;

     System.out.println("fibonacci are" + n +"terms:"); 
     

       for(int i=1; i<=n;++i)

       {
            System.out.println(firstTerm +",");
         
 
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
          	     

	
       }  

  }
}