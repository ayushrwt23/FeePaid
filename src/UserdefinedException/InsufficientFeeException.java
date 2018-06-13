package UserdefinedException;

public class InsufficientFeeException extends Exception{
private double amount;
public InsufficientFeeException(double amount) {
	this.amount=amount;
}
public double getAmount() {
	return this.amount;
}
}
