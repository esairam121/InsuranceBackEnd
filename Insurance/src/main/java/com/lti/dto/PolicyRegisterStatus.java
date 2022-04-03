package com.lti.dto;

public class PolicyRegisterStatus {
private boolean status;
private String messageIfAny;
private int registeredpolicyId;


public boolean isStatus() {
	return status;
}


public String getMessageIfAny() {
	return messageIfAny;
}


public void setMessageIfAny(String messageIfAny) {
	this.messageIfAny = messageIfAny;
}


public int getRegisteredPolicyId() {
	return registeredpolicyId;
}


public void setRegisteredPolicyId(int registeredpolicyId) {
	this.registeredpolicyId = registeredpolicyId;
}


public void setStatus(boolean status) {
	this.status = status;
}


}
