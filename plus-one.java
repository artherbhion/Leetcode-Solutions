int * plusOne(int *digits, int digitsSize, int *returnSize){
    for (int i = digitsSize-1; i >= 0; i--) {
        if (digits[i] != 9) {
            digits[i] += 1;
            break;
        } else {
            digits[i] = 0;
        }
    }
    if (digits[0] == 0) {
     
        int size = digitsSize + 1;
        int *result = (int*)malloc(sizeof(int) * size);
        result[0] = 1;

        for (int i = 0; i < digitsSize; i++)
            result[i+1] = digits[i];
            
        *returnSize = size;
        return result;
    } else {
        *returnSize = digitsSize;
        return digits;
    }
}
