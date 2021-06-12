package com.crud.EmployeeCrudOperation.repository;

import com.crud.EmployeeCrudOperation.entity.Employee_Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Employee_Profile_Repository  extends JpaRepository<Employee_Profile,Integer> {



}
