package com.dicoding.dominospizza

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.dominospizza.R.layout.activity_main as activity_main1

class MainActivity : AppCompatActivity() {
    private lateinit var rvItems: RecyclerView
    private val list= ArrayList<Items>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main1)

        rvItems= findViewById(R.id.rvItems)
        rvItems.setHasFixedSize(true)

        list.addAll(ItemsData.listData)
        showRecyclerList()
    }
    private fun showRecyclerList(){
        rvItems.layoutManager= LinearLayoutManager(this)
        val listItemsAdapter= ListAdapter(list)
        rvItems.adapter= listItemsAdapter


   }


}