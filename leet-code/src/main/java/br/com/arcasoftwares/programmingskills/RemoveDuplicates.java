package br.com.arcasoftwares.programmingskills;
public class RemoveDuplicates {
    public static void main(String[] args) {
        int k = removeDuplicates(new int[]{1,1,2,3,4,4,4});
        System.out.println(k);
    }

    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int lastPrinted = nums[0];
        int lastIndex = 1;
        for(int i = 1; i<= nums.length -1; i++){
            if(nums[i] != lastPrinted){
                lastPrinted = nums[i];
                nums[lastIndex] = lastPrinted;
                lastIndex++;
            }
        }
        return lastIndex;
    }
}
