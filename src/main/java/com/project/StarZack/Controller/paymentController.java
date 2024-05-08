package com.project.StarZack.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.StarZack.entity.Payment;
import com.project.StarZack.Service.PayService;

@RestController
@RequestMapping("/Payment")
public class paymentController {
	PayService payService;
	 

	public paymentController(PayService payService) {
		
		this.payService = payService;
	}

	@GetMapping("{UserId}")
    public Payment getPayDetails(@PathVariable("UserId") String UserId){
        return payService.getpayDetails(UserId);
    }

    @GetMapping()
    public List <Payment> getAllPaymentDetails(){
        return payService.getAllPayments();
    }

    @PostMapping
    public String createpayDetails(@RequestBody Payment pay){
        payService.CreatepayDetails(pay);
        return "Payment Created Successfully";
    }

    @PutMapping
    public String updatepayDetails(@RequestBody Payment pay){
        payService.updatepayDetails(pay);
        return "payment Updated Successully";
    }

    @DeleteMapping("{UserId}")
    public String deletepayDetails(@PathVariable("UserId")String UserId){
        payService.deletepayDetails(UserId);
        return "apyment Deleted Successfully";
    }

}
