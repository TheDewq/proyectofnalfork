package com.example.proyectofnal

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

class juegoActivity2 : AppCompatActivity() {

    private val list = mutableListOf<CarouselItem>()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_juego2)

        val btn: Button = findViewById(R.id.volver2)
        btn.setOnClickListener {
            val intent: Intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        val carousel: ImageCarousel = findViewById(R.id.carousel)
        list.add(CarouselItem("https://play-lh.googleusercontent.com/UXthP3vigcjEYmLCkIGkOrK_GKWWgiNqqcEIdBd74jTv63Y5cGMczDHYVAkwkU3kPSI=w526-h296-rw"))
        list.add(CarouselItem("https://play-lh.googleusercontent.com/XVXu_GxhsF-W4ix0xWiN80o5OyUbcjrP7p_OBMR27yFN4IOH0wA6obfUCoxEXIG-coOy=w526-h296-rw"))
        list.add(CarouselItem("https://play-lh.googleusercontent.com/wdj96ScSw54dqLvqeRhSTATRntzA1wX6z95njtdGsXBoiWXT088C6iA7TnLpfaiMmHU=w526-h296-rw"))
        list.add(CarouselItem("https://play-lh.googleusercontent.com/V8S-C2ELi1n1gTjPYctW71NlndeQmKbq0QN_RKYN4JTY3Uk2MFuaxvwvWoFEMPxy2RA=w526-h296-rw"))
        carousel.addData(list)
    }
}