package com.bankbatch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bankbatch.dao.BankTransactionRepository;
import com.bankbatch.model.BankTransaction;

@Component
public class BankTransactionItemWriter implements ItemWriter<BankTransaction> {
	
	@Autowired
	private BankTransactionRepository bankTransactionRepository;
	

	@Override
	public void write(List<? extends BankTransaction> list) throws Exception {
		
		bankTransactionRepository.saveAll(list);
		
	}

}
