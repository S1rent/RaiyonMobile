package com.philipprayitno.rayonmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ProductDetail(): AppCompatActivity() {

    private lateinit var imgProduct: ImageView
    private lateinit var tvName: TextView
    private lateinit var tvDescription: TextView

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DESCRIPTION = "extra_desc"
        const val EXTRA_IMAGE = "extra_image"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        imgProduct = this.findViewById(R.id.img_product_picture)
        tvName = this.findViewById(R.id.tv_product_name)
        tvDescription = this.findViewById(R.id.tv_product_detail)

        val name: String? = intent.getStringExtra(EXTRA_NAME)
        val description: String? = intent.getStringExtra(EXTRA_DESCRIPTION)
        val image: Int = intent.getIntExtra(EXTRA_IMAGE, 0)

        supportActionBar?.setTitle(name ?: "-")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        tvName.text = name ?: "-"
        tvDescription.text = description ?: "-"
        imgProduct.setImageResource(image)
    }
}