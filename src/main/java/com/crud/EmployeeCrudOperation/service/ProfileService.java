package com.crud.EmployeeCrudOperation.service;

import com.crud.EmployeeCrudOperation.entity.Employee_Profile;
import com.crud.EmployeeCrudOperation.repository.Document_Repository;
import com.crud.EmployeeCrudOperation.repository.Employee_Profile_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProfileService {

    @Autowired
    private Employee_Profile_Repository employee_profile_repository;


    public Employee_Profile saveProfile(Employee_Profile product){
        return  employee_profile_repository.save(product);
    }

    public List<Employee_Profile> saveProfiles(List<Employee_Profile> products){
        return  employee_profile_repository.saveAll(products);
    }
    public List<Employee_Profile> getProfiles(){
        return  employee_profile_repository.findAll();
    }
    public Employee_Profile getProfileById(int id){
        return  employee_profile_repository.findById(id).orElse(null);
    }
    /*
    public Product getProductsByName(String  name){
        return  productRepository.FindByName(name);
    }*/
    public  String deleteProfile(int id){
        employee_profile_repository.deleteById(id);
        return  "Product remove from id "+id;
    }


    public  Employee_Profile updateProduct(Employee_Profile product){
        Employee_Profile existing=employee_profile_repository.findById(product.getId()).orElse(null);
        existing.setEmployer_name(product.getEmployer_name());
        existing.setEmployer_salary(product.getEmployer_salary());
        return  employee_profile_repository.save(existing);
    }



}
