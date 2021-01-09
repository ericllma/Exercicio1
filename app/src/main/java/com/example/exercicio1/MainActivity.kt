package com.example.exercicio1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        box.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == box.id) {
            mudarCor()
        }
    }

    private fun mudarCor() {
        if (box.isChecked) {
            flashIcone.setColorFilter(resources.getColor(R.color.purple_700))
        }
        else {
            flashIcone.setColorFilter(resources.getColor(R.color.white))
        }
    }
}