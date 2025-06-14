class UserMainCode
{
    public int nFactorial(int input1) {
        int result = 1;
        for (int i = 1; i <= input1; i++) {
            result = result * i;
        }
        return result;
    }
}
