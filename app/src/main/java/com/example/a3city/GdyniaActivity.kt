package com.example.a3city

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class GdyniaActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var dataList: ArrayList<DataClass_Gdynia>
    lateinit var imageList:Array<Int>
    lateinit var titleList:Array<String>
    lateinit var opisList:Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gdynia)

        imageList = arrayOf(
            R.drawable.bulwar_gdynia,
            R.drawable.kamien_gdynia,
            R.drawable.tadek_gdynia,
            R.drawable.schabowy_gdynia
        )

        titleList = arrayOf(
            "Gdyński Bulwar",
            "Jakiś kamień",
            "Opuszczony Dom Tadeusza i jego fiat 125",
            "Kotlet schabowy"
        )

        opisList = arrayOf(
            "Takie długie i z betonu, wsm ładne, jak masz farta to nawet zobaczysz morze!",
            "Ogólnie fajny do siedzenia, chociaż zabrakło funduszy na samoczynne odprowadzanie wody - jest więc mokry gdy pada",
            "Opuszczony dom, bezpieczny, spalony trochę, trochę skarbów na strychu, sejf, jedna część domu oddzielna jest zamieszkana przez bezdomnych. w garażu fiat 125 goły.",
            "Jak kto lubi to podejrzewam że nie pogardzi"
        )

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        dataList = arrayListOf<DataClass_Gdynia>()
        getData()
    }

    private fun getData() {
        for (i in imageList.indices) {
            val dataclassGdynia = DataClass_Gdynia(imageList[i], titleList[i], opisList[i])
            dataList.add(dataclassGdynia)
        }
        recyclerView.adapter = AdapterClass(dataList)
    }
}