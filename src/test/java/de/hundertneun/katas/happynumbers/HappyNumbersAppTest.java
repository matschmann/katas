package de.hundertneun.katas.happynumbers;


import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class HappyNumbersAppTest {


    @Test
    public void isNumberHappy() throws Exception {

        HappyNumbersApp happyNumbersApp = new HappyNumbersApp();

        assertThat(happyNumbersApp.isNumberHappy(1)).isTrue();
        assertThat(happyNumbersApp.isNumberHappy(10)).isTrue();
        assertThat(happyNumbersApp.isNumberHappy(13)).isTrue();
        assertThat(happyNumbersApp.isNumberHappy(19)).isTrue();
    }
}