import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class leapyearsShould {

    @Test
    void returnTrueIfYearIsDivisibleBy400() {

        //Arrange

        LeapYearDetector leapYearDetector = new LeapYearDetector();

        //Act

        Boolean response = leapYearDetector.isALeapYear(2000);

        // Assert

        Assertions.assertEquals(response, true);

    }

    @Test
    void returnFalseIfYearIsNotDivisibleBy400() {

        //Arrange

        LeapYearDetector leapYearDetector = new LeapYearDetector();

        //Act

        Boolean response = leapYearDetector.isALeapYear(1999);

        // Assert

        Assertions.assertEquals(response, false);

    }

    @Test
    void returnTrueIfYearIsDivisibleBy100ButNotBy400() {

        //Arrange

        LeapYearDetector leapYearDetector = new LeapYearDetector();

        // Act and Assert

        Assertions.assertEquals(leapYearDetector.isALeapYear(1700), false);
        Assertions.assertEquals(leapYearDetector.isALeapYear(2100), true);
    }

    @Test
    void returnTrueIfYearIsDivisibleBy4AndNotBy100() {

        //Arrange

        LeapYearDetector leapYearDetector = new LeapYearDetector();

        // Act and Assert

        Assertions.assertEquals(leapYearDetector.isALeapYear(2008), true);
    }

    @Test
    void returnFalseIfYearIsNotDivisibleBy4() {

        //Arrange

        LeapYearDetector leapYearDetector = new LeapYearDetector();

        // Act and Assert

        Assertions.assertEquals(leapYearDetector.isALeapYear(2017), false);
    }
}
