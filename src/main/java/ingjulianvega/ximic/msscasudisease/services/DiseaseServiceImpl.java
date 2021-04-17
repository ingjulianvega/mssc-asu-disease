package ingjulianvega.ximic.msscasudisease.services;


import ingjulianvega.ximic.msscasudisease.configuration.ErrorCodeMessages;
import ingjulianvega.ximic.msscasudisease.domain.DiseaseEntity;
import ingjulianvega.ximic.msscasudisease.domain.repositories.DiseaseRepository;
import ingjulianvega.ximic.msscasudisease.exception.DiseaseException;
import ingjulianvega.ximic.msscasudisease.web.Mappers.DiseaseMapper;
import ingjulianvega.ximic.msscasudisease.web.model.Disease;
import ingjulianvega.ximic.msscasudisease.web.model.DiseaseDto;
import ingjulianvega.ximic.msscasudisease.web.model.DiseaseList;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@RequiredArgsConstructor
@Slf4j
@Service
public class DiseaseServiceImpl implements DiseaseService {

    private final DiseaseRepository diseaseRepository;
    private final DiseaseMapper diseaseMapper;

    @Cacheable(cacheNames = "diseaseListCache")
    @Override
    public DiseaseList get() {
        log.debug("get()...");
        return DiseaseList
                .builder()
                .genderList(diseaseMapper.diseaseEntityListToDiseaseDtoList(diseaseRepository.findAll()))
                .build();
    }

    @Cacheable(cacheNames = "diseaseCache")
    @Override
    public DiseaseDto getById(UUID id) {
        log.debug("getById()...");
        return diseaseMapper.diseaseEntityToDiseaseDto(
                diseaseRepository.findById(id).orElseThrow(() -> new DiseaseException(ErrorCodeMessages.DISEASE_NOT_FOUND, "")));
    }

    @Override
    public void create(Disease disease) {
        log.debug("create()...");
        diseaseMapper.diseaseEntityToDiseaseDto(
                diseaseRepository.save(
                        diseaseMapper.diseaseDtoToDiseaseEntity(
                                DiseaseDto
                                        .builder()
                                        .name(disease.getName()).
                                        build())));
    }

    @Override
    public void updateById(UUID id, Disease disease) {
        log.debug("updateById...");
        DiseaseEntity genderEntity = diseaseRepository.findById(id).orElseThrow(() -> new DiseaseException(ErrorCodeMessages.DISEASE_NOT_FOUND, ""));
        genderEntity.setName(disease.getName());

        diseaseRepository.save(genderEntity);
    }

    @Override
    public void deleteById(UUID id) {
        log.debug("deleteById...");
        diseaseRepository.deleteById(id);
    }
}
