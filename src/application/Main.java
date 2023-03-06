package application;

public class Main {
	static String[][] board1 = new String[5][5];
	static String[][] board2 = new String[5][5];
	static String[][] plShip = new String[4][1];
	static String[][] aiShip = new String[4][1];
	public static void main(String[] args) {
		board(board1);
		board(board2);
		
		
		
		 
	
	
	}
	//----------------------------------
	//      FOR THE BOARD
	//---------------------------------
	public static void board(String[][] board) {
		arraySetter(board, "A", 0);
		arraySetter(board, "B", 1);
		arraySetter(board, "C", 2);
		arraySetter(board, "D", 3);
		arraySetter(board, "E", 4);
		
		printBoard(board);
	}
	public static void arraySetter(String[][] arr, String str, int i) {
		for(int j = 0; j<arr.length; j++) {
		arr[i][j] = str + String.valueOf(j+1);
	}
	}
	public static void printBoard(String[][] board) {
		 System.out.println("|  1 |  2 |  3 |  4 |  5 |");
		 System.out.println("");
	    for (int i = 0; i < board.length; i++) {
	        // Print horizontal separator
	        System.out.println("-------------------------");
	        for (int j = 0; j < board[0].length; j++) {
	            // Print vertical separator
	            System.out.print("| ");
	            // Print the value of the current cell
	            System.out.print(board[i][j] + " ");
	        }
	        // Print closing vertical separator
	        System.out.print("|");
	        if(i == 0) {
	        	 System.out.println("  A");
	        }else if(i == 1) {
	        	System.out.println("  B");
	        }else if(i == 2) {
	        	System.out.println("  C");
	        }else if(i == 3) {
	        	System.out.println("  D");
	        }else if(i == 4) {
	        	System.out.println("  E");
	        }
	        
	    }
	    // Print closing horizontal separator
	    System.out.println("-------------------------");
	}
	//----------------------------------
	//      FOR THE GAME
	//---------------------------------
		
		
	}

