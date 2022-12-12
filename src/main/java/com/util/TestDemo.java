package com.util;

import org.testng.annotations.Test;

public class TestDemo {

	public static void main(String[] args) {
		
		
			// config ---url
			String saveUrl = PropertyReader.getConfigProperty("url");
			System.out.println("url  --->" + saveUrl);

		
		
		
	}

}
