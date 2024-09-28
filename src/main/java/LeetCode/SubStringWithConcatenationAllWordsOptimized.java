package LeetCode;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubStringWithConcatenationAllWordsOptimized {

    public static void main(String []args){

        List<Integer> position = findSubstring("barfoothefoobarman"
                ,new String[]{"foo","bar"});
        position.forEach(System.out::println);
    }
    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> concatenationPos = new ArrayList<>();
        HashMap<String,Integer> uniqueWordsAndCount = new HashMap<>();

        for(String str: words){
            Integer value = uniqueWordsAndCount.get(str);
            if (value != null) {
                uniqueWordsAndCount.put(str,++value);
            }
            else uniqueWordsAndCount.put(str,1);
        }

        int sizeofConcatenation = words.length * words[0].length();
        outer_loop:
        for(int i = 0; i + sizeofConcatenation <= s.length(); i++){
            for(int j = 0; j < words.length; j++){
                if((words.length * words[0].length()) + i > s.length()) break outer_loop;

                if(s.substring(i,i+words[j].length()).equals(words[j])){
                    //Found a match now check if a premutation exists
                    //If true save the position
                    if(checkIfPermutationsAreValid(uniqueWordsAndCount,s,i,words[0].length(), words.length)){
                        concatenationPos.add(i);
                        break;
                    }

                }

            }
        }
        return concatenationPos;
    }
    public static boolean checkIfPermutationsAreValid(HashMap<String, Integer> words, String s,
    int position, int wordLength, int wordCount){
        int wordsFound = 0;
        HashMap<String,Integer> copiedMap = new HashMap<>(words);
        while(true){
            if(position+wordLength > s.length() || wordsFound == wordCount)
                break;
            String substr = s.substring(position,position+wordLength);
            if(!copiedMap.containsKey(substr)) return false;
            else{
                Integer val = copiedMap.get(substr);
                if(val.intValue() == 0){
                    break;
                }
                else {
                    copiedMap.put(substr,--val);
                    wordsFound++;
                }
            }
            position = position+wordLength;
        }
        for(Map.Entry<String, Integer> entry: copiedMap.entrySet()){
            if(entry.getValue() != 0)
                return false;
        }
        return true;
    }
}
