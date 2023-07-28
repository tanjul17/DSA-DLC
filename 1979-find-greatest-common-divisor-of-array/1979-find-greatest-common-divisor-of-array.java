class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        return gcd(nums[0],nums[nums.length-1]);
    }
    public int gcd (int a,int b){
        if(b==0)
            return a;
        else
            return gcd(b,Math.abs(a-b));
    }
}