package com.projects.demospring.services;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SenhaUtils {

    /**
     * Gera um hash utilizando o BCrypt.
     *
     * @param password
     * @return String
     */
    public static String generateBCrypt(String password) {
        if (password == null) {
            return password;
        }
        BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
        return bCryptEncoder.encode(password);
    }

    /**
     * Verifica se a senha é válida.
     *
     * @param password
     * @param passwordEncoded
     * @return boolean
     */
    public static boolean validPassword(String password, String passwordEncoded) {
        BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
        return bCryptEncoder.matches(password, passwordEncoded);
    }

}
