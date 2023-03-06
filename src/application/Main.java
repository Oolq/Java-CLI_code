package application;

public class Main {

	public static void main(String[] args) {
		String[][] board = new String[5][5];
		arraySetter(board, "A", 0);
		arraySetter(board, "B", 1);
		arraySetter(board, "C", 2);
		arraySetter(board, "D", 3);
		arraySetter(board, "e", 4);
		
		printBoard(board);
		
		
		 
	
	
	}
	public static void arraySetter(String[][] arr, String str, int i) {
		for(int j = 0; j<arr.length; j++) {
		arr[i][j] = str + String.valueOf(j+1);
	}
	}
	public static void printBoard(String[][] board) {
	    for (int i = 0; i < board.length; i++) {
	        // Print horizontal separator
	        System.out.println("-------------");
	        for (int j = 0; j < board[0].length; j++) {
	            // Print vertical separator
	            System.out.print("| ");
	            // Print the value of the current cell
	            System.out.print(board[i][j] + " ");
	        }
	        // Print closing vertical separator
	        System.out.println("|");
	    }
	    // Print closing horizontal separator
	    System.out.println("-------------");
	}
	
		
		
	}

