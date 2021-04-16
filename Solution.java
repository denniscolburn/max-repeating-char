import java.io.*;
import java.util.*;

// Test cases:
// Single character
// String with max consecutive characters at the beginning
// String with max consecutive characters at the end
// String with spaces
public class Solution {
	
	public static void main(String args[]) {
        String s = "DDennnis";
        getMaxRepeatingChar(s);
	}
	
	static void getMaxRepeatingChar(String s) {
		int stringLength = s.length();
		int maxCount = 0;

        char maxChar = s.charAt(0);
		
        for (int i = 0; i < stringLength; i++) {
            int currentMaxCount = 1;
			
            for (int j = i + 1; j < stringLength; j++) {
                if (s.charAt(i) != s.charAt(j)) { 
                    break;
				}
                currentMaxCount++;
            }
  
            if (currentMaxCount > maxCount) {
                maxCount = currentMaxCount;
                maxChar = s.charAt(i);
            }
        }
        System.out.println(maxChar + ", " + maxCount);
    }
}