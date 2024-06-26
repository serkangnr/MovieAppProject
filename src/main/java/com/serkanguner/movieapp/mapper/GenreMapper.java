package com.serkanguner.movieapp.mapper;

import com.serkanguner.movieapp.dto.request.GenreSaveRequestDto;
import com.serkanguner.movieapp.dto.response.GenreFindAllResponseDto;
import com.serkanguner.movieapp.entity.Genre;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface GenreMapper {
    GenreMapper INSTANCE = Mappers.getMapper(GenreMapper.class);


    //@Mapping(source = "movie_id", target = "genre.movies.id")
    GenreFindAllResponseDto GenreToUserFindAllResponseDto(Genre genre);
    Genre dtoToGenre(GenreSaveRequestDto dto);

}
