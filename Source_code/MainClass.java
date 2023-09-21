package ATM_machine;

import java.util.*;

public class MainClass {

	private static int status;

	public static void main(String[] args) {
		
		AtmOpeartion op= new AtmOperationimp ();
		int atmNum = 12345;
		int  atmPin=1234;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr The ATM Number :");
		int atmnum=sc.nextInt();
		System.out.println("Enter PIN :");
		int atmpin= sc.nextInt();
		if((atmNum == atmnum) && (atmPin == atmpin))
		{
			while(true) {
				System.out.println(" 1.View Available Balance\n 2.Withdraw Amount\n 3.Deposit Amount\n 4.View Ministatement\n 5.Exit");
				System.out.println("Enter Choice :");
				int ch=sc.nextInt();
				if(ch==1)
				{
					op.viewBalance();
				}
				else if(ch==2)
				{
					System.out.print("Enter the Withdrwal Amount: ");
					double withamu=sc.nextDouble();
					op.withdrawAmt(withamu);
					
				}
				else if(ch==3)
				{
					System.out.print("Enter Amount to Deposit: ");
					double damu=sc.nextDouble();
					op.depositAmt(damu);
				}
				else if(ch==4)
				{
					op.viewMiniStatement();
				}
				else if(ch==5)
				{
					System.out.println("Collect Your Atm Card\n Thank you for using our ATM Machine");
					System.exit(status);
				}
				else
					System.out.println("Please Enter The Correct Choice:");
				
			
			}
			
		}
		else
			System.out.println("Invalid Pin Or ATM Number ");
			System.exit(status); 

	}

}
