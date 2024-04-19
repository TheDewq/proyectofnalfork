package com.example.proyectofnal

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

class Juego3 : AppCompatActivity() {

    private val list = mutableListOf<CarouselItem>()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_juego3)


        val btn: Button = findViewById(R.id.volver3)
        btn.setOnClickListener {
            val intent: Intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        val carousel: ImageCarousel = findViewById(R.id.carousel)
        list.add(CarouselItem("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSg68OFzJ6ZMmtXdu147wHdb3Q-2GgtwHqkxW3mmDUCxA&s"))
        list.add(CarouselItem("https://s.13.cl/sites/default/files/esports/articulo/field-imagen/2020-05/wild-rift-lanzamiento-fecha.jpg"))
        list.add(CarouselItem("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ3f-lyFIghMYZJxtvfTGQdAram3qXQlIVQ1FIL-0nNKg&s"))
        list.add(CarouselItem("https://static1-es.millenium.gg/articles/7/27/97/7/@/128860-d851287ae625d664b411420ab8a04ac53d856678-article_m-1.jpeg"))
        carousel.addData(list)
    }
}