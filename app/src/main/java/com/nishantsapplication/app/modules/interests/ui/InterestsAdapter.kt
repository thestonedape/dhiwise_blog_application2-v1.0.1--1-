package com.nishantsapplication.app.modules.interests.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nishantsapplication.app.R
import com.nishantsapplication.app.databinding.RowInterestsBinding
import com.nishantsapplication.app.modules.interests.`data`.model.InterestsRowModel
import kotlin.Int
import kotlin.collections.List

class InterestsAdapter(
  var list: List<InterestsRowModel>
) : RecyclerView.Adapter<InterestsAdapter.RowInterestsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowInterestsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_interests,parent,false)
    return RowInterestsVH(view)
  }

  override fun onBindViewHolder(holder: RowInterestsVH, position: Int) {
    val interestsRowModel = InterestsRowModel()
    // TODO uncomment following line after integration with data source
    // val interestsRowModel = list[position]
    holder.binding.interestsRowModel = interestsRowModel
  }

  override fun getItemCount(): Int = 9
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<InterestsRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: InterestsRowModel
    ) {
    }
  }

  inner class RowInterestsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowInterestsBinding = RowInterestsBinding.bind(itemView)
  }
}
