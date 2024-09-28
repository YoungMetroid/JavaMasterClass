package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TrappingRainWater {
    List<int[]> towers = new ArrayList<>();
    public static void main(String[] args){

        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};

        int maxHeight = 0;
        for(int i = 0; i < height.length;i++){
            maxHeight = Math.max(height[i], maxHeight);
        }

        boolean [][] matrix = new boolean[maxHeight][height.length];

        for(int i = 0; i< matrix.length;i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(i <= height[j]-1)
                    matrix[i][j] = height[j] > 0 ? true : false;
            }
        }


        Arrays.stream(matrix).forEach(xx -> {

                    for(int i =0; i < xx.length; i++){
                        System.out.print(xx[i] ? "1":"0");
                    }
                    System.out.println();
                }
        );

        int water = 0;
        for(int y = 0; y < matrix.length; y++){
            int left = 0;
            int right = matrix[y].length-1;
            boolean foundLeftEdge = false;
            boolean foundRightEdge = false;
            while(!foundLeftEdge || !foundRightEdge){

                if(matrix[y][left]){
                    foundLeftEdge = true;
                }
                else if(!foundLeftEdge)left++;
                if(matrix[y][right]){
                    foundRightEdge = true;
                }
                else if(!foundRightEdge)right--;

                if(left >= right) break;
            }
            //Calculate

            if(foundLeftEdge && foundRightEdge) {
                int ySum = 0;
                for (; left < right; left++) {
                    if (matrix[y][left] == false) {
                        ySum++;
                    }
                }
                water += ySum;
            }

        }


        System.out.println(water);
        //int[] height = {6,4,2,0,3,2,0,3,1,4,5,3,2,7,5,3,0,1,2,1,3,4,6,8,1,3};
        //int[] height = {4,2,0,3,2,5};
       // TrappingRainWater t = new TrappingRainWater();
        //t.trap(height);

        List<int[]> positions = new ArrayList<>();

        int previousP = 0;

        for(int i = 1; i < height.length; i++){

            if(height[previousP] > height[i]){
                positions.add(new int[] {previousP, height[previousP] - height[i]});
            }
            else if(height[previousP] < height[i] && !positions.isEmpty()){

                int []p = positions.get(positions.size() - 1);

               if(height[p[0]] <= height[i]){
                   positions.remove(positions.size()-1);
               }

                //Since I'm removing i have to update the depth of the previous
                if(!positions.isEmpty()){
                    int[] prevP = positions.remove(positions.size()-1);
                    prevP[1] = height[prevP[0]] - height[p[0]];
                    positions.add(prevP);
                }

                //Calculate water between previous highest block and the next
                //Calculate the depth
                int depth =
                        height[p[0]] < height[i] ?
                                height[p[0]] - height[previousP] : height[i] - height[previousP];
                System.out.println("New Water:" + ((i - (p[0] + 1)) * depth) );
                water += ((i - (p[0] + 1)) * depth);

                while(!positions.isEmpty()) {
                    p = positions.get(positions.size()-1);
                    if(height[p[0]] < height[i]){
                        positions.remove(positions.size() - 1);
                        depth = height[i] - height[p[0]];
                        System.out.println("New Water:" + ((i - (p[0] + 1)) * depth) );
                        water += ((i - (p[0] + 1)) * depth);

                        if(!positions.isEmpty()){
                            int[] prevP = positions.remove(positions.size()-1);
                            prevP[1] = height[prevP[0]] - height[p[0]];
                            positions.add(prevP);
                        }
                    }
                    else if (height[p[0]] > height[i] && height[p[0]] - p[1] < height[i]){
                          depth = (height[i] - p[1]);
                        System.out.println("New Water:" + ((i - (p[0] + 1)) * depth) );
                          water += ((i - (p[0] + 1)) * depth);
                        break;
                    }
                    else if (height[p[0]] == height[i] && height[p[0]] - p[1] < height[i]){
                        //update the depth
                        System.out.println("New Water:" + ((i - (p[0] + 1)) * p[1]));
                        water += ((i - (p[0] + 1)) * p[1]);
                        positions.remove(positions.size() - 1);

                        break;
                    }
                    else {
                        //System.out.println("New Water:" + ((i - (p[0] + 1)) * depth) );
                        //water += (i - (p[0] + 1));
                        break;
                    }
                    //Calculate water between previous highest block and the next
                    //Calculate the depth
                }
            }
            previousP = i;
        }
        System.out.println(water);
    }

    public int trap(int[] height){
        int i = 0;
        while(i < height.length){

            i = searchUp(i, height);

            i = searchDown(i,height);
        }

        return 0;
    }

    public int searchUp(int i, int[] height){
        int value = height[i];
        int position = i;
        i++;
        for(; i < height.length;i++ ){

            if(i == height.length -1 && value <= height[i]){
                towers.add(new int[]{height[i], i});
            }
            else if(value <= height[i]){
                value = height[i];
                position = i;
            }
            else if(!towers.isEmpty() &&
                    towers.get(towers.size()-1)[0] != value){
                    towers.add(new int[]{value,position});
                    break;
            }
            else if(towers.isEmpty()){
                towers.add(new int[]{value,position});
                break;
            }
            else{
                break;
            }
        }
        return i;
    }
    public int searchDown(int i, int[] height){
        if(i >= height.length) return i;

        int value = height[i];

        i++;
        for(; i < height.length;i++ ){

            if(value >= height[i]){
                value = height[i];
            }
            else break;
        }
        i--;
        return i;
    }
}
