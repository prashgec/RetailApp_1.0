/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.reatil.VO;

import java.util.Date;

/**
 *
 * @author sushil
 */
public class Customer {
    private String customerName;
  //  private String CustomerId;
    private String contactNo;
    private Date dateOfBirth;
    private String userName;
    private String password;
    public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

    
public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
//	public String getCustomerId() {
//		return CustomerId;
//	}
//	public void setCustomerId(String customerId) {
//		CustomerId = customerId;
//	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
