package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums)
    {
        Map table = new HashMap<Integer, Integer>();

        for(int num:nums)
        {
            if(table.get(num) == null)
                table.put(num,num);
            else return true;
        }
        return false;
    }
}
