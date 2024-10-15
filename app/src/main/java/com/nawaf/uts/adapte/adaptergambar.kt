package com.nawaf.uts.adapte

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.nawaf.uts.R

class adaptergambar(private val context: Context, private val images: Array<Int>,
                    private val a: Array<String>, private val b: Array<String>,
                    private val c: Array<String>, private val d: Array<String>,
                    private val e: Array<String>): BaseAdapter() {
    override fun getCount(): Int {
        return images.size
        return a.size
        return b.size
        return c.size
        return d.size
        return e.size

    }

    override fun getItem(position: Int): Any {
        return images[position]
        return a[position]
        return b[position]
        return c[position]
        return d[position]
        return e[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {


        val view: View
        val imageView: ImageView
        val namaa : TextView
        val deskripsi : TextView
        val revieww : TextView
        val ratingg : TextView
        val item : TextView

        if (convertView == null){
            view = LayoutInflater.from(context).inflate(R.layout.item_gambar, parent, false)
            imageView = view.findViewById(R.id.a)
            namaa = view.findViewById(R.id.b)
            deskripsi = view.findViewById(R.id.c)
            revieww = view.findViewById(R.id.d)
            ratingg = view.findViewById(R.id.e)
            item = view.findViewById(R.id.f)
        } else{
            view = convertView
            imageView = view.findViewById(R.id.a)
            namaa = view.findViewById(R.id.b)
            deskripsi = view.findViewById(R.id.c)
            revieww = view.findViewById(R.id.d)
            ratingg = view.findViewById(R.id.e)
            item = view.findViewById(R.id.f)
        }
        imageView.setImageResource(images[position])
        namaa.setText(a[position])
        deskripsi.setText(b[position])
        revieww.setText(c[position])
        ratingg.setText(d[position])
        item.setText(e[position])
        return view
    }
}