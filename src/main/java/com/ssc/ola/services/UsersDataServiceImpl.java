/**
 * 
 */
package com.ssc.ola.services;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.ssc.ola.api.ClientApi;
import com.ssc.ola.dto.User;
import com.ssc.ola.dto.UserPerformanceResponse;

/**
 * @author SURAJ CHANDEL
 *
 */
@Service
public class UsersDataServiceImpl implements UsersDataService {


	private static final Logger LOG = LoggerFactory.getLogger(UsersDataServiceImpl.class);
	@Autowired
	ClientApi clientApi;
	
	/**
	 * @param threshold
	 * @return
	 */
	@Override
	public ResponseEntity<String[]> getUsernames(int threshold) {
		// TODO Auto-generated method stub
		LOG.info("requested threshold="+threshold);
		List<User> users=new ArrayList<User>();
		String[] userNames=new String[10];
		try {
			int page=1;
			UserPerformanceResponse performanceResponse=null;
			do {
				String result= clientApi.sendGet(page);
				if(result!=null) {
					LOG.info("performanceString: {}",result);
					performanceResponse= parseResponse(result);	
					LOG.info("performanceResponse: {}",performanceResponse);
					if(performanceResponse.getData()!=null) {
						users.addAll(performanceResponse.getData());
					}
				}	
				page++;
			} while (page<=performanceResponse.getTotalPages());
			
			userNames= getData(users, threshold);
			
		} catch (Exception e) {
			// TODO: handle exception
			LOG.error("Some server error :{}",e);
		}
		return ResponseEntity.ok().body(userNames);
	}
	
	/**
	 * 
	 * @param result
	 * @return
	 */
	private UserPerformanceResponse parseResponse(String result) {
		UserPerformanceResponse performanceResponse=new UserPerformanceResponse();
		performanceResponse= new Gson().fromJson(result, UserPerformanceResponse.class);
		return performanceResponse;
		
	}
	/**
	 * 
	 * @param users
	 * @param threshold
	 * @return
	 */
	private String[] getData(List<User> users, int threshold) {
		String[] userNames= new String[10];
		int i=0;
		for (User user : users) {
			if(user.getSubmissionCount()>10) {
				userNames[i]=user.getUsername();
				i++;
			}
			if(i>=10) {
				break;
			}
		}
		
		return userNames;
	}
	

}
