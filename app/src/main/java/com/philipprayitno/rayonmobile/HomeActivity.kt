package com.philipprayitno.rayonmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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
        val adapter = HomeProductsAdapter(list)
        rvProducts.adapter = adapter

        adapter.setOnItemClickCallback(object : HomeProductsAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Product) {
                navigateToDetail(data)
            }
        })
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.btn_profile -> {
                val intent = Intent(this@HomeActivity, ProfileActivity::class.java)
                startActivity(intent)
            }
        }
    }

    private fun navigateToDetail(product: Product) {
        val intent = Intent(this@HomeActivity, ProductDetail::class.java)

        intent.putExtra(ProductDetail.EXTRA_NAME, product.name)
        intent.putExtra(ProductDetail.EXTRA_DESCRIPTION, product.detail)
        intent.putExtra(ProductDetail.EXTRA_IMAGE, product.photo)

        startActivity(intent)
    }
}