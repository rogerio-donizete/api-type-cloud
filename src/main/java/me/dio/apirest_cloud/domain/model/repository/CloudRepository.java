package me.dio.apirest_cloud.domain.model.repository;

import me.dio.apirest_cloud.domain.model.Cloud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CloudRepository extends JpaRepository<Cloud, Integer> {
    boolean existsByAcronym(String acronym);

}
