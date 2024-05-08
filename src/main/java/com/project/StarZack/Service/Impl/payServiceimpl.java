package com.project.StarZack.Service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;
import com.project.StarZack.entity.Payment;
import com.project.StarZack.repository.payrepository;
import com.project.StarZack.Service.PayService;

@Service
public class payServiceimpl implements PayService{
	
	payrepository payrepo;
	


	public payServiceimpl(payrepository payrepo) {
		
		this.payrepo = payrepo;
	}

	@Override
	public String CreatepayDetails(Payment pay) {
		payrepo.save(pay);
		return "Success";
	}

	@Override
	public String updatepayDetails(Payment pay) {
		payrepo.save(pay);
		return "Success";
	}

	@Override
	public String deletepayDetails(String UserId) {
		payrepo.deleteById(UserId);
		return "Success";
	}

	@Override
	public Payment getpayDetails(String UserId) {
		return payrepo.findById(UserId).get();
	}

	@Override
	public List<Payment> getAllPayments() {
		return payrepo.findAll();
	}

}
