//don't forget to change the package name
package com.example;

import android.content.Context;
import android.widget.Toast;
import com.rk.extension.ExtensionAPI;
import com.rk.libcommons.ApplicationContextKt;
import com.rk.xededitor.rkUtils;

// This class must always have an empty constructor.
public class Main extends ExtensionAPI {

    @Override
    public void onPluginLoaded() {
        // This example is written in Java for accessibility reasons.
        // It is recommended to use Kotlin for more concise and modern code.

        // Note: When interacting with Kotlin singleton objects (e.g., rkUtils) from Java,
        // you must use the INSTANCE keyword to access their members or methods.

        // Plugins typically run on a background thread. To perform UI-related operations,
        // you must switch to the UI thread. This ensures that UI updates do not cause runtime errors.
        rkUtils.INSTANCE.runOnUiThread(() -> {
            // The ApplicationContextKt.application object always provides the application context.
            // If you need an instance of the main activity, you can retrieve it using:
            // MainActivity.activityRef.get()

            // Display a toast message on the UI thread as an example of interacting with the app's UI.
            Context context = ApplicationContextKt.application;
            Toast.makeText(context, "Plugin has been loaded", Toast.LENGTH_SHORT).show();
        });

        // Additional plugin-specific initialization code can be placed here.

        // Keep in mind that this method will only be called once when the plugin is loaded.
    }

    @Override
    public void onAppLaunch() {

        // This method is called when the app launches.
        // However, its execution is not guaranteed, as it depends on the app's lifecycle
        // and how the plugin is initialized or loaded during the app's startup.


        //NOTE : this method might get called before onPluginLoaded

        rkUtils.INSTANCE.runOnUiThread(() -> {
            // The ApplicationContextKt.application object always provides the application context.
            // If you need an instance of the main activity, you can retrieve it using:
            // MainActivity.activityRef.get()

            // Display a toast message on the UI thread as an example of interacting with the app's UI.
            Context context = ApplicationContextKt.application;
            Toast.makeText(context, "ExamplePlugin : on app launched", Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public void onAppPaused() {


        // This method is triggered when the app enters the paused state.
        // Its invocation is not guaranteed and may depend on the app's lifecycle state.
        // Use this method to perform tasks such as pausing ongoing activities or freeing resources
        // that are not needed while the app is paused.
    }

    @Override
    public void onLowMemory() {
        // This method is invoked when the system is running low on memory.
        // It is an opportunity to clean up resources, release unused objects,
        // or reduce memory usage to ensure the app remains responsive.
        // Note that this method's invocation is not guaranteed in all low-memory situations.
    }

    @Override
    public void onMainActivityDestroyed() {
        //called when main activity is destroyed

    }


}
