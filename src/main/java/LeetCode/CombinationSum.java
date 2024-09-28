package LeetCode;

import java.util.*;

public class CombinationSum {

    public List<List<Integer>> listOfCombinations = new ArrayList<>();
    public static void main(String []args){
        CombinationSum combinationSum = new CombinationSum();
        List<List<Integer>> combos = combinationSum.combinationSum(new int []{2,3,6,7, 9, 10, 20 , 25 ,27, 30},40);
        combos.forEach(System.out::println);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        //Recursive combinations
        Arrays.sort(candidates) ;
        //Fill with the highest values
        //Once passed pop and check if a value exists that sums to target
        //Pop value and fill with the next highest
        //Save the position of the highest
        //Repeat this loop unitl the lowest value is used to fill the array.
        //If the sum matches target save that array.

        List<Integer> combo = new ArrayList<>();
        int sum = fill(combo,candidates[candidates.length-1],0,target);
        listOfCombinations = new ArrayList<>();
        generateCombinations(combo,sum,target,candidates,candidates.length-1);
        return listOfCombinations;
    }

    public int generateCombinations(List<Integer> combo, int sum, int target,int[]candidates, int position){

        while(position >= 0) {
            int currentNum = candidates[position];
            System.out.println("Current Num: " + currentNum);
            sum = fill(combo,candidates[position],sum,target);

            while(!combo.isEmpty() && currentNum == combo.get(combo.size()-1)) {
                sum -= combo.remove(combo.size() - 1);
                if(!combo.isEmpty() && currentNum == combo.get(combo.size()-1))
                    sum = generateCombinations(combo, sum, target, candidates,position-1);
            }
            position--;
        }
        return sum;
    }

    public int fill(List<Integer> combo, int value, int sum, int target){

        while(sum < target){
            sum += value;
            combo.add(value);
        }
        if(sum == target){
            listOfCombinations.add(new ArrayList<>(combo));
        }
        return sum;
    }

}
