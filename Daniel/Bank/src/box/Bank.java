package box;

public class Bank {
	boolean online=true;
	private int money;
	public Bank() {
	money = 666;
	}
	public int getMoney() {
		return money;
	}

	public boolean isOnline() {
		return online;
	}
	public void setOnline(boolean online) {
		this.online = online;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
}
