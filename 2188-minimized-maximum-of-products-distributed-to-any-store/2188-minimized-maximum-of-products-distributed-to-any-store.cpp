class Solution {
public:
    bool isPossible(int n,vector<int>&quantities,int mid){
        int stores=0;
        for(auto x:quantities){
            stores+=x/mid;
            if(x%mid) stores++;
            if(stores>n) return 0;
        }
        return stores<=n;
    }
    int minimizedMaximum(int n, vector<int>& quantities) {
        int maxi=0;
        long long sum=0;
        for(auto x:quantities){
            sum+=x;
            maxi=max(maxi,x);
        }
        int s=sum/n,e=maxi,ans=-1;
        if(s==0) s=1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(isPossible(n,quantities,mid)){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }
};