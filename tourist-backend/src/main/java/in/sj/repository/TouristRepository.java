package in.sj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sj.entity.Tourist;

public interface TouristRepository extends JpaRepository<Tourist, Long> {

}
