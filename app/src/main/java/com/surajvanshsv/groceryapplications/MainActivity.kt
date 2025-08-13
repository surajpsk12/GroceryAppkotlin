package com.surajvanshsv.groceryapplications

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        //1.  adapter view : recycler view
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        )
        // 2. Data source : List of item model objects
        var groceryItems : ArrayList<ItemModel> = ArrayList()

        val v1 = ItemModel("Fruits", " Fresh fruits from garden", R.drawable.fruit)
        val v2 = ItemModel("Vegetables", " Delicious vegetables", R.drawable.vegitables)
        val v3 = ItemModel("Bakery", " Breads , beans and wheat", R.drawable.bread)
        val v4 = ItemModel("Beverages", " Juice , Tea , Coffee and Soda", R.drawable.beverage)
        val v5 = ItemModel("Milk", " Milk , Shakes and Yogurts", R.drawable.milk)
        val v6 = ItemModel("Snacks", " Popcorn , Donuts , String ", R.drawable.popcorn)

        groceryItems.add(v1)
        groceryItems.add(v2)
        groceryItems.add(v3)
        groceryItems.add(v4)
        groceryItems.add(v5)
        groceryItems.add(v6)

        val myAdapter = MyAdapter(groceryItems)
        recyclerView.adapter = myAdapter



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}