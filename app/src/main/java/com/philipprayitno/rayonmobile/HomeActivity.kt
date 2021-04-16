package com.philipprayitno.rayonmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var rvProducts: RecyclerView
    private lateinit var btnProfile: ImageButton

    private var list: ArrayList<Product> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        supportActionBar?.hide()

        rvProducts = this.findViewById(R.id.rv_products)
        btnProfile = this.findViewById(R.id.btn_profile)

        rvProducts.setHasFixedSize(true)
        btnProfile.setOnClickListener(this)

        list.addAll(ProductData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvProducts.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = HomeProductsAdapter(list)
        rvProducts.adapter = listHeroAdapter
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.btn_profile -> {
                val intent = Intent(this@HomeActivity, ProfileActivity::class.java)
                startActivity(intent)
            }
        }
    }
}