public class Sum2DArray
{
  public static void main (String[]args)
  {
    int[][] twoDArray = { {1, 2}, {4, 5}, {7, 89} };
    int sum = 0;
    for (int i = 0; i < twoDArray.length; i++)
      {
	for (int j = 0; j < twoDArray[i].length; j++)
	  {
	    sum += twoDArray[i][j];
      }} System.out.println ("Sum of elements in the 2D array: " + sum);
}}
