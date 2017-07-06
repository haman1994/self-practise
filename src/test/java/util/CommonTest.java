package util;

public class CommonTest {
	
	public double earnPerDay = 1500 * (double)calculateDailyInterest(7.3);
	
	
	
			
	public double calculateDailyInterest(double yearlyInterest){
		return yearlyInterest/100/365;
	}
}
