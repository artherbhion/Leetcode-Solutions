#include <string.h>

int longestCommonSubsequence(char* text1, char* text2) {
    int len1 = strlen(text1);
    int len2 = strlen(text2);
int dp[len1+1][len2+1];
    for (int i = 0; i <= len1; i++) {
        for (int j = 0; j <= len2; j++) {
            if (i == 0 || j == 0) {
                dp[i][j] = 0;  
            }
            else if (text1[i-1] == text2[j-1]) {
                dp[i][j] = dp[i-1][j-1] + 1;  
            }
            else {
                dp[i][j] = (dp[i-1][j] > dp[i][j-1]) ? dp[i-1][j] : dp[i][j-1];  
            }
        }
    }
    return dp[len1][len2];
}
