package com.philipprayitno.rayonmobile

object ProductData {
    private val productNames = arrayOf(
        "Nintendo eShop Gift Card",
        "Fortnite",
        "Point Blank",
        "Call Of Duty Mobile",
        "Playstation Network Card",
        "Valorant",
        "Apex Legends",
        "Steam",
        "Google Play Giftcard",
        "Spotify"
    )

    private val productDetails = arrayOf(
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        ""
    )

    private val productImages = intArrayOf(
        R.drawable.loneup4,
        R.drawable.loneup6,
        R.drawable.loneup7,
        R.drawable.loneup9,
        R.drawable.loneup3,
        R.drawable.loneup8,
        R.drawable.loneup5,
        R.drawable.loneup2,
        R.drawable.loneup,
        R.drawable.loneup10
    )

    val listData: ArrayList<Product>
        get() {
            val list = arrayListOf<Product>()
            for (position in productNames.indices) {
                val product = Product()
                product.name = productNames[position]
                product.detail = productDetails[position]
                product.photo = productImages[position]
                list.add(product)
            }
            return list
        }
}