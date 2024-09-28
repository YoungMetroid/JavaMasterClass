package LeetCode.PopularCodeQuestions;

import java.util.ArrayList;
import java.util.List;

public class MatrixTraversalClockwise {

    public static void main (String[] args) {
        // keep this function call here
        System.out.print("Test 1 passing: " + (MatrixSpiral(new String[] {"[1, 2]", "[10, 14]"}).equals("1,2,14,10")) + "\r\n");
        System.out.print("Test 2 passing: " + (MatrixSpiral(new String[]
                {"4, 5, 6, 5,7",
                "[1, 1, 2, 2,3]",
                "[5, 4, 2, 9,100]"}).equals("4,5,6,5,7,3,100,9,2,4,5,1,1,2,2")) + "\r\n");
        System.out.print("Test 2 passing: " + (MatrixSpiral(new String[]
            {   "[4, 5, 6, 5,7]",
                "[1, 1, 2, 2,3]",
                "[5, 4, 2, 9,10]",
                "[50, 4, 2, 9,100]"
            }).equals("4,5,6,5,7,3,10,100,9,2,4,5,5,1,1,2,2,9,2,4")) + "\r\n");
    }


    public static String MatrixSpiral(String[] strArr) {
        // code goes here

        List<String[]> list = new ArrayList<>();
        for(String str:strArr){
            String[]strArray = str.replaceAll("[\\[\\]]","").split(",\\s*");
            list.add(strArray);
            /*
            StringBuilder s = new StringBuilder();
            List<String> l = new ArrayList<>();
            for(int i = 1; i < str.length(); i++){
                if(str.charAt(i) == ']' ) {
                    //add
                    l.add(s.toString());
                    s = new StringBuilder();
                    continue;
                }

                if(str.charAt(i) == ','){
                    //add
                    l.add(s.toString());
                    s = new StringBuilder();
                    continue;
                }
                if(str.charAt(i) == ' ') continue;

                s.append(str.charAt(i));
            }
            list.add(l);
            */
        }

        for(String[] strArray : list){
            for(String str: strArray){
                System.out.println(str);
            }
        }


        int leftLimit = 0;
        int rightLimit = list.get(0).length;
        int topLimit = 0;
        int bottomLimit = list.size();

        int x = 0;
        int y = 0;
        StringBuilder sb = new StringBuilder();

        while(true){

            if(x < rightLimit){
                for(;x < rightLimit; x++){
                    sb.append(list.get(y)[x]).append(",");
                }
                y++;
                topLimit++;
                x--;
            }
            else break;

            if(y < bottomLimit){
                for(;y < bottomLimit; y++ ){
                    sb.append(list.get(y)[x]).append(",");
                }
                rightLimit--;
                x--;
                y--;
            }
            else break;

            if(x >= leftLimit ){
                for(;x >= leftLimit; x-- ){
                    sb.append(list.get(y)[x]).append(",");
                }
                bottomLimit--;
                y--;
                x++;
            }
            else break;

            if(y >= topLimit ){
                for(;y >= topLimit; y-- ){
                    sb.append(list.get(y)[x]).append(",");
                }
                leftLimit++;
                x++;
                y++;
            }
            else break;
        }
        System.out.println(sb.substring(0,sb.toString().length()-1).trim());
        return sb.substring(0,sb.toString().length()-1);
    }

}
