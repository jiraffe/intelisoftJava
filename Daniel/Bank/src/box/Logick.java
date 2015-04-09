package box;

import java.util.Scanner;

public class Logick {
	int r = 0;
	Scanner scan = new Scanner(System.in);
	private boolean isFlag = true;	
	private Client Usern;
	private Bank bank;

	public Logick() {
		Usern = new Client();
		bank = new Bank();
	}

	public void start() {
		isFlag = true;
		System.out.println("1.Клиент");
		System.out.println("2.Инкассатор");
		int r = scan.nextInt();
		if (r == 1) {			
			RunClient();
		} else if (r == 2) {
			
			Incas();
		}
	}

	public void RunClient() {
		if (bank.isOnline()) {
			while (isFlag) {

				// Клиент
				
					Usern.Cli();
					System.out.println("Клиент");
					System.out.println("Выбор операции");
					System.out.println("1.Снятие денег");
					System.out.println("2.Просмотр баланса");
					System.out.println("3.zalit vedro");
					System.out.println("4. Exit");
					int t = scan.nextInt();
					switch (t) {
					case 1:

						System.out.println("Введите сумму");
						int snmoney = scan.nextInt();
						if (bank.getMoney() < snmoney) {
							System.out.println("Банк нищеброд");
						} else if (Usern.getMoney() < snmoney) {
							System.out.println("you nis4ebrod");
						} else {
							Usern.setMoney(Usern.getMoney() - snmoney);
							bank.setMoney(bank.getMoney() - snmoney);
							System.out.println("Finishen");
						}

						break;
					case 2:
						System.out.println("Имя = " + Usern.getUser());
						System.out.println("Наличка = " + Usern.getMoney());
						break;
					case 3:
						System.out.println("Введите сумму");
						int snsmoney = scan.nextInt();
						Usern.setMoney(Usern.getMoney() + snsmoney);
						bank.setMoney(bank.getMoney() + snsmoney);
						break;
					case 4:
						isFlag = false;
						break;

					default:
						break;
					}
				}
			

		} else {
			System.out.println("off");

		}
		start();
	}

	public void Incas() {
		while (isFlag) {
			System.out.println("1.пополнение банка");
			System.out.println("2. ОтколючениеВключение");
			System.out.println("3. Exit");
			int i = scan.nextInt();
			switch (i) {
			case 1:
				System.out.println("Введите сумму пополнения");
				int snmoney = scan.nextInt();
				bank.setMoney(bank.getMoney() + snmoney);
				break;
			case 2:
				System.out.println("Выбор режима");
				System.out.println("1. offline");
				System.out.println("2 online");
				int j = scan.nextInt();
				switch (j) {
				case 1:
					bank.setOnline(false);
					break;
				case 2:
					bank.setOnline(true);
					break;

				}
				break;
			case 3:
				isFlag = false;
				break;
			}
		}
		start();
	}

}
