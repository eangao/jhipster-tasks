package com.appsdeveloper.service.mapper;

import com.appsdeveloper.domain.Task;
import com.appsdeveloper.service.dto.TaskDTO;
import org.mapstruct.Mapper;

/**
 * Mapper for the entity {@link Task} and its DTO {@link TaskDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface TaskMapper extends EntityMapper<TaskDTO, Task> {}
