package LeetCode;

import java.math.BigInteger;
import java.util.*;

public class FourSum {
    public static void main(String []args){

        FourSum fourSum = new FourSum();
        List<List<Integer>> results = fourSum.fourSum(new int[]{1000000000,1000000000,1000000000,1000000000},-294967296);

        for(List<Integer> result : results){
            System.out.println(Arrays.toString(result.toArray()));
        }
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);
        List<List<Integer>> combinations = new ArrayList<>();
        HashMap<String,Integer> unique = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1 ; j < nums.length; j++){
                int k = j+1;
                int l = nums.length-1;

                while(l >=0 && k < nums.length && k < l ){
                    BigInteger sum = BigInteger.valueOf( (long)nums[i]
                            + (long)nums[j]
                            + (long)nums[k]
                            + (long)nums[l]);

                    if(sum.equals(BigInteger.valueOf(target))){
                        StringBuilder sb = new StringBuilder();
                        sb.append(nums[i]);
                        sb.append(nums[j]);
                        sb.append(nums[k]);
                        sb.append(nums[l]);
                        if(unique.get(sb.toString()) == null){
                            unique.put(sb.toString(),0);
                            combinations.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k],nums[l])));
                        }
                        l--;
                    }
                    else if(sum.compareTo(BigInteger.valueOf(target)) == 1 ){
                        l--;
                    }
                    else  {k++;}
                    }
                }
            }
            return combinations;
        }
}
