import org.junit.jupiter.api.Test;

public class PowerTester {
    @Test
    void PowerOf_One_And_One() {
        PowerFinder powerFinder = new PowerFinder(1, 1);
        int power = powerFinder.power();
        assert power ==1;
    }

    @Test
    void PowerOf_One_And_Two() {
        PowerFinder powerFinder = new PowerFinder(1, 2);
        int power = powerFinder.power();
        assert power ==1;
    }

    @Test
    void PowerOf_Two_And_Two() {
        PowerFinder powerFinder = new PowerFinder(2, 2);
        int power = powerFinder.power();
        assert power==4;
    }

    @Test
    void Power_Of_Three_And_Two() {
        PowerFinder powerFinder = new PowerFinder(3, 2);
        int power = powerFinder.power();
        assert power ==9;
    }
}
