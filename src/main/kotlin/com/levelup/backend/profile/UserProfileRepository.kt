package com.levelup.backend.profile

import org.springframework.data.jpa.repository.JpaRepository

interface UserProfileRepository : JpaRepository<UserProfileEntity, String>
