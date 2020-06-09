import java.util.Scanner;
import java.io.*;

public class Device {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone[] phone = new Phone[4];
		Scanner sc = new Scanner(System.in);
		int i,j=0;
		for(i=0;i<phone.length;i++)
		{
			int phoneId = Integer.parseInt(sc.nextLine());
			String os = sc.nextLine();
			String brand = sc.nextLine();
			int price = Integer.parseInt(sc.nextLine());
		}
		String brand = sc.nextLine();
		String os = sc.nextLine();
		
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
			int i,j=0,sum=0;
			for(i=0;i<phone.length;i++)
			{
				if(phone[i].getBrand().equalsIgnoreCase(brand))
				{
					sum=sum+phone[i].getPrice();
					j++;
				}
				else
					return 0;
			}
			return sum;
		}

		public static Phone getPhoneIdBasedOnOs(Phone[] phone, String os)
		{
		    //method logic
			int i,j=0;
			Phone temp = null;
			for(Phone ob:phone)
			{
				if(ob.getOs().equalsIgnoreCase(os) && ob.getPrice()>=50000)
				{
					return ob;
				}
				
			}
			return null;
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
	
