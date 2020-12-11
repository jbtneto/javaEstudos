package br.neto.spring02.dto;

import br.neto.spring02.model.User;
import lombok.Getter;
import lombok.Setter;

// DTO - Data Transfer Object
@Getter @Setter
public class UserDto {
    private String name;
    private String email;
    private String cpf;

    public UserDto(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.cpf = user.getCpf();
    }

   
    
    
}