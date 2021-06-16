import java.util.*;

public class matrix
{
	 double[][] mat;
	int row, column;
	int N;
    private int[][] mult;
	matrix()
	{
		row=0;
		column=0;
	}
	matrix(int r, int c)
	{
		row = r;
		column = c;
		mat = new double[row][column];
	}
public void readElementsToMatrix()
	{
		Scanner s = new Scanner(System.in);
		int i=0,j=0;
		
		System.out.println("Enter the matrix elements(row-wise)");
		for (i=0; i < row; i++)
		{
			for(j=0; j<column; j++)
	        {
				mat[i][j] = s.nextDouble();
			}

		}
	}
	public void transpose(int A[][], int B[][])
    {
        int i, j;
        for (i = 0; i < N; i++)
            for (j = 0; j < N; j++)
                B[i][j] = A[j][i];
    }
	public void displayMatrix()
	{
		int i = 0, j = 0;
		System.out.println("The matrix is:>>");
		for (i = 0; i < row; i++)
		{
			System.out.println("");
			for (j = 0; j < column; j++)
			{
				System.out.print("   "+mat[i][j]);
			}

		}
	int multMatrix(int trans[][])
    {
        for(i=0;i<row;i++)
        {
            for(j=0;j<column;j++)
            {
                mult[i][j]=0;
                for(int k=0;k<column;k++)
                {
                    mult[i][j]+=trans[i][k]*trans[k][j];
                }
            }
        }
        return;
    }
    
    
    
    
    
    
    }



}