package com.lti.dto;

public class VehicalRegisterStatus {
private boolean status;
private String messageIfAny;
private String registeredvehicalId;
public boolean isStatus() {
	return status;
}
public void setStatus(boolean status) {
	this.status = status;
}
public String getMessageIfAny() {
	return messageIfAny;
}
public void setMessageIfAny(String messageIfAny) {
	this.messageIfAny = messageIfAny;
}
public String getRegisteredvehicalId() {
	return registeredvehicalId;
}
public void setRegisteredvehicalId(String registeredvehicalId) {
	this.registeredvehicalId = registeredvehicalId;
}



}
