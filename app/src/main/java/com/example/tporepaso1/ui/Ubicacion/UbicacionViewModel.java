package com.example.tporepaso1.ui.Ubicacion;

import static android.Manifest.permission.ACCESS_COARSE_LOCATION;
import static android.Manifest.permission.ACCESS_FINE_LOCATION;
import static androidx.core.app.ActivityCompat.requestPermissions;
import static androidx.core.content.PermissionChecker.checkSelfPermission;

import android.content.pm.PackageManager;
import android.os.Build;

import androidx.lifecycle.ViewModel;

public class UbicacionViewModel extends ViewModel {

    public boolean solicitarPermisos() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M
                && (checkSelfPermission(ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) ||
                (checkSelfPermission(ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED)) {
            requestPermissions(new String[]{ACCESS_FINE_LOCATION, ACCESS_COARSE_LOCATION}, 1000);
        }

        return true;
    }

    private int checkSelfPermission(String accessFineLocation) {
        return 0;
    }

    private void requestPermissions(String[] strings, int i) {

    }

}