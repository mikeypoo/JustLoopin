package adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import models.Loop
import java.util.*

/**
 * Created by mike on 2/17/16.
 */

class LoopArrayAdapter(context: Context, loops: ArrayList<Loop>) : ArrayAdapter<Loop>(context, 0, loops) {
    override fun getView(position: Int, convertView: View, parent: ViewGroup): View {
        val view = View(context)
        return view
    }
}