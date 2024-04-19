package com.example.proyectofnal

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

class juegoActivity1 : AppCompatActivity() {

    private val list = mutableListOf<CarouselItem>()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_juego1)


        val btn: Button = findViewById(R.id.volver1)
        btn.setOnClickListener {
            val intent: Intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        val carousel: ImageCarousel = findViewById(R.id.carousel)
        list.add(CarouselItem("https://media.contentapi.ea.com/content/dam/need-for-speed/nfs-heat/images/2019/08/nsfh-screenshot-polestar-aug-14.jpg.adapt.crop16x9.652w.jpg"))
        list.add(CarouselItem("https://i.ytimg.com/vi/Mc985c8NdxY/hq720.jpg?sqp=-oaymwEhCK4FEIIDSFryq4qpAxMIARUAAAAAGAElAADIQj0AgKJD&rs=AOn4CLABOT4LpaS3r6asRS2GukFkJKLY9g"))
        list.add(CarouselItem("https://media.contentapi.ea.com/content/dam/need-for-speed/nfs-heat/images/2019/08/nsfh-screenshot-back-shot-aug-19.jpg.adapt.crop16x9.652w.jpg"))
        list.add(CarouselItem("https://hips.hearstapps.com/hmg-prod/images/nsfh-screenshot-gameplay-night-aug-19-jpg-adapt-crop16x9-818p-1566402547.jpg?crop=1.00xw:0.892xh;0,0.108xh&resize=980:*"))
        carousel.addData(list)
    }
}