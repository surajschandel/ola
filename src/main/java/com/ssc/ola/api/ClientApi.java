/**
 * 
 */
package com.ssc.ola.api;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;



/**
 * @author SURAJ CHANDEL
 *
 */
@Component
public class ClientApi {

	private static final Logger LOG = LoggerFactory.getLogger(ClientApi.class);
	
	private final CloseableHttpClient httpClient = HttpClients.createDefault();

	
	public String sendGet(int page) throws Exception {
		LOG.info("page="+page);
        HttpGet request = new HttpGet("https://jsonmock.hackerrank.com/api/article_users/search?page="+page);

        String result="";
        try (CloseableHttpResponse response = httpClient.execute(request)) {
            System.out.println(response.getStatusLine().toString());
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                 result = EntityUtils.toString(entity);
            }

        }
        return result;
    }
}
