package com.example.proyectofnal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

class juegoActivity : AppCompatActivity() {

    private val list = mutableListOf<CarouselItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_juego)

        val btn: Button = findViewById(R.id.volver)
        btn.setOnClickListener {
            val intent: Intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        val carousel: ImageCarousel = findViewById(R.id.carousel)
        list.add(CarouselItem("https://play-lh.googleusercontent.com/cTIy9PqjLYSdVAFPI2KhPUJB2hXMyyl5b_E8zHPjZ84GiFaT0Npxvq1BVT3s9Pd2GYxU=w526-h296"))
        list.add(CarouselItem("https://play-lh.googleusercontent.com/X4uwzwEd--x-DfBJ96gY5Ys-p6WYJkLKRd7fA6SXHbMP6aXSUN3IWEXO5B5mzwGy2Rw=w526-h296-rw"))
        list.add(CarouselItem("https://www.cevagraf.coop/comics/wp-content/uploads/2020/11/trucos-del-gacha-de-fate-grand-order-1529914528.jpg"))
        list.add(CarouselItem("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSlsBn9PJsOcbERhiveCifayUqZ148Gr3anGqa1idCv1w&s"))
        carousel.addData(list)
    }
}