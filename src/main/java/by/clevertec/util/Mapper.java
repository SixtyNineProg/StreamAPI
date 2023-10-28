package by.clevertec.util;

import by.clevertec.model.Examination;
import by.clevertec.model.ExaminationEntity;
import by.clevertec.model.Student;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Mapper {
    public static ExaminationEntity mapExaminationsStudentsToExaminationEntity(
            Examination examination, List<Student> students) {
        return ExaminationEntity.builder()
                .id(examination.getId())
                .student(
                        students.stream()
                                .filter(student -> student.getId() == examination.getId())
                                .findAny()
                                .orElse(Student.builder().build()))
                .exam1(examination.getExam1())
                .exam2(examination.getExam2())
                .exam3(examination.getExam3())
                .build();
    }
}
