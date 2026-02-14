package in.sj.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import in.sj.dto.TouristRequestDto;
import in.sj.dto.TouristResponseDto;
import in.sj.entity.Tourist;
import in.sj.repository.TouristRepository;
import in.sj.service.TouristService;

@Service
public class TouristServiceImpl implements TouristService {

	private final TouristRepository repo;

	public TouristServiceImpl(TouristRepository repo) {
		this.repo = repo;
	}

	@Override
	public TouristResponseDto register(TouristRequestDto dto) {

		Tourist t = new Tourist();
		t.setFullName(dto.getFullName());
		t.setFatherName(dto.getFatherName());
		t.setSurname(dto.getSurname());
		t.setCity(dto.getCity());
		t.setBudget(dto.getBudget());
		t.setDateOfVisit(dto.getDateOfVisit());

		Tourist saved = repo.save(t);

		return toResponse(saved);
	}

	@Override
	public List<TouristResponseDto> getAll() {

		return repo.findAll().stream().map(this::toResponse).collect(Collectors.toList());
	}

	@Override
	public TouristResponseDto getById(Long id) {
		Tourist t = repo.findById(id).orElseThrow(() -> new RuntimeException("Tourist Not Found"));
		return toResponse(t);
	}

	private TouristResponseDto toResponse(Tourist t) {
		TouristResponseDto r = new TouristResponseDto();
		r.setId(t.getId());
		r.setFullName(t.getFullName());
		r.setFatherName(t.getFatherName());
		r.setSurname(t.getSurname());
		r.setCity(t.getCity());
		r.setBudget(t.getBudget());
		r.setDateOfVisit(t.getDateOfVisit());
		return r;
	}

}
