package ru.skypro.homework.mapper;

import org.mapstruct.Mapper;
import ru.skypro.homework.dto.AdDTO;
import ru.skypro.homework.dto.CreateOrUpdateAdDTO;
import ru.skypro.homework.dto.ExtendedAdDTO;
import ru.skypro.homework.model.AdEntity;

@Mapper
public interface AdMapper {
    AdDTO adEntityToAdDTO(AdEntity adEntity);

    ExtendedAdDTO adEntityToExtendedAdDTO(AdEntity adEntity);

    AdEntity createOrUpdateAdDTOToAdEntity(CreateOrUpdateAdDTO createOrUpdateAdDTO);
}
