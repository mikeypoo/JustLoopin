package com.mikedmcgowan.justloopin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

import java.util.ArrayList

import models.Loop

class LoopActivity : AppCompatActivity() {
    private var buttonMakeLoop: Button? = null
    private val loops: ArrayList<Loop>? = ArrayList()

    private val onClickMakeLoop = View.OnClickListener {
        val loop = Loop()
        loops!!.add(loop)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loop)
        setUpControlViews()
    }

    private fun setUpControlViews() {
        buttonMakeLoop = findViewById(R.id.button_make_loop) as Button
        buttonMakeLoop!!.setOnClickListener(onClickMakeLoop)
    }
}
