package ingjulianvega.ximic.msscasudisease.domain.repositories;

import ingjulianvega.ximic.msscasugender.domain.GenderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface DiseaseRepository extends JpaRepository<GenderEntity, UUID>, JpaSpecificationExecutor<GenderEntity> {
}
