package com.excel.demo.utils;

import java.math.BigDecimal;

import org.bson.types.Decimal128;
import org.springframework.core.convert.converter.Converter;

public class BigDecimalToDecimal128Converter implements Converter<BigDecimal, Decimal128> {

	@Override
	public Decimal128 convert(BigDecimal a_BigDecimal) {
		return new Decimal128(a_BigDecimal);
	}

}
