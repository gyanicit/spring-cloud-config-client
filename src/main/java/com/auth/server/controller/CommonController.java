package com.auth.server.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {
	
	@Value("${portal.jdbc.url}")
	String url;
	@Value("${portal.jdbc.user}")
	String userName;
	@Value("${portal.jdbc.password}")
	String password;
	
	@RequestMapping(value="/getProperty", method=RequestMethod.GET)
	public String displayProperty() {
		Map<String,String> m=new HashMap<String,String>();
		m.put("url", url);
		m.put("userName", userName);
		m.put("password", password);
		return m.toString();
	}

}
