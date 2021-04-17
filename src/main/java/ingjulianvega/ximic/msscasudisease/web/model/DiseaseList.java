package ingjulianvega.ximic.msscasudisease.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DiseaseList implements Serializable {

    static final long serialVersionUID = -8780904245399201053L;

    public ArrayList<DiseaseDto> genderList;
}
