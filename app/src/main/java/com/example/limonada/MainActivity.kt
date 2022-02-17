package com.example.limonada

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val img:ImageView=findViewById(R.id.imgLimon)
        val txt:TextView=findViewById(R.id.txtLimon)
        val txtc:TextView=findViewById(R.id.textViewnum)
        var clicks=0
        val numal=(2..10).random()

        img.setOnClickListener{
            if (clicks==0){
                txt.setText("Selecciona Un Limon")
                img.setImageResource(R.drawable.lemon_tree)
                clicks+=1
            }else if(clicks<numal){
                txt.setText("Exprime El Limon")
                img.setImageResource(R.drawable.lemon_squeeze)
                clicks+=1
            }else if(clicks==numal){
                txt.setText("Bebe La Limonada")
                img.setImageResource(R.drawable.lemon_drink)
                clicks+=1
            }else if(clicks>=numal){
                txt.setText("Repite el proceso")
                img.setImageResource(R.drawable.lemon_restart)
                clicks=0
            }

        }



    }
}