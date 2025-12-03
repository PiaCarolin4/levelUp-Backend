package com.levelup.backend.profile

import org.springframework.stereotype.Service

@Service
class UserProfileService(
    private val repo: UserProfileRepository
) {

    fun getByUid(uid: String): UserProfileEntity? =
        repo.findById(uid).orElse(null)

    fun createOrUpdate(profile: UserProfileEntity): UserProfileEntity =
        repo.save(profile)

    fun addSpent(uid: String, amount: Double): UserProfileEntity {
        val current = repo.findById(uid).orElseThrow {
            IllegalArgumentException("Perfil no encontrado")
        }

        val updated = current.copy(
            totalSpent = current.totalSpent + amount
        )

        return repo.save(updated)
    }
}
