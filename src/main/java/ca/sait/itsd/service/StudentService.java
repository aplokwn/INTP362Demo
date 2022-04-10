package ca.sait.itsd.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.sait.itsd.exception.RecordNotFoundException;

import ca.sait.itsd.model.Students;
import ca.sait.itsd.model.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentData;
	
	
	
	public List<Students> getAllStudent()
	{
		System.out.println("getAllStudent");
		List<Students> result = (List<Students>) studentData.findAll();
		
		if(result.size() > 0) {
			return result;
		} else {
			return new ArrayList<Students>();
		}
	}
	
	
	public Students getStudentById(Long id) throws RecordNotFoundException 
	{
		System.out.println("getStudentById");
		Optional<Students> student = studentData.findById(id);
		
		if(student.isPresent()) {
			return student.get();
		} else {
			throw new RecordNotFoundException("No student record exist for given id");
		}
	}
	
	public Students createOrUpdateStudent(Students entity) 
	{
		System.out.println("createOrUpdateStudent");
		// Create new entry 
		if(entity.getId()  == null) 
		{
			entity = studentData.save(entity);
			
			return entity;
		} 
		else 
		{
			// update existing entry 
			Optional<Students> student = studentData.findById(entity.getId());
			
			if(student.isPresent()) 
			{
				Students newEntity = student.get();
				newEntity.setEmail(entity.getEmail());
				newEntity.setFirstName(entity.getFirstName());
				newEntity.setLastName(entity.getLastName());

				newEntity = studentData.save(newEntity);
				
				return newEntity;
			} else {
				entity = studentData.save(entity);
				
				return entity;
			}
		}
	} 
	
	public void deleteStudentById(Long id) throws RecordNotFoundException 
	{
		System.out.println("deleteStudentById");
		
		Optional<Students> student = studentData.findById(id);
		
		if(student.isPresent()) 
		{
			studentData.deleteById(id);
		} else {
			throw new RecordNotFoundException("No student record exist for given id");
		}
	} 

	

}
