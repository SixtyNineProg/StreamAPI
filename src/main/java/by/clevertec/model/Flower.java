package by.clevertec.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Flower {

    private int id;
    private String commonName;
    private String plantFamily;
    private double waterConsumptionPerDay;
    private boolean shadePreferred;
    private String origin;
    private int price;
    private List<String> flowerVaseMaterial;
}
