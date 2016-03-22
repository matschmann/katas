package de.hundertneun.katas.happynumbers;


import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

public class HappyNumbersAppTest {
    
    private LinkedList<Integer> happyNumbers = new LinkedList<>(Arrays.asList(
            1, 7, 10, 13, 19, 23, 28, 31, 32, 44, 
            49, 68, 70, 79, 82, 86, 91, 94, 97, 
            100, 103, 109, 129, 130, 133, 139, 
            167, 176)); 

    @Test
    public void isNumberHappy() throws Exception {

        HappyNumbersApp happyNumbersApp = new HappyNumbersApp();

        for (int i = 1; i < happyNumbers.getLast(); i++) {
            boolean isHappy = happyNumbersApp.isNumberHappy(i);

            if (isHappy) {
                assertThat(happyNumbers).contains(i);
            } else {
                assertThat(happyNumbers).doesNotContain(i);
            }
        }
    }

}