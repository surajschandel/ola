/**
 * 
 */
package com.ssc.ola.dto;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 * @author SURAJ CHANDEL
 *
 */
public class UserPerformanceResponse implements Serializable{
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int page;
    @SerializedName("per_page")
	private int perPage;
	private int total;
    @SerializedName("total_pages")
	private int totalPages;
	private List<User> data;
	/**
	 * @return the page
	 */
	public int getPage() {
		return page;
	}
	/**
	 * @param page the page to set
	 */
	public void setPage(int page) {
		this.page = page;
	}
	/**
	 * @return the perPage
	 */
	public int getPerPage() {
		return perPage;
	}
	/**
	 * @param perPage the perPage to set
	 */
	public void setPerPage(int perPage) {
		this.perPage = perPage;
	}
	/**
	 * @return the total
	 */
	public int getTotal() {
		return total;
	}
	/**
	 * @param total the total to set
	 */
	public void setTotal(int total) {
		this.total = total;
	}
	/**
	 * @return the totalPages
	 */
	public int getTotalPages() {
		return totalPages;
	}
	/**
	 * @param totalPages the totalPages to set
	 */
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	/**
	 * @return the data
	 */
	public List<User> getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(List<User> data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "UserPerformanceResponse [page=" + page + ", perPage=" + perPage + ", total=" + total + ", totalPages="
				+ totalPages + ", data=" + data + "]";
	}
	
	
	
}
