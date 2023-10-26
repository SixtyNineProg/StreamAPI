package by.clevertec.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExaminationEntity {

    private int id;
    private Student student;
    private int exam1;
    private int exam2;
    private int exam3;
}
