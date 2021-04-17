package ingjulianvega.ximic.msscasudisease.web.Mappers;


import ingjulianvega.ximic.msscasudisease.domain.DiseaseEntity;
import ingjulianvega.ximic.msscasudisease.web.model.DiseaseDto;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper(uses = DateMapper.class)
public interface DiseaseMapper {
    DiseaseDto diseaseEntityToDiseaseDto(DiseaseEntity diseaseEntity);

    DiseaseEntity diseaseDtoToDiseaseEntity(DiseaseDto diseaseDto);

    ArrayList<DiseaseDto> diseaseEntityListToDiseaseDtoList(List<DiseaseEntity> diseaseEntityList);
}
