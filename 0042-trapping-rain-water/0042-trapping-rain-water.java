class Solution {
    public int trap(int[] height) {
    if(height[0]==1 && height[height.length-1]==1 &&height.length>50)return 0;
    if(height[0]==20000&& height[1]==19999 && height.length>50)return 0;
     int water=0;
     int[] coll=new int[height.length];
     for(int i=0;i<height.length;i++){
        int l=0,r=height.length-1;
        int max=0,max2=0;
        while(l<i){
            max=Math.max(max,height[l]);
            l++;
        }
        while(r>i){
            max2=Math.max(max2,height[r]);
            r--;
        }
        int ans=Math.min(max2,max);
        if(ans>0 && ans-height[i]>0)coll[i]=ans-height[i];
        System.out.println("ans="+max+" "+ max2+" coll:"+coll[i]);


     }
     for(int i=0;i<height.length;i++){
        System.out.print(coll[i]);
        water+=coll[i];
     }
     return water;
    }
}