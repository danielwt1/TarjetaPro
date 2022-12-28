package com.ejemplo.tarjeta.tarjetapro.service;

import com.ejemplo.tarjeta.tarjetapro.models.dto.UserDTO;

import java.util.List;

public interface UserService {

    List<UserDTO> gettAllUsers();
    UserDTO findUserById(Integer idUsuario);
    UserDTO saveUser(UserDTO userDTO);
    UserDTO update (UserDTO userDTO);


}
