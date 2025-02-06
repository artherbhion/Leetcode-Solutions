class Solution {
    public int minimumSum(int num) {
        int a= (num/1000*10)+(num/100)%10;
        int b=(num%100);
        int c=(num/1000*10)+(num%10);
        int d=(num%1000)/10;
        int e = ((num/100)%10)*10+(num/1000);  
        int f=(num%10)*10+(num%100)/10;
        int g=num%10*10+num/1000;
        int h=num/1000*10+(num%100)/10;
        int i=((num/100)%10)*10+num%10;
        int j=num%10*10+(num%1000)/100;
        int k=(num%100)/10*10+num/1000;
        return Math.min(a+b,Math.min(j+k,Math.min(b+e,Math.min(c+d,Math.min(d+g,Math.min(a+f,h+i))))));
    }
}