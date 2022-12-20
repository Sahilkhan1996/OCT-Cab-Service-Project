package com.bridgelabz.cab_service;

public class FareCalculator {
	static final int COST_PER_KM = 10;
	static final int COST_PER_MINUTE = 1;
	static final int MINIMUM_FARE = 5;
	static double count;
	static double totalFareForAllJourneys;

	public static void main(String[] args) {
		System.out.println("Welcome to Cab Service project");
		// Step 1: Calculating total fare which returns the total fare
		double totalFare = totalfare(0, 4); // distance,time
		double totalFare2 = totalfare(10, 5); // distance,time
		double totalFare3 = totalfare(20, 6); // distance,time
		double totalFare4 = totalfare(30, 7); // distance,time
		double totalFare5 = totalfare(40, 8); // distance,time

		// Step2: Calculating the average of all the fare
		double avg1 = averageOfFare();
		System.out.println("Average for all the journey is: " + avg1);
	}

	private static double totalfare(int distance, int time) {
		int totalCostForDist = distance * COST_PER_KM;
		int totalCostForTime = time * COST_PER_MINUTE;
		double totalFare = totalCostForDist + totalCostForTime;
		// if the total cost is low than the 5 INR then minimum fare would be 5 INR
		if (totalFare < MINIMUM_FARE) {
			totalFare = MINIMUM_FARE;
		}
		count++;
		totalFareForAllJourneys += totalFare;
		// Step 3: Calculating the total fare number of journey and average of all the
		// journey
		System.out.println("Total fare of the journey: " + totalFare + " and number of journey: " + (int) count + ""
				+ " Average for all the journey: " + averageOfFare());
		return totalFare;
	}

	private static double averageOfFare() {
		double avg = totalFareForAllJourneys / count;
		// System.out.println("Average for all the journey is: " + avg);
		return avg;
	}
}
