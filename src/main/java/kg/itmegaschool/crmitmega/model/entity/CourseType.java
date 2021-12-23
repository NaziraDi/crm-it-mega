package kg.itmegaschool.crmitmega.model.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalTime;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_course_type")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CourseType extends BaseEntity {

    @Column(name = "type_name", nullable = false, unique = true)
    String typeName;

    @Column(name = "classes_per_month", nullable = false)
    Integer classesPerMonth;

    @Column(name = "duration_in_month", nullable = false)
    Integer durationInMonth;

    @Column(name = "duration_of_one_lesson", nullable = false)
    LocalTime durationOfOneLesson;
}
