package LeetCode.Amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AmazonElias {


    public static void main(String []args){

        int [] comedyReleaseTime  = new int[]{1,4};
        int [] comedyDuration = new int[]{3,2};
        int [] dramaReleaseTime = new int[]{5,2};
        int [] dramaDuration = new int[]{2,2};

        AmazonElias elias = new AmazonElias();
        int result = elias.earliestTime(comedyReleaseTime,comedyDuration,
                dramaReleaseTime,dramaDuration);
        System.out.println(result);



    }

    public class Movie{
        public int duration;
        public int releaseTime;

        public Movie(int duration, int releaseTime){
            this.duration=  duration;
            this.releaseTime = releaseTime;
        }
        public int getReleaseTime(){
            return releaseTime;
        }
        public int getDuration(){
            return duration;
        }
    }


    public int earliestTime(int[] comedyReleaseTime, int [] comedyDuration,
                            int [] dramaReleaseTime, int [] dramaDuration){

        int result = Integer.MAX_VALUE;
        List<Movie> comedy = new ArrayList<>();
        List<Movie> drama = new ArrayList<>();
        List<Movie> c_d = new ArrayList<>();

        for(int i = 0; i < comedyReleaseTime.length; i++) {
            comedy.add(new Movie(comedyDuration[i],comedyReleaseTime[i]));
        }

        for(int i = 0; i < dramaReleaseTime.length; i++) {
            drama.add(new Movie(dramaDuration[i],dramaReleaseTime[i]));
        }
        //How to order a List with a custom Class
        //Collections.sort(comedy, Comparator.comparingInt(Movie::getReleaseTime));
        //Collections.sort(drama, Comparator.comparingInt(Movie::getReleaseTime));


        for(int i = 0; i < comedy.size(); i++){

           for(int j = 0; j < drama.size();j++){

               if(comedy.get(i).getReleaseTime() + comedy.get(i).getDuration() <=
                    drama.get(j).getReleaseTime())
               {
                   int total = drama.get(j).getReleaseTime() + drama.get(j).getDuration();

                   if( total  < result) {
                       result = total;
                       c_d.add(comedy.get(i));
                       c_d.add(drama.get(j));
                   }

               }
               else if(drama.get(j).getReleaseTime() + drama.get(j).getDuration() <=
                       comedy.get(i).getReleaseTime())
               {
                   int total = comedy.get(i).getReleaseTime() + comedy.get(i).getDuration();
                   if( total  < result) {
                       result = total;
                       c_d.add(drama.get(j));
                       c_d.add(comedy.get(i));
                   }
               }
           }

        }

        return result;
    }
}
