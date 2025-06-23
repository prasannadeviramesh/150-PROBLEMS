import java.io.*;
import java.util.*;

class UserMainCode {
    public int allDigitsCount(int input1) {
        int count = 0;
        while (input1 > 0) {
            int removeLast = input1 % 10; // Gets the last digit (optional here)
            count++;
            input1 = input1 / 10; // Removes the last digit
        }
        return count;
    }
}
