package com.crud.EmployeeCrudOperation.service;

import com.crud.EmployeeCrudOperation.entity.Employee_Profile;
import com.crud.EmployeeCrudOperation.entity.Employer_documents;
import com.crud.EmployeeCrudOperation.repository.Document_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentService {

    @Autowired
    private Document_Repository document_repository;

    public Employer_documents saveDocument(Employer_documents product){
        return  document_repository.save(product);
    }

    public List<Employer_documents> saveDocuments(List<Employer_documents> products){
        return  document_repository.saveAll(products);
    }
    public List<Employer_documents> getDocument(){
        return  document_repository.findAll();
    }
    public Employer_documents getProductsById(int id){
        return  document_repository.findById(id).orElse(null);
    }
    /*
    public Product getProductsByName(String  name){
        return  productRepository.FindByName(name);
    }*/
    public  String deleteProduct(int id){
        document_repository.deleteById(id);
        return  "Product remove from id "+id;
    }


    public  Employer_documents updateProduct(Employer_documents product){
        Employer_documents existing=document_repository.findById(product.getEmployer_id()).orElse(null);
        existing.setDocument_name(product.getDocument_name());
        existing.setDocument_size(product.getDocument_size());
        return  document_repository.save(existing);
    }





}
