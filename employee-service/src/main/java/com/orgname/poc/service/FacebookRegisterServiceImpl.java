package com.orgname.poc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.orgname.poc.model.FacebookRegistration;
import com.orgname.poc.repository.FacebookRegistrationRepository;

@Service
public class FacebookRegisterServiceImpl implements FacebookRegisterService{

	@Autowired
	private FacebookRegistrationRepository facebookRegistrationRepository;
	
	
	@Override
	public String register(FacebookRegistration facebookRegistration) {
		
		facebookRegistrationRepository.save(facebookRegistration);
		
		return "Registration is successfull";
	}


	@Override
	public List<FacebookRegistration> getAll() {
		return facebookRegistrationRepository.findAll();
	}


	@Override
	public String updateDetails(FacebookRegistration facebookRegistration) {
		
		facebookRegistrationRepository.save(facebookRegistration);
		
		return "Updated details sucessfully";
	}


	@Override
	public String deleteDetails(FacebookRegistration facebookRegistration) {
		
		facebookRegistrationRepository.delete(facebookRegistration);
		
		return "Record deleted successfully";
	}

}
