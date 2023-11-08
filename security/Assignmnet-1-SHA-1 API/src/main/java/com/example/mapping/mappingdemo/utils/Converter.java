package com.example.mapping.mappingdemo.utils;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

public class Converter {
    private static final ModelMapper modelMapper;

    static {
        modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
    }

    public static <DTO, Entity> Entity convertToEntity(DTO dto, Class<Entity> entityClass) {
        return modelMapper.map(dto, entityClass);
    }

    public static <DTO, Entity> DTO convertToDTO(Entity entity, Class<DTO> dtoClass) {
        return modelMapper.map(entity, dtoClass);
    }
}
