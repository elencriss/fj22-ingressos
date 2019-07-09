package br.com.caelum.ingresso.converter;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

import org.springframework.core.convert.converter.Converter;

public class YearMonthConverter implements Converter<String, YearMonth> {

	@Override
	public YearMonth convert(String text) {
		System.out.println("Parsiando dados: " + text);
		return YearMonth.parse(text, DateTimeFormatter.ofPattern("MM/yyyy"));
	}

}
