package LeetCode.IslandsProblem;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Anagram {

    public Anagram()
    {

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        passbyValue(list);
        for (String str:list)
        {
            System.out.println(str);
        }
        String x = "1";
        passbyValue2(x);
        int y = 1;
        passbyValue3(y);
        System.out.println(x);
    }

    public void passbyValue(List list)
    {
        list.add("B");
    }

    public void passbyValue2(String x)
    {
       x = "2";
    }
    public void passbyValue3(int y)
    {
        y = 3;
    }




    public Collection<List<String>> anagramCollection(List<String> list)
    {
        ArrayList<List<String>> collection = new ArrayList<>();

        for (String currentString: list)
        {
            if(!collection.isEmpty())
            {
                boolean newAnagram = true;
                for(List<String> currentCollection: collection)
                {
                   String anagram = currentCollection.get(0);
                   String copy = currentString;

                   for(int index=0; index < anagram.length(); index++)
                   {
                       int position = currentString.indexOf(anagram.charAt(index));
                       if(position >=0)
                       {
                           String character = String.valueOf(anagram.charAt(index));
                           currentString = currentString.replaceFirst(character,"");
                       }
                   }
                    if(currentString.length() > 0)
                    {
                        currentString = copy;
                    }
                    else
                    {
                        currentCollection.add(copy);
                        newAnagram = false;
                        break;
                    }
                }

                if(newAnagram)
                {
                List<String> newList = new ArrayList<>();
                newList.add(currentString);
                collection.add(newList);
                }

            }
            else
            {
                List<String> tempList  = new ArrayList<>();
                tempList.add(currentString);
                collection.add(tempList);
            }

        }

        return collection;
    }
}
