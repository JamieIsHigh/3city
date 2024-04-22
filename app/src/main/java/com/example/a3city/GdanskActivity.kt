package com.example.a3city

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class GdanskActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var dataList: ArrayList<DataClass_Gdynia>
    lateinit var imageList:Array<Int>
    lateinit var titleList:Array<String>
    lateinit var opisList:Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gdansk)

        imageList = arrayOf(
            R.drawable.neptun_gdansk,
            R.drawable.sup_ogoszeniowy_gdansk,
            R.drawable.wrzeszcz_gdansk,
            R.drawable.skup_zomu_gdansk,
            R.drawable.areszt_gdansk
        )

        titleList = arrayOf(
            "Posąg neptuna",
            "Słup ogłoszeniowy",
            "Gdańsk Wrzeszcz",
            "Skup złomu",
            "Areszt Gdańsk"
        )

        opisList = arrayOf(
            "Oh, pamiętam to miejsce! Aresztowano mnie tam za picie wody z fontanny!",
            "Oh, pamiętam to miejsce! Aresztowano mnie tam za rozwieszanie własnych ogłoszeń bez zezwolenia!",
            "Oh, pamiętam to miejsce! Aresztowano mnie tam za wrzeszczenie o późnych godzinach nonych",
            "Oh, pamiętam to miejsce! Aresztowano mnie tam za jedzenie złomu!!",
            "Oh, pamiętam to miejsce!"
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