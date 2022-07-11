package com.ersubhadip.canvas

import android.graphics.Path
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var path: Path = Path();
        val angle = (Math.random() * 20 + 0) + 40
        for (i in 0 until 10) {
            path.reset()
            //create a oval
            path.addCircle(5F,5F,10F,Path.Direction.CW)

        }


    }

}