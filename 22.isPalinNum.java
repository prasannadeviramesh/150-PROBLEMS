import java.io.*;
import java.util.*;

class UserMainCode {
    public int isPalinNum(int input1) {
        int original = input1;
        int rev = 0;
        while (input1 > 0) {
            int last = input1 % 10;
            rev = rev * 10 + last;
            input1 = input1 / 10;
        }
        if (rev == original) {
            return 2; // Palindrome
        } else {
            return 1; // Not a palindrome
        }
    }
}
