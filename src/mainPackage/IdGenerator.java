package mainPackage;

import java.util.UUID;

public class IdGenerator {
   public static String generateUniqueId() 
   {   
	   //return UUID.randomUUID().toString();
	   return (String) (UUID.randomUUID().toString().hashCode()+"").replaceAll("-","");
       /*
	   UUID idOne = UUID.randomUUID();
       String str=""+idOne;  
       System.out.println(str);
       int uid=str.hashCode();
       String filterStr=""+uid;
       str=filterStr.replaceAll("-", "");
       //return Integer.parseInt(str);
       return str;
       */
   }
   
   // XXX: replace with java.util.UUID

   public static void main(String[] args) 
   {
	   System.out.println("Time: "+System.currentTimeMillis());
       for (int i = 0; i < 5; i++) 
       {
           System.out.println(generateUniqueId());
           //generateUniqueId();
       }
       System.out.println("Time: "+System.currentTimeMillis());
   }

}
