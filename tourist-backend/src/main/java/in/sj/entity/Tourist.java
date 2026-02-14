package in.sj.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Data
@Table(name="tbl_tourist")
public class Tourist {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	private String fullName;
	private String fatherName;
	private String surname;
	
	@Column(nullable = false)
	private String city;
	
	private double budget;
	
	private LocalDate dateOfVisit;
	
	
	
	
	
	
	
	
	
	
}
