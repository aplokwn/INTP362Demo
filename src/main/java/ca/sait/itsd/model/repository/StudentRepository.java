package ca.sait.itsd.model.repository;

import org.springframework.data.repository.CrudRepository;

import ca.sait.itsd.model.Students;

public interface StudentRepository extends CrudRepository<Students, Long> {

}
