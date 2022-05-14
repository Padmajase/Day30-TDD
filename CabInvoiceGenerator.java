package com.bridgelabz.tdd;

public class CabInvoiceGenerator {

    private static final int CostPerKm = 10;
    private static final int CostPerTime = 1;

    public double calculateTotalFare(double distance, double time) {
        double fare = (distance * CostPerKm + time * CostPerTime);
        if (fare < 5)
        {
            return 5;
        }
        return fare;
    }

    public <Ride> double calculateFare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += this.calculateFare(ride.distanceR, ride.timeR);
        }
        return totalFare;
    }
}
