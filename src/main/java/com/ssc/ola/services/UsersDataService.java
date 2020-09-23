/**
 * 
 */
package com.ssc.ola.services;


import org.springframework.http.ResponseEntity;

/**
 * @author SURAJ CHANDEL
 *
 */
public interface UsersDataService {

	/**
	 * 
	 * @param threshold
	 * @return
	 */
	public ResponseEntity<String[]> getUsernames(int threshold);
}
