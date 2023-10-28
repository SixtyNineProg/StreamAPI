package by.clevertec.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    private int id;
    private String vin;
    private String carMake;
    private String carModel;
    private int releaseYear;
    private String color;

    /**
     * Kilograms
     */
    private int mass;

    /**
     * Dollars ($)
     */
    private int price;
}
