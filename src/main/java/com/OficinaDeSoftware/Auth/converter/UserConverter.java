package com.OficinaDeSoftware.Auth.converter;

import java.util.Objects;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.OficinaDeSoftware.Auth.domain.User;
import com.OficinaDeSoftware.Auth.dto.UserDto;
import com.OficinaDeSoftware.Auth.model.ProviderModel;

@Component
public class UserConverter {

  private final ModelMapper modelMapper;

  public UserConverter(ModelMapper modelMapper) {
    this.modelMapper = modelMapper;
  }

  public UserDto convertToDto( final ProviderModel provider ){

    return Objects.isNull(provider) ? null : modelMapper.map( provider, UserDto.class );
    
  }

  public UserDto convertToDto( final User user ) {

    return Objects.isNull(user) ? null : modelMapper.map( user, UserDto.class );

  } 

  public User convertToEntity( final UserDto dto ) {

    return Objects.isNull(dto) ? null : modelMapper.map( dto, User.class );
    
  }

}