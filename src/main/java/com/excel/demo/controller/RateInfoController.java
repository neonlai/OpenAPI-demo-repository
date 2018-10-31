package com.excel.demo.controller;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.excel.demo.bean.RateInfo;

@RestController
@RequestMapping("/rateinfo")
public class RateInfoController {
	
	@RequestMapping("/index.html")
	public String index() {
		return "hello world";
	}
	
	@RequestMapping("infor")
	@ResponseBody
	public Object getRateInfo() {
		RateInfo l_RateInfo = new RateInfo();
		l_RateInfo.setLbd_Ask(new BigDecimal(7.7500 + Math.random()).setScale(8, BigDecimal.ROUND_HALF_UP));
		l_RateInfo.setLbd_Bid(new BigDecimal(7.7500 + Math.random()).setScale(8, BigDecimal.ROUND_HALF_UP));
		l_RateInfo.setLbd_Mid(new BigDecimal(7.7500 + Math.random()).setScale(8, BigDecimal.ROUND_HALF_UP));
		l_RateInfo.setLs_Ccy_Cde("USD");
		l_RateInfo.setLs_Relvt_Ccy_Cde("HKD");
		l_RateInfo.setLs_Feed_Source("BLOOMBERG");
		l_RateInfo.setLts_Last_Date(new Timestamp(new Date().getTime()));
		return l_RateInfo;
	}
}
