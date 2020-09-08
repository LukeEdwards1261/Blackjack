
public class Coins {

	public static void main(String[] args) {
		int balance;
		int paid = 50;
		int bill = 2;
		balance = (paid-bill);
		System.out.println("Balance = £"+balance);
		int P50 = 0;
		int P20 = 0;
		int P10 = 0;
		int P5 = 0;
		int P2 = 0;
		int P1 = 0;
		
		if (balance >=50) {P50 = balance/50;
		balance = balance-(P50*50);
			}
		if (balance >=20) {P20 = balance/20;
		balance = balance-(P20*20);
		}
		if (balance >=10) {P10 = balance/10;
		balance = balance-(P10*10);
		}
		if (balance >=5) {P5 = balance/5;
		balance = balance-(P5*5);
		}
		if (balance >=2) {P2 = balance/2;
		balance = balance-(P2*2);
		}
		if (balance >=1) {P1 = balance/1;
		balance = balance-(P1*1);
		}
		
		
		if (P50 !=0) System.out.println("£50 = "+P50);
		if (P20 !=0) System.out.println("£20 = "+P20);
		if (P10 !=0) System.out.println("£10 = "+P10);
		if (P5 !=0) System.out.println("£5 = "+P5);
		if (P2 !=0) System.out.println("£2 = "+P2);
		if (P1 !=0) System.out.println("£1 = "+P1);
		
		
	}

	

}
