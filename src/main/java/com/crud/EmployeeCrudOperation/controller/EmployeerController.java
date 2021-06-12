package com.crud.EmployeeCrudOperation.controller;

import com.crud.EmployeeCrudOperation.entity.Employee_Profile;
import com.crud.EmployeeCrudOperation.repository.Document_Repository;
import com.crud.EmployeeCrudOperation.repository.Employee_Profile_Repository;
import com.crud.EmployeeCrudOperation.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeerController {

    @Autowired
    private ProfileService profileService;


    @PostMapping("/addProfile")
    public Employee_Profile addProduct(@RequestBody  Employee_Profile product){
        return  profileService.saveProfile(product);
    }
    @PostMapping("/addAllProfile")
    public List<Employee_Profile> addProducts(@RequestBody  List<Employee_Profile> products){
        return  profileService.saveProfiles(products);
    }

    @GetMapping("/getProfile")
    public  List<Employee_Profile> findAllProduct(){
        return  profileService.getProfiles();
    }

    @GetMapping("/getProfileById/{id}")
    public  Employee_Profile findAllProducts(@PathVariable int id){
        return  profileService.getProfileById(id);
    }
/*
    @GetMapping("/getProductsByName/{name}")
    public  Product findAllProducts(@PathVariable String  name){
        return  productService.getProductsByName(name);
    }*/

    @DeleteMapping("/deleteById/{id}")
    public  String deleteProduct(@PathVariable int id){
        profileService.deleteProfile(id);
        return "Product delete "+id; }


    @PutMapping("/update")
    public  Employee_Profile updateProduct(@RequestBody Employee_Profile product){
        return  profileService.updateProduct(product);
    }









}
