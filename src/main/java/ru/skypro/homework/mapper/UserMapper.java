package ru.skypro.homework.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.skypro.homework.dto.UserDTO;
import ru.skypro.homework.model.UserEntity;

@Mapper
public interface UserMapper {
    @Mapping(source = "")
    UserDTO userEntityToUserDTO(UserEntity userEntity);
}
