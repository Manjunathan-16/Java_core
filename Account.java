
public class Account {
	private String number;
	private double balance;
	private String name;
	private String email;
	private String phoneNo;

	public Account(String number, double balance, String name, String email, String phoneNo) {
		this.number = number;
		this.balance = balance;
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
	}

	public void depositMoney(double depositedMoney) {
		this.balance += depositedMoney;
		System.out.println("Deposit is succesful new balance is" + this.balance);
	}

	public void withdrawMoney(double withdrawMoney) {
		if (this.balance - withdrawMoney < 0) {
			System.out.println("you don't have sufficient balance" + this.balance);
		} else
			this.balance -= withdrawMoney;
		System.out.println("Withdrawal is successful remaining balance is" + this.balance);
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

}
