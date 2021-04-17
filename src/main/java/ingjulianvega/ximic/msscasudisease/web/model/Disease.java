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

    static final long serialVersionUID = -7309482740220635006L;

    private String name;

}
