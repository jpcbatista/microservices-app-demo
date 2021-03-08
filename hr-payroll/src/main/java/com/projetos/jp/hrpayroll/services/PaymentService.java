package com.projetos.jp.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.projetos.jp.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(Long workerId, Integer days) {
		return new Payment("bob", 200.0, days);
	}
	
}
