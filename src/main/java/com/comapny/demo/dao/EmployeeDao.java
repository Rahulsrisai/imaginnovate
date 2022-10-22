package com.comapny.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comapny.demo.model.EmployeeModel;

@Repository
public interface EmployeeDao extends JpaRepository<EmployeeModel,Integer > {

}
