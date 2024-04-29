/**
 * 
 */
package pattern;

/**
 * 
 */
public class RightTrianglePattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i, j, row =15;
		
		//outer loop for rows
		for ( i = 1; i <=row; i++) {
			
			//inner loop for columns 
			for ( j = 0; j <i; j++) {
				System.out.print("*");
			}
			
			//throws the cursor in a new line after printing each line
			System.out.println();
		}

	}

}
