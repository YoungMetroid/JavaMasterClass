package LeetCode;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;
import java.util.HashSet;

public class Regular_Expression_Matching {

    public boolean isMatch(String s, String p) {
        int stringIndex = 0;
        int patternIndex = 0;
        char currentPattern = ' ';

        boolean inRepeat = false;

        for(int i = 0; i < p.length(); i++) {


            if (i + 1 < p.length()) {
                if (p.charAt(i + 1) == '*') {
                    inRepeat = true;
                    currentPattern = p.charAt(i);
                    i++;
                    continue;
                }
            }
        }

        return false;
    }

}
