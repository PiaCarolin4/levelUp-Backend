package com.levelup.backend.usedgames

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/used-games")
class UsedGameController(
    private val service: UsedGameService
) {


    @GetMapping
    fun getAll(): List<UsedGameEntity> =
        service.getAll()

    @GetMapping("/{id}")
    fun getById(@PathVariable id: String): UsedGameEntity =
        service.getById(id)

    @GetMapping("/seller/{sellerUid}")
    fun getBySeller(@PathVariable sellerUid: String): List<UsedGameEntity> =
        service.getBySeller(sellerUid)

    @PostMapping
    fun create(@RequestBody body: UsedGameEntity): UsedGameEntity =
        service.create(body)

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: String) {
        service.delete(id)
    }
}
