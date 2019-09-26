package booking;

import customer.Customer;

public class Booking {
	
	Customer customer=new Customer();
	int amount=0;
	 boolean a1,a2,a3,a4,a5,a6,a7,a8,a9,a10;
	public int room;


	public void Book(String type, String cot, String cable, String wifi, String laundry) {
		// TODO Auto-generated method stub
		customer.setType(type);
		customer.setCot(cot);
		customer.setCable(cable);
		customer.setWifi(wifi);
		customer.setLaundry(laundry);
		
		
		if(customer.getType().equalsIgnoreCase("AC"))
		{
			amount=amount+1000;
			a1=true;

		}
		if(customer.getType().equalsIgnoreCase("NAC"))
		{
			amount=amount+750;
			a2=true;
		}
		if(customer.getCot().equalsIgnoreCase("Single cot"))
		{
			amount= amount+0;
			a3=true;
		}
		if(customer.getCot().equalsIgnoreCase("Double cot"))
		{
			 amount=amount+350;
			 a4=true;
		}
		if(customer.getCable().equalsIgnoreCase("C"))
		{
			 amount=amount+50;
			 a5=true;
		}
		if(customer.getCable().equalsIgnoreCase("NC"))
		{
			 amount=amount+0;
			 a6=true;
		}
		if(customer.getWifi().equalsIgnoreCase("w"))
		{
			 amount=amount+200;
			 a7=true;
	    }
		if(customer.getWifi().equalsIgnoreCase("nw"))
		{
			 amount=amount+0;
			 a8=true;
		}
		if(customer.getLaundry().equalsIgnoreCase("L"))
		{
			 amount=amount+100;
			 a9=true;
		}
		if(customer.getLaundry().equalsIgnoreCase("NL"))
		{
			amount=amount+0;
			 a10=true;
		 }
		
				System.out.println("The total charge is Rs."+amount);
				System.out.println("\n\nThe services chosen are");
				this.details();
	}
	private void details()
	{
				if(a3)
					{
					 System.out.print("Single cot ");
					}
				if(a4)
				{
					 System.out.print("Double cot ");

				}
				if(a1)
				{
					 System.out.println("AC room");
		
				}
				if(a2)
				{
					System.out.println("Non-AC room");
				}
				if(a5)
				{
					System.out.println("Cable connection enabled");
				}
				if(a6)
				{
					System.out.println("No Cable connection enabled");
				}
				if(a7)
				{
					System.out.println("Wi-Fi enabled");
				}
				if(a8)
				{
					System.out.println("No Wi-Fi is enabled");
				}
				if(a9)
				{
					System.out.println("with laundry service");
				}
				if(a10)
				{
					System.out.println("with  no laundry service");
				}
				}
	 static int booked[]=new int[25];
		static int roomnum=0;

	public int roomnum()
	{
		++roomnum;
		booked[roomnum]=1;
		return roomnum;
	}

	public boolean CheckStatus(int room) {
		// TODO Auto-generated method stub
		if(booked[room]==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	
	}
}

		
