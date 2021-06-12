package com.crud.EmployeeCrudOperation.repository;

import com.crud.EmployeeCrudOperation.entity.Employee_Profile;
import com.crud.EmployeeCrudOperation.entity.Employer_documents;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Document_Repository  extends JpaRepository<Employer_documents,Integer> {
}
