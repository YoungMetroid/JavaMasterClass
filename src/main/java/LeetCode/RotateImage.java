package LeetCode;

public class RotateImage {


    public static void main(String []args)
    {
        RotateImage rotateImage = new RotateImage();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix2 = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};

        rotateImage.rotate(matrix2);

    }
    public void rotate(int [][]matrix){
        int calculatedRotations = matrix.length;

        int x = 0;
        int y = 0;
        while(calculatedRotations >= 3){

            swapEndpoints(matrix,x,y);
            for(int i = x+1; i < matrix.length-1; i++){
                swap(matrix,i,y);
            }
            x++;
            y++;
            calculatedRotations =-2;

        }
    }
    public void swap(int[][] matrix, int x1, int y1)
    {
        int value1 = matrix[y1][x1];
        int value2 = matrix[y1+1][matrix.length-x1];
        int value3 = matrix[(matrix.length-1)-y1][(matrix.length-x1)-1];
        int value4 = matrix[(matrix.length-2)-y1][x1-1];

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);
        matrix[y1][x1] = value4;
        matrix[y1+1][matrix.length-x1] = value1;
        matrix[(matrix.length-1)-y1][(matrix.length-x1)-1] = value2;
        matrix[(matrix.length-2)-y1][x1-1] = value3;

    }
    public void swapEndpoints(int[][] matrix, int x1, int y1)
    {
        int value1 = matrix[y1][x1];
        int value2 = matrix[y1][(matrix.length-1)-x1];
        int value3 = matrix[(matrix.length-1)-y1][(matrix.length-1)-x1];
        int value4 = matrix[(matrix.length-1)-y1][x1];

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);
        matrix[y1][x1] = value4;
        matrix[y1][(matrix.length-1)-x1] = value1;
        matrix[(matrix.length-1)-y1][(matrix.length-1)-x1] = value2;
        matrix[(matrix.length-1)-y1][x1] = value3;

    }
}
