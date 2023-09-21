package ATM_machine;
import java.util.HashMap;
import java.util.Map;

public class AtmOperationimp implements AtmOpeartion {

	atm a=new atm();
	Map <Double,String> ministat= new HashMap();
	public void viewBalance() {
		System.out.println("Avaliable Balance is: "+a.getBalance());
		System.out.println();
	}


	public void withdrawAmt(double withdrawAmt) {
		if(a.getBalance()>= withdrawAmt){
			ministat.put(withdrawAmt," Amount Withdrawn");
		System.out.println("Please Collect the Cash: "+withdrawAmt);
		a.setBalance(a.getBalance()-withdrawAmt);
		viewBalance();
		}
		else
		{
			System.out.println("Insufficent Balance!!!\n");
		}
		
	}

	
	public void depositAmt(double depositAmt) {
		
		if(depositAmt>0) {
		ministat.put(depositAmt," Amount Deposited");
		System.out.println("Rupess "+depositAmt+" Deposited Successfully! ");
		a.setBalance(depositAmt+a.getBalance());/*setBalance will add deposit amount with
		                         available balance */
		viewBalance();
		}
		else {
			System.out.println("Please Enter a Valid Amount!!\n");
		}
		
	}

	
	public void viewMiniStatement() {
		System.out.println("Minstatemnt Of Your Transactions:");
		System.out.println("-------------------------------------------------------------------------------------------");
		for(Map.Entry<Double,String> m:ministat.entrySet())
		{
			
			System.out.println(m.getKey()+""+ m.getValue());
		}
		System.out.println("");
	}

}
