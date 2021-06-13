package ingjulianvega.ximic.msscasudisease.web.controller;


import ingjulianvega.ximic.msscasudisease.services.DiseaseService;
import ingjulianvega.ximic.msscasudisease.web.model.Disease;
import ingjulianvega.ximic.msscasudisease.web.model.DiseaseDto;
import ingjulianvega.ximic.msscasudisease.web.model.DiseaseList;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class DiseaseController implements DiseaseI {

    private final DiseaseService diseaseService;

    @Override
    public ResponseEntity<DiseaseList> get(Boolean usingCache) {
        return new ResponseEntity<>(diseaseService.get(usingCache), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<DiseaseDto> getById(@NotNull UUID id) {
        return new ResponseEntity<>(diseaseService.getById(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> create(@NotNull @Valid Disease disease) {
        diseaseService.create(disease);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Void> updateById(@NotNull UUID id, @NotNull @Valid Disease disease) {
        diseaseService.updateById(id, disease);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @Override
    public ResponseEntity<Void> deleteById(@NotNull UUID id) {
        diseaseService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
