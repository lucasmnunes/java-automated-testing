package automated.testing.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document
@Data
public class Stock {

    @Id
    private String id;

    private String symbol;

    private BigDecimal price;

}
