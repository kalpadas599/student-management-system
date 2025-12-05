package com.smskd.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smskd.sms.entity.Student;

public interface StudentRepository extends JpaRepository <Student, Long>{
	
}
