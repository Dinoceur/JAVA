package com.austin.savetravels.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.austin.savetravels.models.Expense;
import com.austin.savetravels.services.ExpenseService;

@Controller
public class ExpenseController {
	
	@Autowired
	private ExpenseService expenseService;
	
	@RequestMapping("/")
		public String index() {
			System.out.println("index");
			return "redirect:/expenses";
		}


	@GetMapping("/expenses")
	public String index(@ModelAttribute("expense") Expense expense, Model model) {
		List<Expense> expenses = expenseService.allExpenses();
		model.addAttribute("expenses", expenses);
		return "index.jsp";
	}

	//Show one
	@GetMapping("/expenses/{id}")
	public String showOne(@PathVariable("id") Long id, Model model) {
		Expense expense = expenseService.findExpense(id);
		model.addAttribute("expense", expense);
		return "show.jsp";
	}
	
	// Create new
	@PostMapping("/expenses/new")
	public String newExpense(@Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model) {
		if (result.hasErrors()) {
			List<Expense> expenses = expenseService.allExpenses();
			model.addAttribute("expenses", expenses);
			return "index.jsp";
		} else {
			expenseService.createExpense(expense);
			return "redirect:/expenses";
		}
	}
	
	// Edit
	@GetMapping("/expenses/{id}/edit")
	public String edit(@PathVariable("id") Long id, Model model) {
		Expense expense = expenseService.findExpense(id);
		model.addAttribute("expense", expense);
		return "edit.jsp";
	}

	// Update
	@PutMapping("/expenses/{id}")
	public String update(@Valid @PathVariable("id") Long id, @ModelAttribute("expense") Expense expense,
			BindingResult result) {
		if (result.hasErrors()) {
			return "edit.jsp";
		} else {
			expenseService.updateExpense(expense, id);
			return "redirect:/expenses";
		}
	}

	// Delete
	@DeleteMapping("/expenses/{id}")
	public String destroy(@PathVariable("id") Long id) {
		expenseService.deleteExpense(id);
		return "redirect:/expenses";
	}
}
