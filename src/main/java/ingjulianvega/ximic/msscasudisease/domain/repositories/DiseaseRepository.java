package ingjulianvega.ximic.msscasudisease.domain.repositories;

import ingjulianvega.ximic.msscasudisease.domain.DiseaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import java.util.UUID;

public interface DiseaseRepository extends JpaRepository<DiseaseEntity, UUID>, JpaSpecificationExecutor<DiseaseEntity> {
    List<DiseaseEntity> findAllByOrderByName();
}
