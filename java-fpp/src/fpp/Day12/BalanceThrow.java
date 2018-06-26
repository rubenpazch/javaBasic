package lesson12exceptionhandling;

public class BalanceThrow {
	public static void main(String[] args) {
		int balance = 100, withdraw = 1000; 
		if (balance < withdraw) 
		{ 
		UnsupportedOperationException e = new UnsupportedOperationException("No money, Sorry");
		throw e; 
		} else
		{ System.out.println("Draw Money & enjoy, Best wishes of the day"); 
		} 
		System.out.println("End");
		}
	}
