package com.lj.converters;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

import org.springframework.core.convert.converter.Converter;




public class MyConverters implements Converter<String, Date>{

	@Override
	public Date convert(String arg0) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = getSimpleDateFormat(arg0);
		
		try {
			return sdf.parse(arg0);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	private SimpleDateFormat getSimpleDateFormat(String arg0) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat();
		
		if(Pattern.matches("^\\d{4}-\\d{2}-\\d{2}$", arg0)) {
			sdf=new SimpleDateFormat("yyyy-MM-dd");
		}else if(Pattern.matches("^\\d{4}/\\d{2}/\\d{2}$", arg0)) {
			sdf=new SimpleDateFormat("yyyy/MM/dd");
		}else if(Pattern.matches("^\\d{4}\\d{2}\\d{2}$", arg0)) {
			sdf=new SimpleDateFormat("yyyyMMdd");
		}
		
		return sdf;
	}

}
