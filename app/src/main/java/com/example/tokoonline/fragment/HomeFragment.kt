package com.example.tokoonline.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.example.tokoonline.R
import com.example.tokoonline.adapter.AdapterProduk
import com.example.tokoonline.adapter.AdapterSlider
import com.example.tokoonline.model.ProdukModel
import java.util.ArrayList

class HomeFragment : Fragment() {

    lateinit var vpSlider: ViewPager
    lateinit var rvProduk: RecyclerView
    lateinit var rvProdukTerlaris: RecyclerView
    lateinit var rvElektronik: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_home, container, false)
        init(view)
        displayIklan()
        displayProduct()
        displayProdukTerlaris()
        displayElektronik()
        return view
    }

    fun init(view: View) {
        vpSlider = view.findViewById(R.id.vp_slider)
        rvProduk = view.findViewById(R.id.rv_produk)
        rvProdukTerlaris= view.findViewById(R.id.rv_produkTerlasir)
        rvElektronik = view.findViewById(R.id.rv_elektronik)
    }

    fun displayIklan() {
        val arrSlider = ArrayList<String>()
        arrSlider.add("https://s2.bukalapak.com/uploads/content_attachment/cb5940f22194fd4085d234b5/w-744/iphone_vs_samsung-_samsung.jpg")
        arrSlider.add("https://i.ytimg.com/vi/2QRDO4wQp8c/maxresdefault.jpg")
        arrSlider.add("https://awsimages.detik.net.id/community/media/visual/2019/02/20/6f0896a7-c721-4650-801b-4c17f17255b5.jpeg?w=700&q=90")
        val adapterSlider = AdapterSlider(arrSlider, activity)
        vpSlider.adapter = adapterSlider
    }

    fun displayProduct() {
        val layoutManager = LinearLayoutManager(activity)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
        rvProduk.adapter = AdapterProduk(arrProduk)
        rvProduk.layoutManager = layoutManager
    }

    fun displayProdukTerlaris(){
        val layoutManager = LinearLayoutManager(activity)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
        rvProdukTerlaris.adapter = AdapterProduk(arrProdukTerlaris)
        rvProdukTerlaris.layoutManager = layoutManager
    }

    fun displayElektronik(){
        val layoutManager = LinearLayoutManager(activity)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
        rvElektronik.adapter = AdapterProduk(arrElektronik)
        rvElektronik.layoutManager = layoutManager
    }

    val arrProduk: ArrayList<ProdukModel>
        get() {
            val arr = ArrayList<ProdukModel>()
            val p1 = ProdukModel()
            p1.nama = "HP 14_bs749tu"
            p1.harga = "Rp.5.500.000"
            p1.gambar = "https://s2.bukalapak.com/img/7801931813/large/1.jpg"

            val p2 = ProdukModel()
            p2.nama = "Hp Envy_13_aq0019tx"
            p2.harga = "Rp.15.980.000"
            p2.gambar = "https://s2.bukalapak.com/img/7801931813/large/1.jpg"

            val p3 = ProdukModel()
            p3.nama = "HP pavilion_13_an0006na"
            p3.harga = "Rp.14.200.000"
            p3.gambar = "https://s2.bukalapak.com/img/7801931813/large/1.jpg"

            val p4 = ProdukModel()
            p4.nama = "Hp Envy_13_aq0019tx"
            p4.harga = "Rp.15.980.000"
            p4.gambar = "https://s2.bukalapak.com/img/7801931813/large/1.jpg"

            arr.add(p1)
            arr.add(p2)
            arr.add(p3)
            arr.add(p4)
            return arr
        }


    val arrProdukTerlaris: ArrayList<ProdukModel>
        get() {
            val arr = ArrayList<ProdukModel>()
            val p1 = ProdukModel()
            p1.nama = "HP 14_bs749tu"
            p1.harga = "Rp.5.500.000"
            p1.gambar = "https://s2.bukalapak.com/img/7801931813/large/1.jpg"

            val p2 = ProdukModel()
            p2.nama = "Hp Envy_13_aq0019tx"
            p2.harga = "Rp.15.980.000"
            p2.gambar = "https://s2.bukalapak.com/img/7801931813/large/1.jpg"

            val p3 = ProdukModel()
            p3.nama = "HP pavilion_13_an0006na"
            p3.harga = "Rp.14.200.000"
            p3.gambar = "https://s2.bukalapak.com/img/7801931813/large/1.jpg"

            val p4 = ProdukModel()
            p4.nama = "Hp Envy_13_aq0019tx"
            p4.harga = "Rp.15.980.000"
            p4.gambar = "https://s2.bukalapak.com/img/7801931813/large/1.jpg"

            arr.add(p1)
            arr.add(p2)
            arr.add(p3)
            arr.add(p4)
            return arr
        }

    val arrElektronik: ArrayList<ProdukModel>
        get() {
            val arr = ArrayList<ProdukModel>()
            val p1 = ProdukModel()
            p1.nama = "HP 14_bs749tu"
            p1.harga = "Rp.5.500.000"
            p1.gambar = "https://s2.bukalapak.com/img/7801931813/large/1.jpg"

            val p2 = ProdukModel()
            p2.nama = "Hp Envy_13_aq0019tx"
            p2.harga = "Rp.15.980.000"
            p2.gambar = "https://s2.bukalapak.com/img/7801931813/large/1.jpg"

            val p3 = ProdukModel()
            p3.nama = "HP pavilion_13_an0006na"
            p3.harga = "Rp.14.200.000"
            p3.gambar = "https://s2.bukalapak.com/img/7801931813/large/1.jpg"

            val p4 = ProdukModel()
            p4.nama = "Hp Envy_13_aq0019tx"
            p4.harga = "Rp.15.980.000"
            p4.gambar = "https://s2.bukalapak.com/img/7801931813/large/1.jpg"

            arr.add(p1)
            arr.add(p2)
            arr.add(p3)
            arr.add(p4)
            return arr
        }

}