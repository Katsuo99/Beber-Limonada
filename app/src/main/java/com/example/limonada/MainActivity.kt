package com.example.limonada

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.limonada.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        var clicks=0
        var numal=(1..10).random()
        binding.imgLimon.setOnClickListener {


            if (binding.txtLimon.text == "Selecciona Un Limon"){
                binding.txtLimon.text = "Exprime El Limon"
                binding.imgLimon.setImageResource(R.drawable.lemon_squeeze)
            }
            else if (binding.txtLimon.text == "Exprime El Limon"){
                if(clicks==numal){
                    binding.txtLimon.text = "Bebe La Limonada"
                    binding.imgLimon.setImageResource(R.drawable.lemon_drink)
                    clicks=0
                    numal=(1..10).random()
                    binding.txtclicks.text=""
                }else {
                    clicks+=1
                    binding.txtclicks.text=((numal-clicks)+1).toString()+" Clicks Restantes"
                }
            }
            else if (binding.txtLimon.text == "Bebe La Limonada"){
                binding.txtLimon.text = "Repite el proceso"
                binding.imgLimon.setImageResource(R.drawable.lemon_restart)
            }
            else if (binding.txtLimon.text == "Repite el proceso"){
                binding.txtLimon.text = "Selecciona Un Limon"
                binding.imgLimon.setImageResource(R.drawable.lemon_tree)
            }
        }
    }

    private fun change_img(){




        /*img.setOnClickListener{
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
                clicks=0*/
            }
    }