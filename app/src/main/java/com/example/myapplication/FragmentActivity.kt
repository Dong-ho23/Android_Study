package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        val fragmentManager = supportFragmentManager
        //프라그먼트에 대해 작업을 할때는 fragmentManager를 통함
        //fragmentManager 는 deprecated 대신 supportFragmentManager를 사용
        val fragmentFirst = FragmentFirst()
        //프래그먼트를 객체화


        (findViewById<TextView>(R.id.add)).setOnClickListener {
            val transaction = fragmentManager.beginTransaction() //트랜잭션 시작
            transaction.replace(R.id.root, fragmentFirst)
            transaction.commit()
        }
        //Commit
        /***
         * 1> commit
         * 2> commitAllowingStateLoss
         * 3> commitNow
         * 4> commitNowAllowingStateLoss
         */

        (findViewById<TextView>(R.id.remove)).setOnClickListener {

        }

    }
}