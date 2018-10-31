package com.excel.demo.bean;

import java.math.BigDecimal;
import java.sql.Timestamp;


public class RateInfo {
	
	private String ls_Ccy_Cde;
	private String ls_Relvt_Ccy_Cde;
	private BigDecimal lbd_Mid = new BigDecimal("0");
	private BigDecimal lbd_Bid = new BigDecimal("0");
	private BigDecimal lbd_Ask = new BigDecimal("0");
	private String ls_Feed_Source;
	private Timestamp lts_Last_Date = null;
	
	
	
	
	
	public String getLs_Ccy_Cde() {
		return ls_Ccy_Cde;
	}
	public void setLs_Ccy_Cde(String ls_Ccy_Cde) {
		this.ls_Ccy_Cde = ls_Ccy_Cde;
	}
	public String getLs_Relvt_Ccy_Cde() {
		return ls_Relvt_Ccy_Cde;
	}
	public void setLs_Relvt_Ccy_Cde(String ls_Relvt_Ccy_Cde) {
		this.ls_Relvt_Ccy_Cde = ls_Relvt_Ccy_Cde;
	}
	public BigDecimal getLbd_Mid() {
		return lbd_Mid;
	}
	public void setLbd_Mid(BigDecimal lbd_Mid) {
		this.lbd_Mid = lbd_Mid;
	}
	public BigDecimal getLbd_Bid() {
		return lbd_Bid;
	}
	public void setLbd_Bid(BigDecimal lbd_Bid) {
		this.lbd_Bid = lbd_Bid;
	}
	public BigDecimal getLbd_Ask() {
		return lbd_Ask;
	}
	public void setLbd_Ask(BigDecimal lbd_Ask) {
		this.lbd_Ask = lbd_Ask;
	}
	public String getLs_Feed_Source() {
		return ls_Feed_Source;
	}
	public void setLs_Feed_Source(String ls_Feed_Source) {
		this.ls_Feed_Source = ls_Feed_Source;
	}
	public Timestamp getLts_Last_Date() {
		return lts_Last_Date;
	}
	public void setLts_Last_Date(Timestamp lts_Last_Date) {
		this.lts_Last_Date = lts_Last_Date;
	}
	
	
}
