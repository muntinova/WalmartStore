package com.example.walmartstore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_electronic.*

class ElectronicActivity : AppCompatActivity() , OnProductClickListener {

    lateinit var productlist: ArrayList<Product>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_electronic)

        productlist = ArrayList()
        addProduct()
        rv_electronic.layoutManager = LinearLayoutManager(this)
        rv_electronic.addItemDecoration(DividerItemDecoration(this,1))
        rv_electronic.adapter = ElectronicAdapter(productlist, this)
    }

    fun addProduct() {
        productlist.add(Product("iPhone 12", 2500.00, "Red and white", R.drawable.iphone, "0001", "Apple iPhone 12 Pro Max (128GB, Graphite)"))
        productlist.add(Product("MacPro", 2500.50, "Silver", R.drawable.imac, "0003",  "Apple M1 Chip with 8-Core CPU and 7-Core GPU\n" +
                "256GB Storage\n" +
                "Apple M1 chip with 8‑core CPU, 7‑core GPU, and 16‑core Neural Engine\n" +
                "8GB unified memory\n" +
                "256GB SSD storage¹\n" +
                "Retina display with True Tone\n" +
                "Magic Keyboard\n" +
                "Touch ID\n" +
                "Force Touch trackpad\n" +
                "Two Thunderbolt / USB 4 ports"))
        productlist.add(Product("AirPod", 700.88, "White", R.drawable.airpods, "004", "Apple AirPods with Charging Case"))
        productlist.add(Product("iPad Pro ", 999.88, "Black", R.drawable.ipad, "005", "2021 Apple 10.2-inch iPad (Wi-Fi + Cellular, 64GB) - Space Gray"))
          }

    override fun onItemClick(item: Product, position: Int) {
        //Toast.makeText(this, item.title , Toast.LENGTH_SHORT).show()
        var intent = Intent(this, ElectronicDetailActivity::class.java)
        intent.putExtra("Product_Title", item.title)
        intent.putExtra("Product_Description", item.desc)
        intent.putExtra("Product_Color", item.color)
        intent.putExtra("Product_Image", item.image.toString())
        startActivity(intent)
    }
}