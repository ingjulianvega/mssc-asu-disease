package ingjulianvega.ximic.msscasudisease.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DiseaseDto implements Serializable {

    static final long serialVersionUID = 8078307476392521382L;

    private UUID id;
    private String name;

}
