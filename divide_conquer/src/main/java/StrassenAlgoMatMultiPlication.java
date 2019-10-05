import java.util.Arrays;

public class StrassenAlgoMatMultiPlication {

	public static void main(String[] args) {

		int[][] mat1 = { { 1, 2 ,3,4}, { 1, 2 ,3,4}, { 1, 2 ,3,4}, { 1, 2 ,3,4}  };
		int[][] mat2 = { { 1, 2 ,3,4}, { 1, 2 ,3,4}, { 1, 2 ,3,4}, { 1, 2 ,3,4}  };

		int[][] c = squareMatMultiplication(mat1, mat2);
		for (int i = 0; i < c.length; i++)
			System.out.println(Arrays.toString(c[i]));
		System.out.println(Arrays.toString(Arrays.copyOfRange(mat1[0],2,4)));
	}
	
	private static int[][] strassenMultiplication(int[][] mat1, int[][] mat2) {
		int n=mat1.length;
		int[][] c=new int[n][n];
		
		if(n==1)
			c[0][0]=mat1[0][0]*mat2[0][0];
		
		else{
			 int [][] a11=new int[n/2][n/2];
			 
			 
			//c[0][0]=starssenMultiplication()
		}
		return c;
	}
	
	private static int[][] squareMatMultiplication(int[][] mat1, int[][] mat2) {

		int[][] c = new int[mat1.length][mat1.length];

		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1[i].length; j++) {
				for (int k = 0; k < mat1.length; k++) {
					c[i][j] = c[i][j] + mat1[i][k] * mat2[k][j];
				}
			}
		}
		return c;
	}

}
