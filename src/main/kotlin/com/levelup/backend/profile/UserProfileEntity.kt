package com.levelup.backend.profile

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "user_profiles")
data class UserProfileEntity(
    @Id
    val uid: String,

    val name: String,
    val email: String,
    val photoUrl: String,
    val coverUrl: String,
    val totalSpent: Double
)
