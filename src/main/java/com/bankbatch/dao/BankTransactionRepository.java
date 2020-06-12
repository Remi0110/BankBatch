package com.bankbatch.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankbatch.model.BankTransaction;

public interface BankTransactionRepository extends JpaRepository<BankTransaction, Long>{

}
