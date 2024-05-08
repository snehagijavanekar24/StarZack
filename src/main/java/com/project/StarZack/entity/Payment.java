package com.project.StarZack.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Pay_info")
public class Payment {
	
	@Id
	private String Userid;
	private String UserName;
	private String cardDetails;
	private String PayMethod;
	private String productName;
	private String productId;
	private String productPrize;
	
	public Payment() {
		
	}

	public Payment(String userid, String userName, String cardDetails, String payMethod, String productName,
			String productId, String productPrize) {
		
		Userid = userid;
		UserName = userName;
		this.cardDetails = cardDetails;
		PayMethod = payMethod;
		this.productName = productName;
		this.productId = productId;
		this.productPrize = productPrize;
	}

	public String getUserid() {
		return Userid;
	}

	public void setUserid(String userid) {
		Userid = userid;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getCardDetails() {
		return cardDetails;
	}

	public void setCardDetails(String cardDetails) {
		this.cardDetails = cardDetails;
	}

	public String getPayMethod() {
		return PayMethod;
	}

	public void setPayMethod(String payMethod) {
		PayMethod = payMethod;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductPrize() {
		return productPrize;
	}

	public void setProductPrize(String productPrize) {
		this.productPrize = productPrize;
	}
	
	
	
	
	

}
