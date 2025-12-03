package com.levelup.backend.products

import jakarta.persistence.*

@Entity
@Table(name = "products")
data class ProductEntity(
    @Id
    val id: String,
    val title: String,
    val platform: String,
    val price: Double,
    val imageUrl: String,
    val isNew: Boolean,

    //JPA
    @ElementCollection
    val tags: List<String> = emptyList(),

    @Column(columnDefinition = "TEXT")
    val description: String
)
