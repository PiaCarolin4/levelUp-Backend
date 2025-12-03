package com.levelup.backend.products

import org.springframework.stereotype.Service

@Service
class ProductService(private val repo: ProductRepository) {

    fun getAll(): List<ProductEntity> = repo.findAll()

    fun getById(id: String): ProductEntity =
        repo.findById(id).orElseThrow { IllegalArgumentException("Producto no encontrado") }

    fun save(product: ProductEntity): ProductEntity =
        repo.save(product)

    fun delete(id: String) {
        if (!repo.existsById(id)) {
            throw IllegalArgumentException("Producto no existe")
        }
        repo.deleteById(id)
    }
}
