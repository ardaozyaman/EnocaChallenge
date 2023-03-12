package enoca.io.demo.business.responses.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllModelsResponse {
    private int id;
    private String name;
    private String brandName;
}
