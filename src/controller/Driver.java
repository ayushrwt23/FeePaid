package controller;
import UserdefinedException.*;
import utilities.*;
import java.util.*;

public class Driver {
public static void main(String args[]) {
	Scanner sr=new Scanner(System.in);
	CheckFee ob=new CheckFee(1568);
	System.out.println("ENTER THE AMOUNT OOF FEE YOU WANT TO DEPOSIT");
	double fee=sr.nextDouble();
	ob.bal(fee);
	
	try {
		ob.check();
		System.out.println("ADMIT CARD IS AVAILABLE FOR YOU"+ ob.getId);
	}catch(InsufficientFeeException e) {
		System.out.println("ADMIT CARD IS NOT AVAIBLE FOR YOU.KINDLY, PAY RS= "+ob.getBalance());
	}
	
}
}
