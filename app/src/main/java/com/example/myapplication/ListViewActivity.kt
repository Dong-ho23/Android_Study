package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class ListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        var carList = mutableListOf<Car>()
        for (i in 0..100) {
            carList.add(Car("" + i + "번째 자동차",
                "" + i + "번째 엔진"))
        }
    }
}

class Car(val nthCar: String, val nthEngine: String)

class ListViewAdapter(
    val carList: MutableList<Car>,
    var layoutInflater: LayoutInflater
) :BaseAdapter() {
    override fun getCount(): Int {
        //전체 데이터의 크기 (갯수)
        return carList.size
    }

    override fun getItem(position: Int): Any {
        //전체 데이터 중에서 해당 번째의 데이터를 리턴
        return carList.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = layoutInflater.inflate(R.layout.car_item, null)
        return view
    }
}