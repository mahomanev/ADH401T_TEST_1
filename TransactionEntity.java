package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "transaction_table")
public class TransactionEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long transactionCode;
	
	private String fullNames;
	private String sourcePassPort;
	private String destinationPassPort;
	private String destinationBank;
	private String destinationCountry;
	private int  accountNumber;
	private double account;
	public Long getTransactionCode() {
		return transactionCode;
	}
	public void setTransactionCode(Long transactionCode) {
		this.transactionCode = transactionCode;
	}
	public String getFullNames() {
		return fullNames;
	}
	public void setFullNames(String fullNames) {
		this.fullNames = fullNames;
	}
	public String getSourcePassPort() {
		return sourcePassPort;
	}
	public void setSourcePassPort(String sourcePassPort) {
		this.sourcePassPort = sourcePassPort;
	}
	public String getDestinationPassPort() {
		return destinationPassPort;
	}
	public void setDestinationPassPort(String destinationPassPort) {
		this.destinationPassPort = destinationPassPort;
	}
	public String getDestinationBank() {
		return destinationBank;
	}
	public void setDestinationBank(String destinationBank) {
		this.destinationBank = destinationBank;
	}
	public String getDestinationCountry() {
		return destinationCountry;
	}
	public void setDestinationCountry(String destinationCountry) {
		this.destinationCountry = destinationCountry;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAccount() {
		return account;
	}
	public void setAccount(double account) {
		this.account = account;
	}

	
}
