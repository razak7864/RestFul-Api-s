package com.spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.spring.Repository.Repository;
import com.spring.entity.Student;

@RestController
public class StudentController  {
	
	@Autowired
	Repository repo;
	
	@GetMapping("/students")
	//localhost:8081/students
	
	public List<Student> getStudents()
	{
		List<Student> stud=repo.findAll();
		return stud;
	}
	
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable  int id)
	{
		try
		{
		Student student = repo.findById(id).get();
		return student;
	}
		catch(Exception e)
		{
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
	
	}
	
	@PostMapping("students/add")
	@ResponseStatus(code=HttpStatus.CREATED)
	public Boolean createStudent(@RequestBody Student student)
	{
		repo.save(student);
		return true;
	}
	
	
	@PutMapping("/student/update/{id}")
	public Student updateStudent(@PathVariable int id,@RequestBody Student student)
	{
		
		try
		{
		Student update=repo.findById(id).get();
		
		if(student.getName()!=null)
		{
			update.setName(student.getName());
		}
		
		if(student.getBranch()!=null)
		{
			update.setBranch(student.getBranch());
		}
		
		if(student.getPercentage()!=0)
		{
			update.setPercentage(student.getPercentage());
		}
		
		repo.save(update);
		
		return update;
		}
		catch(Exception e)
		{
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}		
		}
	
	
	@PutMapping("/students/{id}")
	public boolean deleteStudent(@PathVariable int id)
	{
		repo.deleteById(id);
		return true;
	}
}
 