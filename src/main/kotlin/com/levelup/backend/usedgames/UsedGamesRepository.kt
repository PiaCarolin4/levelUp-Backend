package com.levelup.backend.usedgames

import org.springframework.data.jpa.repository.JpaRepository

interface UsedGameRepository : JpaRepository<UsedGameEntity, String> {

    fun findBySellerUid(sellerUid: String): List<UsedGameEntity>
}
