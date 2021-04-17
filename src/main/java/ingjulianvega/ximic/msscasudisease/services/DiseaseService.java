package ingjulianvega.ximic.msscasudisease.services;


import ingjulianvega.ximic.msscasudisease.web.model.Disease;
import ingjulianvega.ximic.msscasudisease.web.model.DiseaseDto;
import ingjulianvega.ximic.msscasudisease.web.model.DiseaseList;

import java.util.UUID;

public interface DiseaseService {
    DiseaseList get();

    DiseaseDto getById(UUID id);

    void create(Disease gender);

    void updateById(UUID id, Disease gender);

    void deleteById(UUID id);
}
