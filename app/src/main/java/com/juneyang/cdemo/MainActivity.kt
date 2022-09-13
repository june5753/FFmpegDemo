package com.juneyang.cdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.juneyang.cdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

  private lateinit var binding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    // Example of a call to a native method
    binding.sampleText.text = ffmpegInfo()
  }

  /**
   * A native method that is implemented by the 'cdemo' native library,
   * which is packaged with this application.
   */
  private external fun stringFromJNI(): String

  private external fun ffmpegInfo(): String

  companion object {
    // Used to load the 'xxxx' library on application startup.
    init {
      System.loadLibrary("native-lib")
    }
  }
}