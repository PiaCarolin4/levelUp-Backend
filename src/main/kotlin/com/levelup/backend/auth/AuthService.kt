package com.levelup.backend.auth

import org.springframework.stereotype.Service

@Service
class AuthService(private val repo: UserRepository) {

    fun register(name: String, email: String, password: String): UserEntity {

        if (repo.findByEmail(email) != null) {
            throw IllegalArgumentException("Email ya registrado")
        }
        val user = UserEntity(
            id = null,
            email = email,
            password = password,
            name = name
        )
        return repo.save(user)
    }

    fun login(email: String, password: String): UserEntity {
        val user = repo.findByEmail(email)
            ?: throw IllegalArgumentException("Usuario no encontrado")

        if (user.password != password) {
            throw IllegalArgumentException("Contraseña incorrecta")
        }
        return user
    }
}
