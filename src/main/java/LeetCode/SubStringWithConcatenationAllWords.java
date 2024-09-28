package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SubStringWithConcatenationAllWords {

    public static void main(String []args){

        List<Integer> position = findSubstring("wordgoodgoodgoodbestword"
                ,new String[]{"word","good","best","good"});
        position.forEach(System.out::println);
    }
    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> concatenationPos = new ArrayList<>();
        int sizeofConcatenation = words.length * words[0].length();
        System.out.println(s.length());
        for(int i = 0; i + sizeofConcatenation <= s.length(); i++){
            System.out.println("CurrentSize:" + (i + sizeofConcatenation));
            for(int j = 0; j < words.length; j++){
                if(i+words[j].length() > s.length()) continue;

                if(s.substring(i,i+words[j].length()).equals(words[j])){
                    //Found a match now check if a premutation exists
                    //If true save the position
                    if(checkIfPermutationsAreValid(words,s,i)){
                        concatenationPos.add(i);
                        break;
                    }

                }

            }
        }
        return concatenationPos;
    }
    public static boolean checkIfPermutationsAreValid(String[] words, String s, int position){
        if((words.length * words[0].length()) + position > s.length()){
            return false;
        }
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(words));

        while(!arrayList.isEmpty()){
            Iterator<String> iterator = arrayList.iterator();
            boolean foundWord = false;
            while(iterator.hasNext()){
                String word = iterator.next();
                if(s.substring(position,position+word.length()).equals(word)){
                    iterator.remove();
                    foundWord = true;
                    position +=word.length();
                    break;
                }
            }
            if(!foundWord){
               return false;
            }
        }
        return true;
    }
}
