package com.bankbatch;

import java.text.SimpleDateFormat;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.bankbatch.model.BankTransaction;

//@Component
public class BankTransactionItemAnalyticsProcessor implements ItemProcessor<BankTransaction, BankTransaction>{

	private double totalDebit;   
	private double totalCredit;


	@Override
	public BankTransaction process(BankTransaction bankTransaction) throws Exception {
		
		if(bankTransaction.getTransactionType().equals("D"))totalDebit += bankTransaction.getAmount();		
		else if(bankTransaction.getTransactionType().equals("C"))totalCredit += bankTransaction.getAmount();			
		
		return bankTransaction;
	}

	
	public double getTotalDebit() {
		return totalDebit;
	}
	
	public double getTotalCredit() {
		return totalCredit;
	}
	
	
}
