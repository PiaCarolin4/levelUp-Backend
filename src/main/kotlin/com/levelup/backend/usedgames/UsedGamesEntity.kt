package com.levelup.backend.usedgames

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import jakarta.persistence.Column

@Entity
@Table(name = "used_games")
data class UsedGameEntity(
    @Id
    val id: String,

    val title: String,
    val platform: String,
    val price: Double,
    val sellerUid: String,
    val photoUrl: String,
    val city: String,

    @Column(nullable = false)
    val createdAt: Long
)
