class Solution {
    public int[] findErrorNums(int[] nums) {
        int x=0,y=0,x2=0,y2=0,r=0,m=0;

        for(int i = 0;i<nums.length;i++){
            x+=nums[i];
            x2+=(nums[i]*nums[i]);

            y+=(i+1);
            y2+=((i+1) * (i+1));
        }
        // two equation
        int x_y = x-y;
        int x2_y2 = x2-y2;
        int xy = x2_y2/x_y;
        r = (xy+x_y)/2;
        m = xy - r;

        return new int[]{r,m};
    }
}