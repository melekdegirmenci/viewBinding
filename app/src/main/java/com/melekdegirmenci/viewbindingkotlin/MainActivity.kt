package com.melekdegirmenci.viewbindingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.melekdegirmenci.viewbindingkotlin.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.textView4
        //textView4=findViewById<TextView>(R.id.textView4)
    }
    fun ismiDegistir(view: View){
        println("Değiştire Tıklandı")
        binding.textView4.text="Merhaba Kotlin"
    }


}