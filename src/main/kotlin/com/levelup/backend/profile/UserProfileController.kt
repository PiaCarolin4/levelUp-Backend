package com.levelup.backend.profile

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/profiles")
class UserProfileController(
    private val service: UserProfileService
) {


    @GetMapping("/{uid}")
    fun getByUid(@PathVariable uid: String): UserProfileEntity? =
        service.getByUid(uid)


    @PostMapping
    fun createOrUpdate(@RequestBody body: UserProfileEntity): UserProfileEntity =
        service.createOrUpdate(body)

    @PostMapping("/{uid}/add-spent")
    fun addSpent(
        @PathVariable uid: String,
        @RequestParam amount: Double
    ): UserProfileEntity =
        service.addSpent(uid, amount)
}
