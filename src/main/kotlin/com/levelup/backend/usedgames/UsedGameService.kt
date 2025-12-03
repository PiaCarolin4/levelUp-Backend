package com.levelup.backend.usedgames

import org.springframework.stereotype.Service

@Service
class UsedGameService(
    private val repo: UsedGameRepository
) {

    fun getAll(): List<UsedGameEntity> =
        repo.findAll()

    fun getById(id: String): UsedGameEntity =
        repo.findById(id).orElseThrow {
            IllegalArgumentException("Juego usado no encontrado")
        }

    fun getBySeller(sellerUid: String): List<UsedGameEntity> =
        repo.findBySellerUid(sellerUid)

    fun create(game: UsedGameEntity): UsedGameEntity =
        repo.save(game)

    fun delete(id: String) {
        if (!repo.existsById(id)) {
            throw IllegalArgumentException("Juego usado no existe")
        }
        repo.deleteById(id)
    }
}
