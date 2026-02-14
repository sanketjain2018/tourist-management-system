package in.sj.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class TouristResponseDto {
	private Long id;
	private String fullName;
	private String fatherName;
	private String surname;
	private String city;
	private double budget;
	private LocalDate dateOfVisit;
}
