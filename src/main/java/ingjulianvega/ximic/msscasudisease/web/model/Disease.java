package ingjulianvega.ximic.msscasudisease.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Disease implements Serializable {

    static final long serialVersionUID = 9198883824898848986L;

    private String name;

}
