class Solution {
    public char[][] rotateTheBox(char[][] box) {
        for(int i=0;i<box.length;i++){
            boolean changed=true;
            while(changed){
                changed=false;
                for(int j=0;j<box[0].length-1;j++){
                    if(box[i][j]=='*' || box[i][j+1]=='*'){
                        continue;
                    }
                    if(box[i][j]=='#' && box[i][j+1]=='.'){
                        char temp=box[i][j];
                        box[i][j]=box[i][j+1];
                        box[i][j+1]=temp;
                        changed=true;
                        break;
                    }
                }
            }       
        }
        char[][] ans=new char[box[0].length][box.length];
        int start=0;
        for(int i=box.length-1;i>=0;i--){
            
            for(int j=0;j<box[0].length;j++){
                ans[j][start]=box[i][j];
                
            }
            start++;
        }
        return ans;
    }
}