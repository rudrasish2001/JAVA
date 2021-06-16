class CheckArgument extends Exception{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
}

class command
{
     public static void main(String ag[]){
         int i;
         int ans=0;
         int s[]=new int[5];
         try
        {
              for(i=0;i<s.length;i++)
             {
                    s[i]=Integer.parseInt(ag[i]);
                    if(ag.length<5)
                    {
                          throw new CheckArgument();
                    }
                    else if(ag.length>5)
                    {
                           throw new CheckArgument();
                    }
             }
 
             for(i=0;i<s.length;i++)
            {
                   ans=ans+s[i];
            }
   }
   catch(CheckArgument m)
  {
         System.out.println("Passed 5 Integer");
   }    
   System.out.println("The sum is"+ans);
  }
}