import java.io.IOException;

class Banking{
	int balance=10000;
	void withdraw(int amt) throws IOException{
		int dif= balance-amt;
		if(dif<5000){
			IOException io=new IOException("Low Balance");
			throw io;
			
//			NullPointerException ne=new NullPointerException(); //unchecked
//			throw ne;
			//System.out.println(ne);
			//System.out.println("Balance is low");
		}else{
			balance=balance-amt;
			System.out.println("Amount left: "+balance);
		}
	}
}
public class BankException {
	public static void main(String[] args) {
		System.out.println("Banking has started");
		Banking b=new Banking();
		try{
		     b.withdraw(2000);
		     b.withdraw(2000);
		     b.withdraw(3000);
		}catch(Exception e){
		   System.out.println("Exception for Banking :"+e);  
		}
		System.out.println("Banking has ended ");

	}

}
