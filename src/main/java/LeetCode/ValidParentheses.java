package LeetCode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Optional;
import java.util.stream.IntStream;

public class ValidParentheses {


    int recursionCount = 0;
    public static void main(String []args)
    {
        ValidParentheses v = new ValidParentheses();
        // v.isValid("((()))");

        //System.out.println(v.longestValidParentheses(")()())"));

        int //count = v.longestValidParentheses("()(()(((");
                count = v.longestValidParentheses("((((");
         count = v.longestValidParentheses("(())(((((()" +
                "()))((((()(" +
                ")(()()())()" +
                ")())()))()(" +
                ")()())(())(" +
                ")()(((())))" +
                ")()((()))((" +
                "(())()((()(" +
                ")())((())))" +
                "(())))())((" +
                "()())()()((" +
                "()((())))))");
        count = v.longestValidParentheses(")(()(()(((())(((((()()))((((()()(()()())())())()))()()()())(())()()(((()))))()((()))(((())()((()()())((())))(())))())((()())()()((()((())))))((()(((((()((()))(()()(())))((()))()))())");
         count = v.longestValidParentheses("(()()(())((");
        count = v.longestValidParentheses("()(()");

        count = v.longestValidParentheses(")(((((()())()()))()(()))(");
        System.out.println(count);
    }


    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<Character>();

        for(char c : s.toCharArray()){
            if(c == '}' || c ==')' || c == ']'){
                if(stack.isEmpty()) return false;


                if( !isPair(stack.pop(),c) ) return false;
                else continue;

            }
            stack.push(c);

        }
        return stack.isEmpty();
    }

    public boolean isPair(Character left, Character right){

        if(left.equals('(') && right.equals(')')) return true;
        if(left.equals('{') && right.equals('}')) return true;
        if(left.equals('[') && right.equals(']')) return true;

        return false;

    }

    public int longestValidParenthesesOptimal(String s){
        int maxCount = 0;
        int currentCount = 0;
        Deque<Character> stack = new ArrayDeque<>();

        for(int i = 0; i < s.length(); i++){

            if(s.charAt(i) == '(') {
                stack.push('(');
            }
            else if(s.charAt(i) == ')')
            {
               Optional<Character> c = Optional.of(stack.pop());
               if(c.isPresent() && c.get() == '(')
                   currentCount++;
            }
        }

        return maxCount;
    }
    public int longestValidParentheses(String s) {

        int maxCount = 0;
        int k = 0;

        if (IntStream.range(1,s.length()).allMatch(i -> s.charAt(i) == s.charAt(0)))
            return 0;

        for(int i = 0; i < s.length();i++){
            int j = i;
            k = j;
            while(true) {
                if (k+1  < s.length() && checkIfValid(s, j, k + 1)) {
                    k = k+2;
                    j = k;
                }
                else if (k + 1 < s.length()
                        && s.charAt(j) == '('
                        && s.charAt(k + 1) == '('){
                    k = longestValidParentheses(s, k + 1);
                    continue;
                }
                else break;
            }
            if(maxCount < j-i){
                maxCount = j-i;
                System.out.println("Count: " + (j-i));
            }
        }
        return maxCount;
    }
    public boolean checkIfValid(String s, int left, int right){
        if(right < s.length() && left >= 0){
            if(s.charAt(left) == '(' && s.charAt(right) == ')')
                return true;
        }
        return false;
    }
    public int longestValidParentheses(String s, int left) {
        int j = left;
        while (true) {
            //Check next
            if (j+1 < s.length() && checkIfValid(s, left, j + 1)) {
                j = j + 1;
                return j;
            }
            else if (j + 1 < s.length()
                    && s.charAt(left) == '('
                    && s.charAt(j + 1) == '(') {
                j = longestValidParentheses(s, j + 1);
                continue;
            }
            else break;
        }
        return j;
    }
}
