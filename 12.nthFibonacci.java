public long nthFibonacci(int input1) {
    if (input1 == 0 || input1 == 1) return 0;
    if (input1 == 2) return 1;
    int temp1 = 0;
    int temp2 = 1;
    for (int i = 3; i <= input1; i++) {
        int temp3 = temp1 + temp2;
        temp1 = temp2;
        temp2 = temp3;
    }
    return temp2;
}
