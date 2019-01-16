package mainPackage;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.StringTokenizer;

public class TestClass 
{
	public static boolean checkMsisdn(String msisdn)
	  {
	    return (msisdn == null) || (msisdn.trim().equals("")) || (!msisdn.startsWith("994")) || (msisdn.length() != 12);
	  }
	
	public static String[] getTokens(String str, String delim, boolean trim){ 
	      StringTokenizer stok = new StringTokenizer(str, delim); 
	      String tokens[] = new String[stok.countTokens()]; 
	      for(int i=0; i<tokens.length; i++){ 
	          tokens[i] = stok.nextToken(); 
	          if(trim) 
	              tokens[i] = tokens[i].trim(); 
	      } 
	      return tokens; 
	  } 
	
	public static void main(String[] args)
	{
		boolean a=true;
		//boolean b= a;
		System.out.println(a ^ true);
		
		System.out.print((!checkMsisdn("994555901259")));
		
		try 
		{
			System.out.println(URLDecoder.decode("%2B994555901259%2C%2B994555901259%2C%2B994555901259%2C%2B994555901259","UTF-8"));
			System.out.println(URLDecoder.decode("arifuli%40bakcell.com%2C%2B994555901234%2C8904%2C%2B9850%2Cmaib%40gmail.com","UTF-8"));
			String[] destinationList=getTokens(URLDecoder.decode("arifuli%40bakcell.com%2C%2B994555901234%2C8904%2C%2B9850%2Cmaib%40gmail.com","UTF-8"),",",true);
			for(int i=0;i<destinationList.length;i++)
			{
				System.out.println(destinationList[i]);
			}
		} 
		catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		int i =0;
		System.out.println((byte) (i+1));
	}
}
