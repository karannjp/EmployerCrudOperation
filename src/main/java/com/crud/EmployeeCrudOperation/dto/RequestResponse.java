package com.crud.EmployeeCrudOperation.dto;

import com.crud.EmployeeCrudOperation.entity.Employee_Profile;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RequestResponse {
private Employee_Profile employee_profile;
}
