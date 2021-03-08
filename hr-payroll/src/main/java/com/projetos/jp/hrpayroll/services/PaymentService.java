package com.projetos.jp.hrpayroll.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.projetos.jp.hrpayroll.entities.Payment;
import com.projetos.jp.hrpayroll.entities.Worker;

@Service
public class PaymentService {

	@Value("${hr-worker.host}")
	private String workerHost;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public Payment getPayment(Long workerId, Integer days) {
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("id", ""+workerId);
		String url = workerHost + "/workers/{id}";
		Worker worker = restTemplate.getForObject(url, Worker.class, uriVariables);
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
	
}
