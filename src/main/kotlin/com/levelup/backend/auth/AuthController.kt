package com.levelup.backend.auth

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController



@RestController
@RequestMapping("/auth")
class AuthController(private val service: AuthService) {

    data class RegisterReq(val name: String, val email: String, val password: String)
    data class LoginReq(val email: String, val password: String)

    @PostMapping("/register")
    fun register(@RequestBody b: RegisterReq) =
        service.register(b.name, b.email, b.password)

    @PostMapping("/login")
    fun login(@RequestBody b: LoginReq) =
        service.login(b.email, b.password)
}
