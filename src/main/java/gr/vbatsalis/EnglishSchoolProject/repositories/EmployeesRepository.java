package gr.vbatsalis.EnglishSchoolProject.repositories;

import gr.vbatsalis.EnglishSchoolProject.models.Employees;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesRepository extends CrudRepository<Employees, Integer> {

    Employees findAllById(Integer id);


}
