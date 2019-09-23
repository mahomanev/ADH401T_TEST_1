package service;


import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.TransactionEntity;

/**
 * Session Bean implementation class TransactionEJB
 */
@Stateless
@LocalBean
public class TransactionEJB {

	@PersistenceContext
	private EntityManager trans;
	
	
    public TransactionEJB() {
        // TODO Auto-generated constructor stub
    }
    
    public void addNewTransaction(TransactionEntity transactionentity) {
    	System.out.println("Testing dB******");
    	trans.persist(transactionentity);
    }

}
