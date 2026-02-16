package in.sj.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.sj.dto.TouristRequestDto;
import in.sj.dto.TouristResponseDto;
import in.sj.service.TouristService;

@RestController
@RequestMapping("/api/tourists")
public class TouristController {
	
	
	// 
	private final TouristService service;
	
	public TouristController(TouristService service) {
		this.service = service;
	}
	
	@PostMapping
	public TouristResponseDto create(@RequestBody TouristRequestDto dto) {
		System.out.println("create user ");
		return service.register(dto);
	}
	
	@GetMapping
	public List<TouristResponseDto> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public TouristResponseDto getById(@PathVariable Long id) {
		return service.getById(id);
				
	}
	
	
}
