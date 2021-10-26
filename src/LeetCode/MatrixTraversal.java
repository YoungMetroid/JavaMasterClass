package LeetCode;

public class MatrixTraversal {


    public void TraversalUpDown(int[][] matrix)
    {
        boolean updown = false;
        int rowLength = matrix.length;
        int columnLength = matrix[rowLength-1].length;

        int currentColumn = 0;
        int currentRow = 0;

        while(currentColumn != columnLength)
        {

            if(updown)
            {
                for(;currentRow >= 0; currentRow--)
                {
                    System.out.println(matrix[currentRow][currentColumn]);
                }
                updown = false;
                currentRow = 0;
            }
            else if(!updown)
            {
                for(;currentRow < rowLength; currentRow++)
                {
                    System.out.println(matrix[currentRow][currentColumn]);
                }
                updown = true;
                currentRow--;
            }
            currentColumn++;
        }


    }
}
