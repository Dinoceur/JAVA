package com.austin.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.austin.savetravels.models.Expense;
import com.austin.savetravels.repo.ExpenseRepository;

@Service
public class ExpenseService {
	
	//adding the expense repository as a dependency
	
//	private final ExpenseRepository expenseRepository;
//	public ExpenseService(ExpenseRepository expenseRepository) {
//		this.expenseRepository = expenseRepository;
//	}
	
	@Autowired
	ExpenseRepository expenseRepository;

	// READ ALL
	public List<Expense> allExpenses() {
		return expenseRepository.findAll();
	}

	// CREATE
	public Expense createExpense(Expense b) {
		return expenseRepository.save(b);
	}

	// READ ONE
	public Expense findExpense(Long id) {
		Optional<Expense> optionalExpense = expenseRepository.findById(id);
		if (optionalExpense.isPresent()) {
			return optionalExpense.get();
		} else {
			return null;
		}
	}
	
	//UPDATE
	public Expense updateExpense(Expense expense, Long id) {
		Optional<Expense> optionalExpense = expenseRepository.findById(id);
		if(optionalExpense.isPresent()) {
			return expenseRepository.save(expense);
		} else {
			return null;
		}
	}
	
	//DELETE
	public void deleteExpense(Long id) {
		Optional<Expense> optionalExpense = expenseRepository.findById(id);
		if(optionalExpense.isPresent()) {
			expenseRepository.deleteById(id);			
		}
	}
}
