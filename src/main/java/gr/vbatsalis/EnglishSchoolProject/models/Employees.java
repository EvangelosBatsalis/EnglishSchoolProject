package gr.vbatsalis.EnglishSchoolProject.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
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
    @NotEmpty(message = "First name cannot be empty")
    private String fName;

    @NotEmpty(message = "Last name cannot be empty")
    @Column(name = "employees_lname")
    private String lName;

    public Employees (String fName, String lName){
        this.fName = fName;
        this.lName = lName;
    }


}
