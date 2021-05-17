package com.example.tokoonline.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.tokoonline.R
import com.example.tokoonline.model.ProdukModel
import com.squareup.picasso.Picasso

class AdapterProduk(var data: ArrayList<ProdukModel>) :
    RecyclerView.Adapter<AdapterProduk.Holder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterProduk.Holder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_produk, parent, false)
        return Holder(view)
    }

    class Holder(view: View) : RecyclerView.ViewHolder(view) {
        val tvNama = view.findViewById<TextView>(R.id.tv_nama)
        val tvHarga = view.findViewById<TextView>(R.id.tv_harga)
        val tvHargaAsli = view.findViewById<TextView>(R.id.tv_hargaAsli)
        val imgProduk = view.findViewById<ImageView>(R.id.img_produk)
        val layout = view.findViewById<CardView>(R.id.layout)
    }

    override fun onBindViewHolder(holder: AdapterProduk.Holder, position: Int) {
        holder.tvNama.text = data[position].nama
        holder.tvHarga.text = data[position].harga
        Picasso.get().load(data[position].gambar).into(holder.imgProduk)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}