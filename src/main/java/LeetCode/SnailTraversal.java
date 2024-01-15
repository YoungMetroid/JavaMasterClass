package LeetCode;

import java.util.Arrays;

public class SnailTraversal {


    public static void main(String [] args){

        SnailTraversal st = new SnailTraversal();
        int array [][] = new int[][]{{1,1,1,1,1,1,1,1,1},
                {2,2,2,2,2,2,2,2,2},
                {3,3,3,3,3,3,3,3,3},
                {4,4,4,4,4,4,4,4,4},
                {5,5,5,5,5,5,5,5,5},
                {6,6,6,6,6,6,6,6,6},
                {7,7,7,7,7,7,7,7,7},
                {8,8,8,8,8,8,8,8,8},
                {9,9,9,9,9,9,9,9,9},
        };


        Arrays.stream(array).forEach(
                row-> {
                    Arrays.stream(row).forEach(
                            element -> System.out.print(element));
                    System.out.println();
                });

       int maxValue =  Arrays.stream(array)
                .mapToInt(row -> Arrays.stream(row).max().orElse(0))
                .max()
                .orElse(0);

        int result [] = st.SnailTraversal(array);





    }
    public int [] SnailTraversal(int [][] array){

        int [] traversal = new int[array[0].length * array.length];
        int currentIndex= 0;
        //Column Position
        int leftRightP = 0;
        int rightLimit = array[0].length;
        //Row Position
        int upDownP = 0;
        int downLimit = array.length;
        //Column Position
        int rightLeftP = array[0].length-1;
        int leftLimit = 0;
        //Row Position
        int downUpP = array.length-1;
        int upLimit = 0;

        boolean fullTraveral = true;

        while(fullTraveral){

            fullTraveral = false;
            if(leftRightP >= rightLimit) break;
            for(int i = leftRightP; i < rightLimit; i ++){
                System.out.print(array[upDownP][i] + " ");
                traversal[currentIndex] = array[upDownP][i];
                currentIndex++;
                fullTraveral = true;
            }
            rightLimit--;
            upDownP++;
            System.out.println();
            if(upDownP >= downLimit) break;

            for(int i = upDownP; i < downLimit; i++){
                System.out.print(array[i][rightLeftP] + " ");
                traversal[currentIndex] = array[i][rightLeftP];
                currentIndex++;
                fullTraveral = true;
            }
            downLimit--;
            rightLeftP--;
            System.out.println();

            if(rightLeftP < leftLimit) break;

            for(int i = rightLeftP; i >= leftLimit; i--){
                System.out.print(array[downUpP][i] + " ");
                traversal[currentIndex] = array[downUpP][i];
                currentIndex++;
                fullTraveral = true;
            }
            leftLimit++;
            downUpP--;
            System.out.println();

            if(downUpP <= upLimit) break;
            for(int i = downUpP; i > upLimit; i--){
                System.out.print(array[i][leftRightP] + " ");
                traversal[currentIndex] = array[i][leftRightP];
                currentIndex++;
                fullTraveral = true;
            }
            System.out.println();
            leftRightP++;
            upLimit++;
        }



        return traversal;

    }
}
