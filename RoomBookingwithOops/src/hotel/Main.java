package hotel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import booking.Booking;
import customer.Customer;
//import facefolks.Roombooking;
import register.Registration;
public class Main {
	
	  static int register=0;
		static int numroom=0;



	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String firstName;
		String middleName;
		String lastName;
		String email;
		String contact;
		int fordate[]=new int[30];
		int register1[]=new int[30];
		int roomnum1[]=new int[30];
		String view[]=new String [25];
		String Email[]=new String[25];
		int register2[] = new int[25];

		
		String type;
		String laundry;
		String wifi;
		String cot;
		String cable;
		
		int r=0;
		int b=0;
	    int e=0;
	    int z=0;
	    int u=0;
	    
		int date=0;
		int choice=0;
		
		Customer cus=new Customer();

	    Registration reg=new Registration();
		boolean j=true;

		boolean i=true;
		boolean registering=false;
		System.out.println("\n********************************************************Menu*******************************************************");
		while(j)
		{
		System.out.println("\nEnter your choice");
		System.out.println("\n\n  1.Registration\n  2.Booking\n  3.Update Details\n  4.Email Update\n  5.All Bookings\n  6.All Customers\n  7.Exit");

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    choice=Integer.parseInt(br.readLine());

	    switch(choice)
		{
		case 1:
			System.out.println("\n******************************Welcome to Registration Portal****************************\n\nPlease Enter your details");
			do
			{
			System.out.print("Firstname  : ");
			firstName=br.readLine();
			view[b]=firstName;
			b++;
			System.out.print("\nMiddlename : ");
			middleName=br.readLine();
			System.out.print("\nLastname   : ");
			lastName=br.readLine();
			System.out.print("\nEmail      : ");
			email=br.readLine();
			Email[z]=email;
			z++;
			System.out.print("\nContact    : ");
		    contact=br.readLine();
		   
		    
		    reg.Registration(firstName,middleName,lastName,email,contact);
			System.out.println("\nThanks for registration and your Registration ID is "+ ++register+".");
			registering=true;
			register1[r]=register;
			register2[u]=register;
			u++;
			System.out.println(register);
	
			System.out.println("\n\nDo you want another registration?"+"\n"+"y/n");
			char y=br.readLine().charAt(0);
			
			if(y=='y')
			{
				i=true;
			}
			else
			{
				//i=false;
				break;
			}
		   
			}while(i);
			break;
		case 2:
			if(registering==false)
			{
			    System.out.println("-----------------------------Oouch!!!!!!!!!!!!!!!!!!Had you did not register------Hurry up!!!!!!!----------------------------------");
			    break;
			}
			if(registering==true)
		{
			System.out.println("\n\n*******************************Booking**********************************");
			System.out.println("--------------------------------");
			do
			{
			System.out.println("\n\nPlease choose the services required.");
			System.out.print("\nAC/non-AC(AC/nAC) : ");
			type=br.readLine();
			System.out.print("\nCot(Single/Double) : ");
			cot=br.readLine();
			System.out.print("\nWith cable connection/without cable connection(C/nC) : ");
			cable=br.readLine();
			System.out.print("\nWi-Fi needed or not(W/nW) : ");
			wifi=br.readLine();
			System.out.print("\nLaundry service needed or not(L/nL) : ");
			laundry=br.readLine();
			System.out.print("\nEnter the Date : ");
			date=Integer.parseInt(br.readLine());
			fordate[r]=date;
			Booking b1=new Booking();
			b1.Book(type,cot,cable,wifi,laundry);
			System.out.println("\n\nThank you for booking. Your room number is "+b1.roomnum()+".");
			roomnum1[r]= ++numroom;
			r++;
			System.out.println("\n\nDo you want to proceed?(yes/no)");
			char y2=br.readLine().charAt(0);
			if(y2=='y')
			{
			i=true;
			}
			else
			{
				//i=true;
				break;
			}		
			}while(i);
			break;
		}
			
			
			
		case 3:
			if(registering==true)
		{
			System.out.println("\n\n****************************************Update Room Details*****************************************");
			System.out.println("--------------------------------------------------------------------------------------------------------");
			do
			{
			System.out.print("\nEnter the Room number : ");
			int a=Integer.parseInt(br.readLine());
			Booking b1=new Booking();
			boolean check=b1.CheckStatus(a);
			if(check)
			{
			System.out.println("Room number "+a+" is booked.");
		
			}
			else
			{
				System.out.println("Room number "+a+" is free.");
			
			}
			
			System.out.print("\n\nDo you want to book another room?(yes/no) : ");
			String y2=br.readLine();
			if(y2.equalsIgnoreCase("Yes"))
			{
				i=true;
				
			}
			else if(y2.equalsIgnoreCase("No"))
			{
				//i=false;
			break;
			}
		
		}while(i);
			break;
		}	
		case 4:
			if(registering==true)
		{
		
			System.out.println("\n\n****************************************Email Updated**********************************************");
			System.out.println("-------------------------------------------------------------------------------------------------------------");
			System.out.println("\nDo you want to update the email id?(y/n)");
			char y1=br.readLine().charAt(0);

			if(y1=='y')
			{
				i=true;
				System.out.print("Enter the Customer ID : ");
				e=Integer.parseInt(br.readLine());
				for(int h=0;h<=25;h++)
				{
					if(register2[h]==e)
					{
						System.out.print("Enter new Email id : ");
						String email2=br.readLine();
						Email[h]=email2;
						System.out.println("The new email id for "+e+" is :");
						reg.emailupdate(email2, e);
						System.out.println("Email updated");
						break;
					}
				}
			}
			else
			{
				//System.out.println("Do you want to continue");
				i=false;
			
			}break;
		}
		case 5:
			if(registering==true)
		{
			System.out.println("\n\n**************************************************Date**********************************************************");
			System.out.print("\nEnter the start date : ");
			int startdate=Integer.parseInt(br.readLine());
			System.out.print("Enter the end date : ");
			int enddate=Integer.parseInt(br.readLine());
			System.out.print("The bookings made from "+startdate+" to "+enddate+" are");
			System.out.println("\nRoom number"+"		"+"Customer ID");
			for(int c=0;c<=register;c++)
			{
				if(fordate[c]>=startdate && fordate[c]<=enddate)
				{
				
					
					System.out.println(roomnum1[c]+"		            "+register1[c]);
					
				}
			}
			break;
		}
		case 6:
			if(registering==true)
		{
			System.out.println("********************************************************Customer list***********************************************************");
			System.out.println("\n");
			System.out.println("Customer ID"+"	  "+"Customer Name");
			int g=0;
			for(int k=1;k<=register;k++)
			{
				System.out.println(k+"                    "+view[g]);
				++g;
			}
			//System.out.println("Do you want to continue");
			i=false;
			break;
		}
		case 7:
			if(registering==true)

		{
			System.out.println("\n***************************************************Bye Bye and Thank for your service***************************************************");
			
		}
	   
	    j=false;
		}
}

}
}