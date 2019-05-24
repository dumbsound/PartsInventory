package com.project.model;

public class Parts {
	
	private String dateReceived;
	private String productName;
	private String serialNos;
	private String sku;
	
	public Parts(){
		
	}
	
	
	public Parts(String dateReceived, String productName, String serialNos, String sku) {
		this.dateReceived = dateReceived;
		this.productName = productName;
		this.serialNos = serialNos;
		this.sku = sku;
	}

	public String getDateReceived() {
		return dateReceived;
	}


	public void setDateReceived(String dateReceived) {
		this.dateReceived = dateReceived;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getSerialNos() {
		return serialNos;
	}


	public void setSerialNos(String serialNos) {
		this.serialNos = serialNos;
	}


	public String getSku() {
		return sku;
	}


	public void setSku(String sku) {
		this.sku = sku;
	}


	@Override
	public String toString() {
		return "Parts [dateReceived=" + dateReceived + ", productName=" + productName + ", serialNos=" + serialNos
				+ ", sku=" + sku + "]";
	}
	
	
	
	
	

}


