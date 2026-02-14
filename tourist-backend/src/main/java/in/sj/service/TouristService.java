package in.sj.service;

import java.util.List;

import in.sj.dto.TouristRequestDto;
import in.sj.dto.TouristResponseDto;

public interface TouristService {

	TouristResponseDto register(TouristRequestDto dto);

	List<TouristResponseDto> getAll();

	TouristResponseDto getById(Long id);
}
