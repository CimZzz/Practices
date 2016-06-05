package edu.fzu.openfund.domain;

import java.util.Date;

public class Fund {
	private int fundNo;
	private String fundName;
	private Double fundPrice;
	private String fundDes;
	private String fundStatus;
	private Date fundCreateDate;
	
	public Fund()
	{
		
	}
	
	public int getFundNo() {
		return fundNo;
	}
	public void setFundNo(int fundNo) {
		this.fundNo = fundNo;
	}
	public String getFundName() {
		return fundName;
	}
	public void setFundName(String fundName) {
		this.fundName = fundName;
	}
	public Double getFundPrice() {
		return fundPrice;
	}
	public void setFundPrice(Double fundPrice) {
		this.fundPrice = fundPrice;
	}
	public String getFundDes() {
		return fundDes;
	}
	public void setFundDes(String fundDes) {
		this.fundDes = fundDes;
	}
	public String getFundStatus() {
		return fundStatus;
	}
	public void setFundStatus(String fundStatus) {
		this.fundStatus = fundStatus;
	}
	public Date getFundCreateDate() {
		return fundCreateDate;
	}
	public void setFundCreateDate(Date fundCreateDate) {
		this.fundCreateDate = fundCreateDate;
	}
	
}
