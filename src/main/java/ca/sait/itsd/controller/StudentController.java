package ca.sait.itsd.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ca.sait.itsd.exception.RecordNotFoundException;
import ca.sait.itsd.model.Students;
import ca.sait.itsd.service.StudentService;



@Controller
@RequestMapping("/")
public class StudentController {
	
	
	@Autowired
	StudentService service;
	
	
	
	@RequestMapping
	public String getAllStudent(Model model) 
	{	
		System.out.println("getAllStudent");
		
		List<Students> list = service.getAllStudent();

		model.addAttribute("student", list);
		
		return "list-student";
	}

	
	
	
	@RequestMapping(path = {"/edit", "/edit/{id}"})
	public String editStudentById(Model model, @PathVariable("id") Optional<Long> id) 
							throws RecordNotFoundException 
	{
		
		System.out.println("editStudentById" + id);
		if (id.isPresent()) {
			Students entity = service.getStudentById(id.get());
			model.addAttribute("student", entity);
		} else {
			model.addAttribute("student", new Students());
		}
		
		
		return "add-edit-student";
	}
	
	@RequestMapping(path = "/delete/{id}")
	public String deleteStudentById(Model model, @PathVariable("id") Long id) 
							throws RecordNotFoundException 
	{
		
		System.out.println("deleteStudentById" + id);
		
		service.deleteStudentById(id);
		return "redirect:/";
	}

	@RequestMapping(path = "/createStudent", method = RequestMethod.POST)
	public String createOrUpdateStudent (Students student) 
	{
		System.out.println("createOrUpdateStudent ");
		
		service.createOrUpdateStudent (student);
		
		return "redirect:/";
	}

}
