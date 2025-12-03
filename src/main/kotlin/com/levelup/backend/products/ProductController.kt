package com.levelup.backend.products

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/products")
class ProductController(private val service: ProductService) {

    @GetMapping
    fun getAll() = service.getAll()

    @GetMapping("/{id}")
    fun getById(@PathVariable id: String) = service.getById(id)

    @PostMapping
    fun create(@RequestBody body: ProductEntity) = service.save(body)

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: String) = service.delete(id)
}
