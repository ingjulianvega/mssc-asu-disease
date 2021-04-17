package ingjulianvega.ximic.msscasudisease.bootstrap;

import ingjulianvega.ximic.msscasudisease.domain.DiseaseEntity;
import ingjulianvega.ximic.msscasudisease.domain.repositories.DiseaseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@RequiredArgsConstructor
@Component
public class DiseaseLoader implements CommandLineRunner {

    private final DiseaseRepository diseaseRepository;

    @Override
    public void run(String... args) throws Exception {
        if (diseaseRepository.count() == 0) {
            loadDiseaseObjects();
        }
    }

    private void loadDiseaseObjects() {
        diseaseRepository.saveAll(Arrays.asList(
                DiseaseEntity.builder().name("Acidez de estómago").build(),
                DiseaseEntity.builder().name("Alergia").build(),
                DiseaseEntity.builder().name("Bronquitis").build(),
                DiseaseEntity.builder().name("Bradicardia").build(),
                DiseaseEntity.builder().name("Cáncer de colon").build(),
                DiseaseEntity.builder().name("Cáncer de estómago").build(),
                DiseaseEntity.builder().name("Dengue").build(),
                DiseaseEntity.builder().name("Dermatitis atópica").build(),
                DiseaseEntity.builder().name("Encefalitis").build(),
                DiseaseEntity.builder().name("Edema Pulmonar").build(),
                DiseaseEntity.builder().name("Otro").build()
        ));
    }
}