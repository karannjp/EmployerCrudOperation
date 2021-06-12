package com.crud.EmployeeCrudOperation.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString
public class Employee_Profile {
@Id
@GeneratedValue
    private  int id;
private  String employer_name;
private  double employer_salary;

    @OneToMany(targetEntity = Employer_documents.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "cp_fk",referencedColumnName = "id")
    private List<Employer_documents> employer_documents;

}
