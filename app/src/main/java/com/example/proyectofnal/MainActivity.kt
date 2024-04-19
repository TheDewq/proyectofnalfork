package com.example.proyectofnal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

class MainActivity : AppCompatActivity() {

    private val list = mutableListOf<CarouselItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn: ImageButton = findViewById(R.id.juego1)
        btn.setOnClickListener {
            val intent:Intent = Intent(this,juegoActivity::class.java)
            startActivity(intent)
        }

        val btn1: ImageButton = findViewById(R.id.juego2)
        btn1.setOnClickListener {
            val intent:Intent = Intent(this,juegoActivity1::class.java)
            startActivity(intent)
        }

        val btn2: ImageButton = findViewById(R.id.juego3)
        btn2.setOnClickListener {
            val intent:Intent = Intent(this,juegoActivity2::class.java)
            startActivity(intent)
        }

        val btn3: ImageButton = findViewById(R.id.juego4)
        btn3.setOnClickListener {
            val intent:Intent = Intent(this,Juego3::class.java)
            startActivity(intent)
        }
        val carousel: ImageCarousel = findViewById(R.id.carousel)
        list.add(CarouselItem("https://www.mundodeportivo.com/alfabeta/hero/2021/07/Logo-de-League-of-Legends-Wild-Rift.jpg?width=768&aspect_ratio=16:9&format=nowebp"))
        list.add(CarouselItem("https://nie.res.netease.com/r/pic/20220803/b6f4c1ed-e4bf-476c-9a2a-ca9ba225f2dc.jpg"))
        list.add(CarouselItem("https://store-images.s-microsoft.com/image/apps.8294.69435230515002378.477c7a96-5d17-45ec-95c2-a2739146b68d.fd377b26-2212-4834-b9f4-b14e17f411ec?q=90&w=480&h=270"))
        list.add(CarouselItem("https://play-lh.googleusercontent.com/tIcVVQ0WuYanNy5CRkYbLTyP_7XbQLLJPDi5_vNBaT8DTot-W459yQoJyuNM09D3XOU=w526-h296-rw"))
        carousel.addData(list)
    }




}