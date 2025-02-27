package com.orgname.poc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orgname.poc.model.FacebookRegistration;

@Repository
public interface FacebookRegistrationRepository extends JpaRepository<FacebookRegistration, Integer>{

}
