package com.example.app.vidcompose.ui.screens.login;

import androidx.lifecycle.ViewModel;
import com.example.app.vidcompose.room.entity.User;
import com.example.app.vidcompose.room.repository.AuthRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eR\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0010"}, d2 = {"Lcom/example/app/vidcompose/ui/screens/login/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "authRepository", "Lcom/example/app/vidcompose/room/repository/AuthRepository;", "(Lcom/example/app/vidcompose/room/repository/AuthRepository;)V", "_loggedInUser", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/app/vidcompose/room/entity/User;", "loggedInUser", "getLoggedInUser", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "login", "", "username", "", "password", "app_debug"})
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.app.vidcompose.room.repository.AuthRepository authRepository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.app.vidcompose.room.entity.User> _loggedInUser = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.app.vidcompose.room.entity.User> loggedInUser = null;
    
    @javax.inject.Inject
    public LoginViewModel(@org.jetbrains.annotations.NotNull
    com.example.app.vidcompose.room.repository.AuthRepository authRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.example.app.vidcompose.room.entity.User> getLoggedInUser() {
        return null;
    }
    
    public final void login(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
    }
}