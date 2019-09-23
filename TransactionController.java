package controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import model.Transaction;
import service.TransactionEJB;

@ManagedBean(name ="transactioncontroller")
@SessionScoped
public class TransactionController {
	
	@EJB
	TransactionEJB transactionservice;
	
	@ManagedProperty(value = "#{transaction}")
	private Transaction transaction;

	public void addNewTransaction() {
		
		System.out.println("testing add method");
		transactionservice.addNewTransaction(transaction.getEntity());
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	
}
