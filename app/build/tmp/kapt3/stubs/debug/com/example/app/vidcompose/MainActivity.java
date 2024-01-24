package com.example.app.vidcompose;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.WindowManager;
import androidx.activity.ComponentActivity;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.font.FontWeight;
import androidx.core.view.WindowCompat;
import androidx.media3.common.util.UnstableApi;
import com.example.app.vidcompose.player.PlayerActivity;
import com.google.accompanist.permissions.ExperimentalPermissionsApi;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\rH\u0002J\u0012\u0010\u000f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0015J\b\u0010\u0012\u001a\u00020\rH\u0002R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0013"}, d2 = {"Lcom/example/app/vidcompose/MainActivity;", "Landroidx/activity/ComponentActivity;", "()V", "<set-?>", "", "userIsLoggedIn", "getUserIsLoggedIn", "()Z", "setUserIsLoggedIn", "(Z)V", "userIsLoggedIn$delegate", "Landroidx/compose/runtime/MutableState;", "DisplayAppContent", "", "checkUserLoggedIn", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "saveUserLoggedInStatus", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class MainActivity extends androidx.activity.ComponentActivity {
    private final androidx.compose.runtime.MutableState userIsLoggedIn$delegate = null;
    
    public MainActivity() {
        super();
    }
    
    private final boolean getUserIsLoggedIn() {
        return false;
    }
    
    private final void setUserIsLoggedIn(boolean p0) {
    }
    
    @androidx.media3.common.util.UnstableApi
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @androidx.media3.common.util.UnstableApi
    @androidx.compose.runtime.Composable
    public final void DisplayAppContent() {
    }
    
    private final void checkUserLoggedIn() {
    }
    
    private final void saveUserLoggedInStatus() {
    }
}