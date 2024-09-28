package LeetCode.Oracle;

import java.util.*;

public class CombineTimeRanges {

    public static void main(String []args){

        List<List<Integer>> meetings = new ArrayList<>(
                Arrays.asList(
                        Arrays.asList(800,1000)
                        ,Arrays.asList(1130,1200)
                        ,Arrays.asList(930,1100)
                        ,Arrays.asList(700,900)
                        ,Arrays.asList(1400,1600)
                        ,Arrays.asList(1500,1600)
                        ,Arrays.asList(1700,1730)
                        ,Arrays.asList(1730,1900)
                ));
        List<List<Integer>> mergedMeetings = combineTimeRanges(meetings);

    }


    public static List<List<Integer>> combineTimeRanges(List<List<Integer>> meetings){
        meetings.sort(Comparator.comparing(arr->arr.get(0)));

        List<Double> list  = new ArrayList<>();

        list.add(5.4);
        list.add(1.2);

        Optional<Double>opt = list.stream().sorted().findFirst();
        System.out.println(opt.get() +" "+ list.get(0));
        Comparator<Character> comp = (c1,c2)->0;

        List<List<Integer>> mergedMeetings = new ArrayList<>();
        int start = meetings.get(0).get(0);
        int end = meetings.get(0).get(1);
        meetings.remove(0);
        for(List<Integer> meeting:meetings){

            if(meeting.get(0) <= end ){
                end = end < meeting.get(1) ? meeting.get(1) : end;
            }
            else {
                mergedMeetings.add(Arrays.asList(start,end));
                start = meeting.get(0);
                end = meeting.get(1);
            }
        }
        if(end != mergedMeetings.get(mergedMeetings.size()-1).get(1)){
            mergedMeetings.add(Arrays.asList(start,end));
        }
        return mergedMeetings;
    }
}
