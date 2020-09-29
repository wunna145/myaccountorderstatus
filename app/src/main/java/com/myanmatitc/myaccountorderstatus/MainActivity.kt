package com.myanmatitc.myaccountorderstatus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.myanmatitc.myaccountorderstatus.adapter.UltAdapter
import com.myanmatitc.myaccountorderstatus.model.Ult
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var itemList = ArrayList<Ult>()
        itemList.add(Ult(R.drawable.ic_wishlist,"My Wishlist"))
        itemList.add(Ult(R.drawable.ic_notebook,"My Followed Sellers"))
        itemList.add(Ult(R.drawable.ic_box2,"My Purchased Item"))
        itemList.add(Ult(R.drawable.ic_coupons,"My Coupons"))
        itemList.add(Ult(R.drawable.ic_notebook,"My Cards Wallet"))
        itemList.add(Ult(R.drawable.ic_coupons,"Exp Points"))
        itemList.add(Ult(R.drawable.ic_wishlist,"My Given Feedbacks"))
        itemList.add(Ult(R.drawable.ic_history,"Searched History"))
        itemList.add(Ult(R.drawable.ic_wishlist,"Events & Calander"))

        var ultAdapter = UltAdapter(itemList)
        ultRecycler.layoutManager = GridLayoutManager(this,3)
        ultRecycler.adapter = ultAdapter
    }
}