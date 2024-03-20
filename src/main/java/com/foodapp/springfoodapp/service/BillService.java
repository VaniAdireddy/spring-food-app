package com.foodapp.springfoodapp.service;

import com.foodapp.springfoodapp.entiry.Bill;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BillService {

	List<Bill> getBills();

	Bill addBill(Bill bill);

	Bill getById(int billId);

    Bill updateBill(Integer id,Bill updateBill);

	String deleteBill(int billId);

	List<Bill> saveAllBills(List<Bill> bills);
}
