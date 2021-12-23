package kg.itmegaschool.crmitmega.model.dto;

import kg.itmegaschool.crmitmega.model.entity.Course;
import kg.itmegaschool.crmitmega.model.entity.Mentor;
import kg.itmegaschool.crmitmega.model.entity.Student;

import java.time.LocalTime;
import java.util.List;

public class GroupDto {
    String groupName;
    Course course;
    Mentor mentor;
    List<Student> students;
    LocalTime classTime;
}
