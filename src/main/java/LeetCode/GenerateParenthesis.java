package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public List<String> combinations = new ArrayList<>();
    public static void main(String ... args){

        GenerateParenthesis generateParenthesis = new GenerateParenthesis();
        generateParenthesis.generateParenthesis(3);
        generateParenthesis.combinations.forEach(System.out::println);
    }
    public List<String> generateParenthesis( int n) {
        dfs(0,0,n,"");
        return combinations;
    }

    public void dfs(int leftP, int rightP, int n,String combo){
        if(leftP == rightP && leftP+rightP == n*2){
            combinations.add(combo);
            return;
        }
        if(leftP < n){
            dfs(leftP+1, rightP,n,combo+"(");
        }
        if(rightP < leftP){
            dfs(leftP, rightP+1,n,combo+")");
        }
    }


}
