package com.mikedmcgowan.justloopin

import adapters.LoopArrayAdapter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.view.View
import android.widget.Button
import android.widget.ListView

import java.util.ArrayList

import models.Loop

class LoopActivity : AppCompatActivity() {
    private var loops: ArrayList<Loop> = ArrayList()
    private var loopAdapter: LoopArrayAdapter? = null

    private val onClickMakeLoop = View.OnClickListener {
        val loop = Loop()
        loopAdapter!!.add(loop)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loop)
        setUpControlViews()
    }

    private fun setUpControlViews() {
        loopAdapter = LoopArrayAdapter(this, loops)
        var loopListView = findViewById(R.id.listview_loops) as ListView
        var buttonMakeLoop = findViewById(R.id.button_make_loop) as FloatingActionButton
        buttonMakeLoop.setOnClickListener(onClickMakeLoop)
        loopListView.setAdapter(loopAdapter)
    }
}
