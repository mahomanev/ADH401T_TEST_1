package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "transaction")
@SessionScoped
public class Transaction {

	private String fullNames;
	private String sourcePassPort;
	private String destinationPassPort;
	private String destinationBank;
	private String destinationCountry;
	private int  accountNumber;
	private double account;
	
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
	public TransactionEntity getEntity() {
		TransactionEntity transactionentity = new TransactionEntity();
		
		transactionentity.setFullNames(fullNames);
		transactionentity.setSourcePassPort(sourcePassPort);
		transactionentity.setDestinationPassPort(destinationPassPort);
		transactionentity.setDestinationBank(destinationBank);
		transactionentity.setDestinationCountry(destinationCountry);
		transactionentity.setAccountNumber(accountNumber);
		transactionentity.setAccount(account);
		
		return transactionentity;
	}
	
	
}
