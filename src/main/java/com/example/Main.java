// Remember to change the package name to match your project structure.
package com.example;

import android.content.Context;
import android.widget.Toast;
import com.rk.extension.ExtensionAPI;
import com.rk.libcommons.ApplicationContextKt;
import com.rk.xededitor.rkUtils;

// This class must always include an empty constructor.
// It serves as the entry point for the plugin and interacts with the host app.
public class Main extends ExtensionAPI {

    @Override
    public void onPluginLoaded() {
        // This method is called when the plugin is loaded.
        // This example uses Java for demonstration, but Kotlin is recommended
        // for its concise and modern syntax.

        // IMPORTANT: When calling Kotlin singleton objects (e.g., rkUtils) from Java,
        // use the INSTANCE keyword to access their methods or fields.

        // Plugins generally operate on background threads. To perform any UI-related actions,
        // you must switch to the UI thread to avoid runtime exceptions.

        rkUtils.INSTANCE.runOnUiThread(() -> {
            // Use the ApplicationContextKt.application object to access the application context.
            // To get the main activity instance, use: MainActivity.activityRef.get()

            // Example: Show a Toast message when the plugin is loaded.
            Context context = ApplicationContextKt.application;
            Toast.makeText(context, "Plugin has been loaded", Toast.LENGTH_SHORT).show();
        });

        // Add any additional initialization logic for your plugin here.
        // Note: This method is called only once when the plugin is loaded.
    }

    @Override
    public void onAppCreated() {
        // This method is triggered after the app's main activity almost completes its onCreate method.
        // You can use this to perform setup tasks that depend on the activity being initialized.
    }

    @Override
    public void onAppLaunched() {
        // This method is called when the app is launched.
        // Note: It might be called before onPluginLoaded, depending on the app's lifecycle.

        rkUtils.INSTANCE.runOnUiThread(() -> {
            // Example: Show a Toast message when the app is launched.
            Context context = ApplicationContextKt.application;
            Toast.makeText(context, "ExamplePlugin: App launched", Toast.LENGTH_SHORT).show();
        });

        // Add any additional logic to handle app launch events here.
    }

    @Override
    public void onAppPaused() {
        // This method is called when the app is paused.
        // Use this to pause any ongoing operations or release resources
        // that are not needed while the app is in the paused state.
        // Note: Its invocation is not guaranteed in all lifecycle situations.
    }

    @Override
    public void onAppResumed() {
        // This method is called when any activity in the app is resumed.
        // Use this to restart paused operations or refresh the app's state if needed.
    }

    @Override
    public void onAppDestroyed() {
        // This method is triggered when the main activity is destroyed.
        // Use this to clean up resources or perform final tasks before the app exits.
    }

    @Override
    public void onLowMemory() {
        // This method is called when the system is running low on memory.
        // Use this to release unused resources or objects to free up memory.
        // Note: This method might not always be triggered during low-memory situations.
    }






}
