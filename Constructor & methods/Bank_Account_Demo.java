//Simple Calculator
import java.util.*;

class Bank_Account{
	public String depo;
	public String accNum;
	public String typeOfAcc;
	public double balanceAcc;
	public double actualAmt=0.0;

	//Default constructor
	public Bank_Account(){
		depo="Unknown";
		accNum = "- - - - - - - - - -";
		typeOfAcc = "Unknown";
		balanceAcc = 0.0;
	}
	
	//Parameterized Constructor
	public Bank_Account(String depositor, String enteredAccNum, String accType, double accBal){
		depo=depositor;
		accNum=enteredAccNum;
		typeOfAcc = accType;
		balanceAcc = accBal;
	}

	//taking input like: Depositor's Name , Account Number, & Type of the Account.
	private void getData(){
		Scanner conin = new Scanner(System.in);
		//Depositor's Name
		System.out.print("Name of the Depositor: ");
		depo = conin.nextLine();
		//Account Number of depositor's name
		while(true){
			System.out.print("Account Number: ");
			accNum = conin.nextLine();
			if(accNum.length() == 10)	break;
			if(accNum.length() != 10){
				System.out.println("Incorrect Account Number.\n");
			}
		}
		//type of account
		System.out.print("Type of Account: ");
		typeOfAcc = conin.nextLine();
	}
	private void aDeposited(double depo_amt){
		actualAmt+=depo_amt;
		System.out.println(depo_amt + " has been added to the accountholder's account.");
		System.out.println("Amount in " + depo + "'s account: " + actualAmt + ".");
	}
	private void aWithdrawal(double wd_amt){
		if(actualAmt < wd_amt){
			System.out.println("Insufficient balance in User's account.");
			return;
		}
		actualAmt-=wd_amt;
		System.out.println(wd_amt + " has been withdrawn from the accountholder's account.");
		System.out.println("Amount in " + depo + "'s account: " + actualAmt + ".");
	}
	public void display(){
		Scanner conin = new Scanner(System.in);

		getData();
		
		System.out.println(depo + "'s account details:\n_________________");
		System.out.println("Press 1...To deposit an ammount.");
		System.out.println("Press 2...To withdraw an ammount.");
		System.out.println("Press 3...To see holder's profile.");
		
		System.out.println("Press 4...for exit.");
		while(true){
			int choice;
			double depo_amount, withdr_amount;

			System.out.print("Enter Your choice: ");
			choice = conin.nextInt();
			switch(choice){
				case 1:
					System.out.print("Amount to be deposited: ");
					depo_amount = conin.nextDouble();
					aDeposited(depo_amount);
					break;
				case 2: 
					System.out.print("Amount to be withdrawn: ");
					withdr_amount = conin.nextDouble();
					aWithdrawal(withdr_amount);
					break;
				case 3: 
					System.out.println("Depositor's Name: " + depo);
					System.out.println("Account Number:   " + accNum);
					System.out.println("Type of Account:  " + typeOfAcc);
					System.out.println("Amount Present:   " + actualAmt);
				case 4:  
					System.out.println("We are the exiting from "+ depo + "'s account.");
					break;
				default: 
					System.out.println("Invalid choice.");
			}
			if(choice == 4)
				break;
		}
	}
	
		
}
class Bank_Account_Demo{
	public static void main(String args[]){
		Bank_Account ob = new Bank_Account();
		ob.display();
	}
}		







