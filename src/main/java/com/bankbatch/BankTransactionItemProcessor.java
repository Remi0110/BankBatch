package com.bankbatch;

import java.text.SimpleDateFormat;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.bankbatch.model.BankTransaction;

//@Component
public class BankTransactionItemProcessor implements ItemProcessor<BankTransaction, BankTransaction>{

	
	private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy-HH:mm");

	@Override
	public BankTransaction process(BankTransaction bankTransaction) throws Exception {
		
		bankTransaction.setTransactionDate(dateFormat.parse(bankTransaction.getStrTransactionDate()));	
		
		
		return bankTransaction;
	}

}
