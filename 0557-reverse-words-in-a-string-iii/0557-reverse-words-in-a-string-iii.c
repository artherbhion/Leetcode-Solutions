void reverse(char* s,int st,int e){
    while(st<e){
        char temp=s[st];
        s[st]=s[e];
        s[e]=temp;
        st++;
        e--;
    }
}
char* reverseWords(char* s) {
    int st=0,e=0;
    for(int i=0;i<=strlen(s);i++){
        if(s[i]==' ' || s[i]=='\0'){
            e=i-1;
            reverse(s,st,e);
            st=i+1;
            printf("%d",st);
        }
    }
    return s;
}