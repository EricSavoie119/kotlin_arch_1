import airport.Android
import java.nio.file.Path

fun main() {
    Android.load("android.properties")
    Android.TCEnv.load("android_devices.properties")
    Android.TCiOS.load(Path.of(Android.TCEnv.properties.getProperty("Android6")).toAbsolutePath().toString())


    println(Android.properties)
    println(Android.TCEnv.properties)
    println(Android.TCEnv.properties.getProperty("Android6"))
    println(Android.TCiOS.properties)
}