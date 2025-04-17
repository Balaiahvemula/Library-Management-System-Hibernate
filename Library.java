package com.LibraryInformation;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Library {
@Id
private int Bid;
private String Bname;
private double BPrice;
public int getBid() {
	return Bid;
}
public void setBid(int bid) {
	Bid = bid;
}
public String getBname() {
	return Bname;
}
public void setBname(String bname) {
	Bname = bname;
}
public double getBPrice() {
	return BPrice;
}
public void setBPrice(double bPrice) {
	BPrice = bPrice;
}

}
