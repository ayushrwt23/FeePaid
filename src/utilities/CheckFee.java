package utilities;
import UserdefinedException.InsufficientFeeException;
public class CheckFee {
private int sid;
private double balance=94500.0;
public CheckFee(int id) {
	sid=id;
}
public bal(double paidfee ) {
	balance=balance-paidfee;
}
public void check()throws InsufficientFeeException {
	if(balance>=1000) {
		throw new InsufficientFeeException(balance);
	}
}
public int getId() {
	return sid;
}
public int getBalance() {
	return balance;
}
}
