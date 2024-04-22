package com.example.a3city

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SopotActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var dataList: ArrayList<DataClass_Gdynia>
    lateinit var imageList:Array<Int>
    lateinit var titleList:Array<String>
    lateinit var opisList:Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sopot)

        imageList = arrayOf(
            R.drawable.molo_sopot,
            R.drawable.koci__sopot,
            R.drawable.rathole_sopot,
            R.drawable.lipy_sopot
        )

        titleList = arrayOf(
            "Takie długie i z drewna",
            "Polskie KKK",
            "Szczurza dziura",
            "Słynne Sopockie Lipy"
        )

        opisList = arrayOf(
            "Ogólnie płacisz połowę swojej miesięcznej krwawicy a w zamian oglądasz jak typ myje sobie łódkę",
            "Papież mówił że nacisnęło mu się przez przypadek trzecie K na klawiaturze przy papierkowej robocie i tak już zostało... szkoda że nie wierzy on w przypadki",
            "A nie czekaj, to nie w Sopocie",
            "Ogólnie możesz powiedzieć że ta atrakcja to lipa i nikt sie nie obrazi"
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