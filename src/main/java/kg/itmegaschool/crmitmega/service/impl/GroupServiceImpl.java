package kg.itmegaschool.crmitmega.service.impl;

import kg.itmegaschool.crmitmega.exceptions.GroupNotFoundException;
import kg.itmegaschool.crmitmega.mapper.CourseMapper;
import kg.itmegaschool.crmitmega.mapper.GroupMapper;
import kg.itmegaschool.crmitmega.mapper.MentorMapper;
import kg.itmegaschool.crmitmega.model.dto.CourseDto;
import kg.itmegaschool.crmitmega.model.dto.GroupDto;
import kg.itmegaschool.crmitmega.model.dto.MentorDto;
import kg.itmegaschool.crmitmega.model.entity.Group;
import kg.itmegaschool.crmitmega.model.request.CreateGroupRequest;
import kg.itmegaschool.crmitmega.repository.GroupRepository;
import kg.itmegaschool.crmitmega.repository.MentorRepository;
import kg.itmegaschool.crmitmega.service.CourseService;
import kg.itmegaschool.crmitmega.service.GroupService;
import kg.itmegaschool.crmitmega.service.MentorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GroupServiceImpl implements GroupService {

    private final GroupRepository groupRepository;

    private MentorService mentorService;
    private CourseService courseService;

    @Override
    public GroupDto find(Long id) {
        return GroupMapper.INSTANCE
                .toDto(groupRepository.findById(id)
                        .orElseThrow(() -> new GroupNotFoundException("Group with id=" + id + " not found.")));
    }

    @Override
    public GroupDto create(CreateGroupRequest request) {
        MentorDto mentorDto = mentorService.find(request.getMentorId());
        CourseDto courseDto = courseService.find(request.getCourseId());
        Group group = Group
                .builder()
                .groupName(request.getGroupName())
                .mentor(MentorMapper.INSTANCE.toEntity(mentorDto))
                .course(CourseMapper.INSTANCE.toEntity(courseDto))
                .build();
        groupRepository.save(group);

        return GroupMapper.INSTANCE.toDto(group);
    }
}