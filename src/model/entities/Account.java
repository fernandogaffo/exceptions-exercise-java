package model.entities;

import model.exceptions.InvalidAmmountException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public Double getBalance() {
		return balance;
	}

	public void deposit(Double ammount) {
		balance += ammount;
	}

	public void withdraw(Double ammount) {
		if(ammount > withdrawLimit) {
			throw new InvalidAmmountException("The ammount exceeds withdraw limit.");
		}
		if(ammount > balance) {
			throw new InvalidAmmountException("Not enought balance.");
		}
		balance -= ammount;
	}
}
