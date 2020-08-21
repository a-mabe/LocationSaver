package com.codepup.locationsaver

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Adapter created by extending RecyclerView.Adapter
class LocationsAdapter(private val locations: List<Location>): RecyclerView.Adapter<LocationsAdapter.ViewHolder>() {

    inner class ViewHolder(listItemView: View) : RecyclerView.ViewHolder(listItemView) {
        // Initialize TextViews
        val categoryTextView: TextView = itemView.findViewById(R.id.category)
        val addressTextView: TextView = itemView.findViewById(R.id.address)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val locationView = inflater.inflate(R.layout.location_row, parent, false)
        return ViewHolder(locationView)
    }

    override fun getItemCount(): Int {
        return locations.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val location: Location = locations[position]

        val categoryTextView = holder.categoryTextView
        categoryTextView.text = location.category
        val addressTextView = holder.addressTextView
        addressTextView.text = location.address
    }

}