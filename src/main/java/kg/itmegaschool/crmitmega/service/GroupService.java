package kg.itmegaschool.crmitmega.service;

import kg.itmegaschool.crmitmega.model.dto.GroupDto;
import kg.itmegaschool.crmitmega.model.request.CreateGroupRequest;

public interface GroupService {
    GroupDto find(Long id);
    GroupDto create(CreateGroupRequest request);
}
