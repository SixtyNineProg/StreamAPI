package by.clevertec.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Animal {

    private int id;
    private String bread;
    private int age;
    private String origin;
    private String gender;
}
