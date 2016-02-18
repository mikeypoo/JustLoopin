package adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.mikedmcgowan.justloopin.R
import models.Loop
import java.util.*

/**
 * Created by mike on 2/17/16.
 */

class LoopArrayAdapter(context: Context, loops: ArrayList<Loop>) : ArrayAdapter<Loop>(context, 0, loops) {
    val inflater = LayoutInflater.from(context)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val item = getItem(position)
        val view = convertView ?: inflater.inflate(R.layout.partial_loop, parent, false)
        return view
    }
}