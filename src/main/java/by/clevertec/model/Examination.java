package by.clevertec.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Examination {

    private int id;
    private int studentId;
    private int exam1;
    private int exam2;
    private int exam3;
}
