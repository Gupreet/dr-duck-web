package com.duckcreek.drduck.util;

import java.util.Arrays;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
@Component
public class CaseUtil {

	 	
		@Value("${cases.ws.rest.username}")
		static String userName;
		@Value("${cases.ws.rest.password}")
		static String password;
	   
		
		public static HttpHeaders getHeaders(MediaType mediaType) {
			
			
			String plainClientCredentials = userName + ":" + password;
			plainClientCredentials = "consumer" + ":" + "welcome@123";
			String base64ClientCredentials = new String(Base64.encodeBase64(plainClientCredentials.getBytes()));
			HttpHeaders headers = new HttpHeaders();
			headers.add("Authorization", "Basic " + base64ClientCredentials);
			headers.setAccept(Arrays.asList(new MediaType[] { mediaType }));
			headers.setContentType(mediaType);
			
			return headers;
		}
		
}
