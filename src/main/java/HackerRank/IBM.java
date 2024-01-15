package HackerRank;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class IBM {

    public static void main(String []args)
    {
        IBM ibm = new IBM();
        ibm.finestFoodOutlet("",0);
    }


    public class Fields
    {
        int page;
        int per_page;
        int total;
        int total_pages;
        DataSchema data;
    }
    public class DataSchema
    {
        int id;
        String name;
        String city;
        int estimatedCost;
        UserRating user_rating;
    }
    public class UserRating{
        int average_rating;
        int votes;
    }
    public String finestFoodOutlet(String city, int votes) {


        try {
            String site = "http://localhost:8080/services/foodoutlet/1";
            URL url = new URL(site);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            int responsecode = conn.getResponseCode();
            if (responsecode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responsecode);
            } else {

                String inline = "";
                Scanner scanner = new Scanner(url.openStream());

                //Write all the JSON data into a string using a scanner
                while (scanner.hasNext()) {
                    inline += scanner.nextLine();
                }

                //Close the scanner
                scanner.close();

                //Using the JSON simple library parse the string into a json object

                JSONObject jsonObject = (JSONObject) JSONValue.parse(inline);
                System.out.println(jsonObject.get("per_page"));
                System.out.println(jsonObject.get("page"));
                System.out.println(jsonObject.get("total"));

                JSONObject jsonObject1 = (JSONObject) jsonObject.get("data");
                String name = (String)jsonObject1.get("name");
                String city_name  = (String) jsonObject1.get("city");

                JSONObject jsonObject2 = (JSONObject) jsonObject1.get("user_rating");
                Long average_rating = (Long) jsonObject2.get("average_rating");
                Long votes_count = (Long) jsonObject2.get("votes");

                System.out.println("average_rating: " +  average_rating);
                System.out.println("votes_count: " +  votes_count);

            }

        } catch (Exception ex) {

        }
        return "";
    }
}
