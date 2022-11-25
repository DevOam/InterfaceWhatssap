package com.interfacewathssap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import android.widget.Toolbar


class MainActivity : AppCompatActivity() {
    lateinit var toolbar:Toolbar
    lateinit var whatssap:TextView
    lateinit var imgCamera:ImageView
    lateinit var imgSearch:ImageView
    lateinit var imgGroups:ImageView
    lateinit var discussion:TextView
    lateinit var statut:TextView
    lateinit var appels:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initialisation()
        toolbar.inflateMenu(R.menu.mane_whatssap)
        imgGroups.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            if (intent.resolveActivity(packageManager)!=null){
                startActivity(intent)
            }else{
                Toast.makeText(this, "error hundle not found", Toast.LENGTH_SHORT).show()
            }

        }
    }
    private fun initialisation(){
        toolbar=findViewById(R.id.toolbar)
        whatssap=findViewById(R.id.whatssap)
        imgCamera=findViewById(R.id.imgCamera)
        imgSearch=findViewById(R.id.imgSearch)
        imgGroups=findViewById(R.id.imgGroup)
        discussion=findViewById(R.id.discussion)
        statut=findViewById(R.id.statut)
        appels=findViewById(R.id.appels)
    }
}