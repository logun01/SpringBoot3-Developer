import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class JunitTest2 {

    @Test
    public void junitTest2() {
        int number1 = 15;
        int number2 = 0;
        int number3 = -5;

        assertThat(number1).isPositive();
        assertThat(number1).isZero();
        assertThat(number1).isNegative();
        assertThat(number1).isGreaterThan(number2);
        assertThat(number3).isLessThan(number2);
    }
}
