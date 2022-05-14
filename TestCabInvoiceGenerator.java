import Ride.Ride;
import com.bridgelabz.tdd.CabInvoiceGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCabInvoiceGenerator {

    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
        CabInvoiceGenerator fare = new CabInvoiceGenerator();
        double distance = 0.1;
        double time = 1;
        double totalFare = fare.calculateTotalFare(distance, time);
        Assertions.assertEquals(5, totalFare);
    }

    @Test
    public void givenMultipleRides_ShouldReturnTotalFare() {
        CabInvoiceGenerator fare = new CabInvoiceGenerator();
        Ride[] rides = { new Ride(2.0, 5),
                        new Ride(0.1, 1) 
                        };
        double totalFare = fare.calculateFare(rides);
        Assertions.assertEquals(27, totalFare);
    }
}
