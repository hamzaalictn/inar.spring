package com.inar.web.services;

import com.inar.web.dto.UserDTO;
import com.inar.web.entities.User;
import com.inar.web.exceptions.UserNotFoundException;
import com.inar.web.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
  @Autowired private UserRepository userRepository;

  public UserDTO getUserById(Long id) {
    User user =
        userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("User not found"));
    return new UserDTO(user.getId(), user.getName(), user.getEmail());
  }
}
