class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int x=0,y=0,num=0;
       for(int i=0;i<commands.size();i++){
                if(commands.get(i).equals("UP")){
                    x=x-1;
                }
                else if(commands.get(i).equals("DOWN")){
                    x=x+1;
                }
                else if(commands.get(i).equals("RIGHT")){
                    y=y+1;
                }
                else if(commands.get(i).equals("LEFT")){
                     y=y-1;
                    
                }
                num=(x*n)+y;
        }
        return num;
    }
}