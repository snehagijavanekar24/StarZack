package com.project.StarZack.Service;

import java.util.List;


import com.project.StarZack.Entity.Payment;

public interface PayService {
	public String CreatepayDetails(Payment pay);
	public String updatepayDetails(Payment pay);
	public String deletepayDetails(String UserId);
	public Payment getpayDetails(String UserId);
	public List<Payment> getAllPayments();
	

}
