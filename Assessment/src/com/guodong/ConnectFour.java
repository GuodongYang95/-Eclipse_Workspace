package com.guodong;

import java.util.Random;

// GuodongYang	2431298
public class ConnectFour {
	public static void main(String[] args) {
//		Player p1 = new Player("Clive", 'x');
//		Counter c = new Counter(p1);
//		System.out.println(c.getPlayer().toString()+ ", " + c.toString());
//		
//		Column co1 = new Column(4);
//		for (int i = 0; i < 5; i++) {
//			Boolean result = co1.add(new Counter(p1));
//			System.out.println(result);
//		}
		
//		co1.numRows = 6;
//		p1.setCounterSymbol('o');
		
//		Column co1 = new Column(6);
//		Player p1 = new Player("Clive", 'o');
//		Player p2 = new Player("Sharon", 'x');
//		for (int i = 0; i < 3; i++) {
//				co1.add(new Counter(p1));
//				co1.add(new Counter(p2));
//		}
//		co1.dispaly();
		Board board = new Board(6, 7);
		Player p1 = new Player("Clive", 'o');
		Player p2 = new Player("Sharon", 'x');
//		board.add(new Counter(p2),6);
//		board.add(new Counter(p1),3);
//		board.add(new Counter(p2),4);
//		board.add(new Counter(p1),4);
//		board.add(new Counter(p2),5);
//		board.add(new Counter(p1),5);
//		board.add(new Counter(p2),6);
//		board.add(new Counter(p1),5);
//		board.add(new Counter(p2),6);
//		board.add(new Counter(p1),6);
		randomColumn(p1, p2, board);
		System.out.println(board);
	}
	
	//Add columns randomly into the board, and print out the winner.
	public static void randomColumn(Player p1, Player p2, Board board) {
		Random r = new Random();
		while(board.isFull() == false) {
			int columnP1 = r.nextInt(board.column);
			int columnP2 = r.nextInt(board.column);
			while(board.add(new Counter(p1), columnP1) == false) {
				columnP1 = r.nextInt(board.column);
				}
			while(board.add(new Counter(p2), columnP2) == false) {
				columnP2 = r.nextInt(board.column);
			}
			if (Board.win(board)) {
				break;
				}
			}
	}
	
	
	
	
}
