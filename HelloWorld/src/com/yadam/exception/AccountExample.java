package com.yadam.exception;

class Account {
	private long balance;

	public Account() {

	}

	public long getBalance() {
		return balance;
	}

	public void deposit(int money) {
		balance += money;
	}

	public void withdraw(int money) throws BalanceInsufficientException {
		if (balance < money) {
			throw new BalanceInsufficientException("잔고부족: " + (money - balance) + "원 " + "모자랍니다.");
		}
		balance -= money;
	}
}

public class AccountExample {
	public static void main(String[] args) {
		Account accnt = new Account();
		accnt.deposit(10000); // 예금액
		System.out.println("예금액 : " + accnt.getBalance() + "원");

		try {
			accnt.withdraw(20000); // 출금액
		} catch (BalanceInsufficientException e) {
			System.out.println(e.getMessage()); // ("잔고부족: " + (money - balance) + "원 " + "모자랍니다.");
//			e.printStackTrace(); //오류를 출력해주는 메소드
		}
		System.out.println("프로그램 종료.");
	}
}
