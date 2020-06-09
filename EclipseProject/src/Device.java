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
		}
		String brand = sc.nextLine();
		String os = sc.nextLine();
		sc.close();
		
		int res = findPriceForGivenBrand(phone,brand);
		
		if(res>0)
			System.out.println("The given Brand is not available");
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
	
