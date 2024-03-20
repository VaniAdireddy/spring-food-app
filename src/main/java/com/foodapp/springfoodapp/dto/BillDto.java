package com.foodapp.springfoodapp.dto;

import java.time.LocalDateTime;

public class BillDto {
	public Integer billId;
	public LocalDateTime billDate;
	public Double totalCost;
	public Integer totalItem;
	
	public BillDto(Integer billId, LocalDateTime billDate, Double totalCost, Integer totalItem) {
		this.billId = billId;
		this.billDate = billDate;
		this.totalCost = totalCost;
		this.totalItem = totalItem;
	}
	
	public Integer getBillId() {
		return billId;
	}
	
	public void setBillId(Integer billId) {
		this.billId = billId;
	}
	
	public LocalDateTime getBillDate() {
		return billDate;
	}
	
	public void setBillDate(LocalDateTime billDate) {
		this.billDate = billDate;
	}
	
	public Double getTotalCost() {
		return totalCost;
	}
	
	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}
	
	public Integer getTotalItem() {
		return totalItem;
	}
	
	public void setTotalItem(Integer totalItem) {
		this.totalItem = totalItem;
	}
}
