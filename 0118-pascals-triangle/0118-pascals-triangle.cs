using System;
using System.Collections.Generic;

public class Solution {
    public IList<IList<int>> Generate(int numRows) {
        // Create the result as a List of List<int>
        IList<IList<int>> ans = new List<IList<int>>();

        for (int i = 0; i < numRows; i++) {
            List<int> row = new List<int>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.Add(1); // First and last elements are always 1
                } else {
                    // Get the previous row
                    IList<int> prev = ans[i - 1];
                    row.Add(prev[j - 1] + prev[j]);
                }
            }

            ans.Add(row);
        }

        return ans;
    }
}
