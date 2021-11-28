package com.example.what_food

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class worldcup_des_result: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.worldcup_des_result)

        var btn_result =  findViewById<ImageButton>(R.id.btn_food_check)
        var btn_restart = findViewById<ImageButton>(R.id.btn_restart)

        var intent = intent
        var resultName = intent.getStringExtra("resultMenuName")
        var FoodImage = intent.getIntExtra("resultMenuImage",0)

        var foddresultname = findViewById<TextView>(R.id.food_result_name)
        var foodresultimage = findViewById<ImageView>(R.id.food_result)
        // 이미지랑 이름 세팅
        foodresultimage.setBackgroundResource(FoodImage!!)
        foddresultname.setText(resultName!!)
        //검색결과확인
        btn_result.setOnClickListener {
            Toast.makeText(applicationContext, resultName, Toast.LENGTH_SHORT).show()
        }

        //다시시작
        btn_restart.setOnClickListener {
            var goto_init = Intent(applicationContext, second::class.java)
            startActivity(goto_init)
            finish()
        }
    }
}