package LeetCode;

import java.util.Arrays;

public class Regular_Expression_Matching {

    public static void main(String... args){



    }

    public static boolean isMatch(String s, String pattern, int i,int j){

        if(i == s.length()-1 || j == pattern.length()-1){
            return s.charAt(i) == pattern.charAt(j);
        }
            isMatch(s,pattern,i+1,j+i);
            isMatch(s,pattern,i+1,j);
            isMatch(s,pattern,i,j+1);


        return false;
    }
}
