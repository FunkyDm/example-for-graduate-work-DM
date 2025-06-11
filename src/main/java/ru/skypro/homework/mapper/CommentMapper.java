package ru.skypro.homework.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import ru.skypro.homework.dto.CommentDTO;
import ru.skypro.homework.dto.CreateOrUpdateCommentDTO;
import ru.skypro.homework.model.CommentEntity;

@Mapper
public interface CommentMapper {
    CommentDTO commentEntityToCommentDTO(CommentEntity commentEntity);

    @Mappings(value = {
            @Mapping(target = "author", ignore = true),
            @Mapping(target = "authorImage", ignore = true),
            @Mapping(target = "authorFirstName", ignore = true),
            @Mapping(target = "createdAt", ignore = true),
            @Mapping(target = "pk", ignore = true),
    })
    CommentEntity createOrUpdateCommentDTOToCommentEntity(CreateOrUpdateCommentDTO createOrUpdateCommentDTO);
}
