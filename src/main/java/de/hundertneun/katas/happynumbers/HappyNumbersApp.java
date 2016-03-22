package de.hundertneun.katas.happynumbers;

import java.util.ArrayList;
import java.util.List;


/**
 * Kata "Happy Numbers"
 * 
 * Write a function, that checks if a number is happy or not. 
 * 
 */
public class HappyNumbersApp {

    private List<Integer> listOfSums;
    
    public HappyNumbersApp() {
        listOfSums = new ArrayList<>();
    }

    /**
     * Checks if the number is happy.
     * 
     * A happy number is a number, in which the squares of the digits sum up to 1 in the long run.  
     * 
     * <br/>
     * More detailed definition of happy numbers: 
     *      <a href="https://en.wikipedia.org/wiki/Happy_number">https://en.wikipedia.org/wiki/Happy_number</a>
     * 
     * @param number number to check for happyness
     * @return true if number is happy
     */
    public boolean isNumberHappy(int number) {
        int[] digits = getDigits(number);
        
        int sum = sumWithPower(digits);

        if (sum == 1) {
            listOfSums.clear();
            return true;
        } else if (listOfSums.contains(sum)) {
            listOfSums.clear();
            return false; 
        } else {
            listOfSums.add(sum);
            return isNumberHappy(sum);
        }
    }

    private int sumWithPower(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += square(digit);
        }
        return sum; 
    }

    private double square(int digit) {
        return Math.pow(digit, 2);
    }

    private int[] getDigits(int number) {
        String numberAsString = Integer.toString(number);

        int[] digits = new int[numberAsString.length()];
        for (int i = 0; i < numberAsString.length(); i++) {
            digits[i] = Integer.parseInt("" + numberAsString.charAt(i));
        }
        
        return digits; 
    }

}
