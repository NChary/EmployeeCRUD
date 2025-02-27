package com.orgname.poc.service;

import java.util.List;

import com.orgname.poc.model.FacebookRegistration;

public interface FacebookRegisterService {
	
	public String register(FacebookRegistration facebookRegistration);
	
	public List<FacebookRegistration> getAll();

	public String updateDetails(FacebookRegistration facebookRegistration);
	
	public String deleteDetails(FacebookRegistration facebookRegistration);
}
