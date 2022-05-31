package jg.apps.design_patterns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val hamburger = Hamburger(
            cheese = false,
            beef = true,
            onions = false
        )

    }
}