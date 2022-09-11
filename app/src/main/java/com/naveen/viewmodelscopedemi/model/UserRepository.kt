package com.naveen.viewmodelscopedemi.model

import kotlinx.coroutines.delay

class UserRepository {

    suspend fun getUsers() : List<User>{
        delay(8000)
        val users : List<User> = listOf(
            User(1, "Naveen"),
            User(2, "Kumar"),
            User(3, "Booo"),
            User(4, "AndroidKutapa")
        )
        return users
    }
}