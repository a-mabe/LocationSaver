package com.codepup.locationsaver

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.gms.maps.model.LatLng

class NewActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // Call this function in onCreate to setup the RecyclerView
        setupRecyclerView()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate( R.menu.search_menu, menu)
        return true
    }

    /**
     * Sets up the RecyclerView by attaching the adapter, data, and layout.
     */
    private fun setupRecyclerView() {
        // Get the RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.locations)
        // Get the list of locations
        val locationList = getLocations()
        // Create the adapter and pass the locations
        val adapter = LocationsAdapter(locationList)
        // Attach the adapter to the RecyclerView
        recyclerView.adapter = adapter
        // Set the layout
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    /**
     * Generates placeholder location data for the RecyclerView.
     */
    private fun getLocations(): ArrayList<Location> {
        val list = arrayListOf<Location>()

        val location1 = Location("1234 Street Dr.", LatLng(0.0, 0.0), "Home")
        list.add(location1)
        val location2 = Location("5678 Street Dr.", LatLng(0.0, 0.0), "Work")
        list.add(location2)
        val location3 = Location("9999 Street Dr.", LatLng(0.0, 0.0), "Vacation")
        list.add(location3)

        return list
    }

}