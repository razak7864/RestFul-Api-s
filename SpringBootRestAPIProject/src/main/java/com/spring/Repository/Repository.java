package com.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.Student;

public interface Repository extends JpaRepository<Student/*class_name*/, Integer/*primaryKey_type*/>
{

}
