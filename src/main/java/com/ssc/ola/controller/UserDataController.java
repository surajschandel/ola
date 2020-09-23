/**
 * 
 */
package com.ssc.ola.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ssc.ola.services.UsersDataService;

/**
 * @author SURAJ CHANDEL
 *
 */
@RestController
public class UserDataController {


	private static final Logger LOG = LoggerFactory.getLogger(UserDataController.class);
	
	@Autowired
	UsersDataService dataService; 
	/**
	 * 
	 * @param threshold
	 * @return
	 */
	@GetMapping("/most-active-authors/{threshold}")
	public ResponseEntity<String[]> mostActiveAuthor(@PathVariable("threshold") int threshold){
		LOG.info("contoller threshold ="+threshold);		
		return dataService.getUsernames(threshold);		
	}
	
}
