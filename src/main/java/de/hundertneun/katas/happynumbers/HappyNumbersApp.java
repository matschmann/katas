package de.hundertneun.katas.happynumbers;

import java.util.ArrayList;
import java.util.List;

public class HappyNumbersApp {

    private List<Integer> listOfSums;
    
    public HappyNumbersApp() {
        listOfSums = new ArrayList<>();
    }

    public boolean isNumberHappy(int number) {
        int[] digits = getDigits(number);
        
        int sum = sumWithPower(digits);

        if (sum == 1) {
            return true;
        } else if (listOfSums.contains(sum)) {
            return false; 
        } else {
            listOfSums.add(sum);
            return isNumberHappy(sum);
        }
    }

    private int sumWithPower(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum; 
    }

    private int[] getDigits(int number) {
        String numberAsString = Integer.toString(number);

        int[] digits = new int[numberAsString.length()];
        for (int i = 0; i<numberAsString.length();i++) {
            digits[i] = Integer.parseInt("" + numberAsString.charAt(i));
        }
        
        return digits; 
    }

}
