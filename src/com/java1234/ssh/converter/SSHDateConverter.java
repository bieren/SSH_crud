package com.java1234.ssh.converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

public class SSHDateConverter extends StrutsTypeConverter {

	private DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
	
	@Override
	public Object convertFromString(Map arg0, String[] args, Class arg2) {
		if(args!=null&&args.length==1){
			try {
				return dateFormat.parse(args[0]);
			} catch (ParseException e) {}
		}
		return null;
	}

	@Override
	public String convertToString(Map arg0, Object value) {
		if(value instanceof Date){
			Date date=(Date)value;
			return dateFormat.format(date);
		}
		return null;
	}

}
