class lab99
{

static boolean equalIgnoreCase(String str1, String str2) 
{ 
    int i = 0; 
 
    int len1 = str1.length(); 
  
    int len2 = str2.length(); 
  
    if (len1 != len2) 
        return false; 

    while (i < len1) 
    { 

        if (str1.charAt(i) == str2.charAt(i)) 
        { 
            i++; 
        } 
  
        else if (!((str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z') 
                || (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z'))) 
        { 
            return false; 
        } 
  
        else if (!((str2.charAt(i) >= 'a' && str2.charAt(i) <= 'z') 
                || (str2.charAt(i) >= 'A' && str2.charAt(i) <= 'Z'))) 
        { 
            return false; 
        } 
  
       
        else 
        { 
            if (str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z') 
            { 
                if (str1.charAt(i) - 32 != str2.charAt(i)) 
                    return false; 
            } 
  
            else if (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z') 
            { 
                if (str1.charAt(i) + 32 != str2.charAt(i)) 
                    return false; 
            } 
   
            i++; 
  
        }
  
    }

    return true; 
  
} 
  
static void equalIgnoreCaseUtil(String str1, String str2) 
{ 
    boolean res = equalIgnoreCase(str1, str2); 
  
    if (res == true) 
        System.out.println( "Same" ); 
  
    else
        System.out.println( "Not Same" ); 
} 

public static void main(String args[])
{ 
    String str1, str2; 
  
    str1 = "Geeks"; 
    str2 = "geeks"; 
    equalIgnoreCaseUtil(str1, str2); 
  
    str1 = "Geek"; 
    str2 = "geeksforgeeks"; 
    equalIgnoreCaseUtil(str1, str2); 
} 
}
  