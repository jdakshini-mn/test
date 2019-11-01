
public class TwoDimensionalArrays {

	public static void main(String[] args) {
		// TwoDimensionalArrays
		
		int rows = 3;
		int cols = 3;
		
		int table[][] = new int [rows][cols];
		
		//assign values
		
		table[0][0] = 00;
		table[0][1] = 01;
		table[0][2] = 02;
		
		table[1][0] = 10;
		table[1][1] = 11;
		table[1][2] = 12;
		
		table[2][0] = 20;
		table[2][1] = 21;
		table[2][2] = 22;
		
		//Row Lenth
		System.out.println(table.length);
		
		//Cols lenth
		System.out.println(table[0].length);
		
		//print value from 1st Dimensional
		System.out.println(table[0][1]);
		
		//print two Dimensional array.
		
		for (int i=0; i<rows; i++){
			for (int j=0; j<cols; j++){
				
				System.out.print("  "+table[i][j]);
				
			}System.out.print("  ");
			
			
		}
			
		
			

	}

}
