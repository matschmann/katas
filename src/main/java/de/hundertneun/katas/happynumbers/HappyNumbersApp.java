package de.hundertneun.katas.happynumbers;

public class HappyNumbersApp {

    public static void main(String... args) {
        System.out.println("fröhliche zahlen");
    }

    public boolean isNumberHappy(int number) {
        int[] digits = getDigits(number);

        
        int sum = sumWithPower(digits);

        return false; 
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
            digits[i] = numberAsString.charAt(i);
        }
        
        return digits; 
    }

}
