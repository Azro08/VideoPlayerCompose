package com.example.app.vidcompose.ui.screens.signup

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.app.vidcompose.room.entity.User
import com.example.app.vidcompose.room.repository.AuthRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SignUpViewModel @Inject constructor(
    private val authRepository: AuthRepository
) : ViewModel() {

    private val _signedUpUser = MutableStateFlow("")
    val signedUpUser: MutableStateFlow<String> = _signedUpUser

    fun signUp(username: String, password: String) {
        viewModelScope.launch {
            try {
                val signUp = authRepository.signUp(User(username = username, password = password))
                Log.d("SignedUp", signUp)
                _signedUpUser.value = signUp
            } catch (e: Exception) {
                Log.d("SignedUp", e.message.toString())
                _signedUpUser.value = e.message.toString()
            }
        }
    }

}