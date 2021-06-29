package sk.doxxbet.pickertest3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.androidchils.odometer.Odometer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val odometer = Odometer.Builder(this)
            .background(
                ContextCompat.getColor(this, R.color.gold_dark),
                ContextCompat.getColor(this, R.color.gold)
            )
            .font(getString(R.string.lato_regular))
            .slot(4)
            .textColor(ContextCompat.getColor(this, R.color.white))
            .textSize(25f)
            .build()

        val container = findViewById<ViewGroup>(R.id.main_container)
        container.addView(odometer)
    }
}