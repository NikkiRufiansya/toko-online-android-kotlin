package com.example.tokoonline.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.tokoonline.R
import com.example.tokoonline.activity.MasukActivity
import com.example.tokoonline.helper.SharedPref


class AkunFragment : Fragment() {

    private lateinit var btn_logout: Button
    lateinit var s:SharedPref
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_akun, container, false)
        s = SharedPref(activity!!)
        btn_logout = view.findViewById(R.id.btn_logout)
        btn_logout.setOnClickListener {
            s.setStatusLogin(false)
            startActivity(Intent(activity, MasukActivity::class.java))
            activity!!.finish()
        }
        return view;
    }


}