/*# Problem_Statement :
 
Create a class Phone with below attributes: phoneId - int os - String brand - String price - int .

 Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

 Create class Solution with main method.

Implement two static methods - findPriceForGivenBrand and getPhoneIdBasedOnOs in Solution class.

findPriceForGivenBrand method: This method will take two input parameters - array of Phone objects and string parameter brand. The method will return the sum of the price attribute from phone objects for the brand passed as parameter. If no phones with the given brand is present in the array of phone objects, then the method should return 0.

getPhoneIdBasedOnOs method: This method will take a String parameter os, along with the array of Phone objects. The method will return the phone object, if the input String parameter matches with the os attribute of the phone object and its price attribute is greater than or equal to 50000. If any of the conditions are not met, then the method should return null.

Note : No phone object would have the same value for os attribute. All phone object would have the price greater than 0. All the searches should be case insensitive.

These above mentioned static methods should be called from the main method.

For findPriceForGivenBrand method - The main method should print the price as it is if the returned price is greater than 0, or it should print "The given Brand is not available".

For getPhoneIdBasedOnOs method - The main method should print the phoneId of the returned phone object. If the returned value is null then it should print "No phones are available with specified os and price range".

Before calling these static methods in main, use Scanner object to read the values of four Phone objects referring attributes in the above mentioned attribute sequence. Next, read the value for brand and os.

Input :

111
iOS
Apple
30000
222
android
Samsung
50000
333
Symbian
HTC
12000
444
Paranoid
HTC
89000
Blackberry
aNdRoid

Output :

The given Brand is not available
222

*/

import java.util.Scanner;
import java.io.*;

public class Device {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone[] phone = new Phone[4];
		Scanner sc = new Scanner(System.in);
		int i,j=0;
		for(i=0;i<4;i++)
		{
			int phoneId = Integer.parseInt(sc.nextLine());
			String os = sc.nextLine();
			String brand = sc.nextLine();
			int price = Integer.parseInt(sc.nextLine());
			phone[i]=new Phone(phoneId,os,brand,price);
		}
		String brand = sc.nextLine();
		String os = sc.nextLine();
		sc.close();
		
		int res = findPriceForGivenBrand(phone,brand);
		
		if(res==0)
			System.out.println("The given Brand is not available");
		else
			System.out.println(res);
		
		Phone obj = getPhoneIdBasedOnOs(phone,os);
		
	    if(obj==null)
	    	System.out.println("No phones are available with specified os and price range");
	    else
	    	System.out.println(obj.getPhoneId());
	    }
	
		public static int findPriceForGivenBrand(Phone[] phone, String brand)
		{
		    //method logic
			int sum = 0;
			//enhanced for loop
			for(Phone ob:phone)
			{
				if(ob.getBrand().equalsIgnoreCase(brand))
				{
					sum += ob.getPrice();				}	
			}
			if(sum>0)
				return sum;
			else
				return 0;
		}

		public static Phone getPhoneIdBasedOnOs(Phone[] phone, String os)
		{
		    //method logic
			
			Phone temp = null;
			
			//enhanced for loop
			for(Phone ob:phone)
			{
				if(ob.getOs().equalsIgnoreCase(os) && ob.getPrice()>=50000)
				{
					temp=ob;
					return ob;
				}
				
			}
			return temp;
		}
	
   }
		class Phone
		{
		   
		int phoneId;
		   String os;
		   String brand;
		   int price;
		   
		   Phone( int phoneId, String os,String brand,int price)
		   {
			this.phoneId=phoneId;
			this.os = os;
			this.brand = brand;
			this.price = price;
		   }
		   public int getPhoneId()
		   {
			   return phoneId;
		   }
		   public String getOs()
		   {
			   return os;
		   }
		   public String getBrand()
		   {
			   return brand;
		   }
		   public int getPrice()
		   {
			   return price;
		   }
	   }
	
