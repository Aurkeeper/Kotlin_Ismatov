package com.example.kotlin_ismatov

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import java.io.StringBufferInputStream

class MainActivity : AppCompatActivity() {
    //Объявление перемен
    private var text: String =  "В магазине осталось <10 банок колы>, может больше" //Строка, у каждого элемента есть свой номер который начинается с 0
    private var text2: String =  "В магазине осталось 10 банок колы, <может больше>"
    private var tvText: TextView? = null; //переменная для text view
    private var tvText2: TextView? = null;

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //отображение нужного слоя
        tvText = findViewById(R.id.tvTextView) //связали переменную и компонент
        tvText2 = findViewById(R.id.tvTextView)
        var subText: String = text.substringAfter('<')
        var subText2: String = subText.substringBefore('>')
        tvText?.setText(subText2)
        var subText3: String = text2.substringAfter('<')
        var subText4: String = subText3.substringBefore('>')
        tvText2?.setText(subText4)
    




}