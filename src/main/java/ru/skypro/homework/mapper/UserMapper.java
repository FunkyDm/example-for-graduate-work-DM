package ru.skypro.homework.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import ru.skypro.homework.dto.RegisterDTO;
import ru.skypro.homework.dto.UpdateUserDTO;
import ru.skypro.homework.dto.UserDTO;
import ru.skypro.homework.model.UserEntity;

@Mapper
public interface UserMapper {
    UserDTO userEntityToUserDTO(UserEntity userEntity);

    @Mappings(value = {
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "email", source = "username"),
            @Mapping(target = "image", ignore = true)
    })
    UserEntity registerDTOToUserEntity(RegisterDTO registerDTO);

    @Mappings(value = {
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "email", source = "username"),
            @Mapping(target = "role", ignore = true),
            @Mapping(target = "image", ignore = true)
    })
    UserEntity updateUserDTOToUserEntity(UpdateUserDTO updateUserDTO);
}
