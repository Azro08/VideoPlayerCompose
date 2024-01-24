package com.example.app.vidcompose.ui.screens.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.app.vidcompose.room.entity.User
import com.example.app.vidcompose.room.repository.AuthRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val authRepository: AuthRepository
) : ViewModel() {

    private val _loggedInUser = MutableStateFlow<User?>(null)
    val loggedInUser: MutableStateFlow<User?> = _loggedInUser

    fun login(username: String, password: String) {
        viewModelScope.launch {
            val user = authRepository.login(username, password)
            _loggedInUser.value = user
        }
    }

}
