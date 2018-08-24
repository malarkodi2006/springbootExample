package com.malar.orderprocessing.exception;

public class OrderNotFoundException extends Exception {
private String errorMessgae;

public OrderNotFoundException(String errorMessgae) {
	this.errorMessgae = errorMessgae;
}

public String getErrorMessgae() {
	return errorMessgae;
}

public void setErrorMessgae(String errorMessgae) {
	this.errorMessgae = errorMessgae;
}



}
