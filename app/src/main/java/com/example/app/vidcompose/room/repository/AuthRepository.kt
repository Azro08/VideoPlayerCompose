package com.example.app.vidcompose.room.repository

import android.util.Log
import com.example.app.vidcompose.room.dao.AuthDao
import com.example.app.vidcompose.room.entity.User
import javax.inject.Inject

class AuthRepository @Inject constructor(
    private val dao: AuthDao
) {

    suspend fun login(username: String, password: String): User? =
        dao.login(username, password)

    suspend fun signUp(user: User) : String {
        return try {
            dao.signUp(user)
            "Done"
        } catch (e : Exception){
            Log.d("SignedUp", e.message.toString())
            e.message.toString()
        }
    }

}