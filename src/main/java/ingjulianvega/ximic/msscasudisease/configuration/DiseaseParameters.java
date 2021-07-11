package ingjulianvega.ximic.msscasudisease.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "disease")
public class DiseaseParameters {

    private String api;
}
