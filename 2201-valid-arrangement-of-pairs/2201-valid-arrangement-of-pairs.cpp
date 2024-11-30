class Solution {
public:
    vector<vector<int>> validArrangement(vector<vector<int>>& pairs) {
        ios_base::sync_with_stdio(false);
        int n = (int) pairs.size();
        unordered_map<int, vector<int> > Graph;
        unordered_map<int, int> Degree;
        for(const auto &pair: pairs){
            Graph[pair[0]].emplace_back(pair[1]);
            Degree[pair[0]]++;
            Degree[pair[1]]--;
        }
        int start = pairs[0][0];
        for(auto &d: Degree){
            if(d.second > 0){
                start = d.first;
            }
        }
        vector<int> path;
        auto dfs = [&](auto && self, int v)->void{
            while(!Graph[v].empty()){
                int u = Graph[v].back();
                Graph[v].pop_back();
                self(self, u);
            }
            path.emplace_back(v);
        };
        dfs(dfs, start);
        reverse(path.begin(), path.end());
        vector<vector<int> > res(n);
        for(int i = 0; i < n; i++){
            res[i] = {path[i], path[i + 1]};
        }
        return res;
    }
};