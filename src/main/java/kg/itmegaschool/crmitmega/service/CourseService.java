package kg.itmegaschool.crmitmega.service;

import kg.itmegaschool.crmitmega.model.dto.CourseDto;
import kg.itmegaschool.crmitmega.model.request.CreateCourseRequest;
import kg.itmegaschool.crmitmega.model.request.GetCourseByCostRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseService {

    CourseDto create(CreateCourseRequest request);

    CourseDto find(Long id);

    CourseDto update(CourseDto courseDto);

    void delete(Long id);

    List<String> readAllCourseNames();

    List<CourseDto> readCoursesByMonthlyCostBetween(GetCourseByCostRequest request);
}