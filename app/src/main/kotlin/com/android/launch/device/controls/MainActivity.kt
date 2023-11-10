package com.android.launch.device.controls

import android.app.Activity
import android.content.ComponentName
import android.content.Intent
import android.os.Bundle

class MainActivity : Activity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = Intent()
        intent.setComponent(
            ComponentName(
                "com.android.systemui",
                "com.android.systemui.controls.ui.ControlsActivity"
            )
        )
        startActivity(intent)
        finish()
    }
}
