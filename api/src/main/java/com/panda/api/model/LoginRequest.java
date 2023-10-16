package com.panda.api.model;

import lombok.Data;

@Data
public class LoginRequest {
    private String nomeUsuario;
    private String email;
    private String senha;
}
