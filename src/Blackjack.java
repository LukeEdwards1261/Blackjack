
public class Blackjack {

	public static void main(String[] args) {
		int dealer = 22;
		int player =0;
		
		if (dealer <=0) {
			System.out.println("Dealer's hand must be greater than zero");
		}
		if (player <=0) {
			System.out.println("Player's hand must be greater than zero");
		}
		if (dealer >21 && player >0 && player <=21) {
			System.out.println("dealer has gone bust, player wins");
		} else if (player > 0 && dealer > 0) {System.out.println("Dealers hand is: "+dealer);
		}
		
		if (player >21 && dealer > 0 && dealer <=21) {
			System.out.println("Player has gone bust, dealer wins");
		} else if (player > 0 && dealer > 0) {System.out.println("Players hand is: "+player);
		}
		
		if (player > dealer && player <=21 && player > 0 && dealer <21 && dealer > 0) {
			System.out.println("Player has won!");
		} 
		else if (player <= dealer && player <=21 && player > 0 && dealer <=21 && dealer > 0) {
			System.out.println("Dealer has won!");
		}
		
	}

}
