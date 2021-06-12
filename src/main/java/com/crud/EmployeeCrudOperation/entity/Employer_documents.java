package com.crud.EmployeeCrudOperation.entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString
public class Employer_documents {
@Id
@GeneratedValue
    private  int employer_id;
    private  String document_name;
    private  double document_size;
}
