package com.muhammet.repository;

import com.muhammet.entity.Department;
import com.muhammet.utility.Repository;

public class DepartmentRepository extends Repository<Department,Long> {
    public DepartmentRepository(){
        super(new Department());
    }
}
