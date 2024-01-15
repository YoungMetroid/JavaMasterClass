package LeetCode.Amazon;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
class Result {

    public static List<List<String>> searchSuggestions(List<String> repository, String customerQuery) {
        // Write your code here
        List<List<String>> listsCollection=  new ArrayList<>();
        if(customerQuery.length() < 2) return listsCollection;

        for(int index = 1; index < customerQuery.length(); index++)
        {
            List<String> currentSuggestions = new ArrayList<>();
            String subString = customerQuery.substring(0,index+1);
            for (String str : repository)
            {
                if (index+1 <=str.length() && str.substring(0,index+1).toLowerCase() .contains(subString.toLowerCase())) {
                    currentSuggestions.add(str);

                }
            }
            Collections.sort(currentSuggestions);
            if(currentSuggestions.size() >= 3)
                currentSuggestions = currentSuggestions.subList(0, 3);

            if(!currentSuggestions.isEmpty()) listsCollection.add(currentSuggestions);
        }

        return listsCollection;
    }
}

public class SearchSuggestion {
    public static void main(String[] args) throws IOException {

        List<String>repository = new ArrayList<>();

        for(String s:args)
        {
            repository.add(s);
        }


        List<List<String>> result = Result.searchSuggestions(repository, "abbs");
       /* BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int repositoryCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> repository = IntStream.range(0, repositoryCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .collect(toList());

        String customerQuery = bufferedReader.readLine();

        List<List<String>> result = Result.searchSuggestions(repository, customerQuery);

        result.stream()
                .map(
                        r -> r.stream()
                                .collect(joining(" "))
                )
                .map(r -> r + "\n")
                .collect(toList())
                .forEach(e -> {
                    try {
                        bufferedWriter.write(e);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });

        bufferedReader.close();
        bufferedWriter.close();

        */
    }
}
