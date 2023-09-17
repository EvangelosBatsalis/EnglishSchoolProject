package gr.vbatsalis.EnglishSchoolProject.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Lombok annotations (Getter, Setters,...)
@Data
@AllArgsConstructor
@NoArgsConstructor

//JDBC annotations
@Entity
public class Employees {

    @Id
    @Column(name = "employees_id")
    private int id;

    @Column(name = "employees_fname")
    private String fName;

    @Column(name = "employees_lname")
    private String lName;


}
