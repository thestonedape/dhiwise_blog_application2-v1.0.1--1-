package com.nishantsapplication.app.modules.interestspeople.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nishantsapplication.app.R
import com.nishantsapplication.app.databinding.RowListprofilepictureBinding
import com.nishantsapplication.app.modules.interestspeople.`data`.model.ListprofilepictureRowModel
import kotlin.Int
import kotlin.collections.List

class ListprofilepictureAdapter(
  var list: List<ListprofilepictureRowModel>
) : RecyclerView.Adapter<ListprofilepictureAdapter.RowListprofilepictureVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListprofilepictureVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listprofilepicture,parent,false)
    return RowListprofilepictureVH(view)
  }

  override fun onBindViewHolder(holder: RowListprofilepictureVH, position: Int) {
    val listprofilepictureRowModel = ListprofilepictureRowModel()
    // TODO uncomment following line after integration with data source
    // val listprofilepictureRowModel = list[position]
    holder.binding.listprofilepictureRowModel = listprofilepictureRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListprofilepictureRowModel>) {
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
      item: ListprofilepictureRowModel
    ) {
    }
  }

  inner class RowListprofilepictureVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListprofilepictureBinding = RowListprofilepictureBinding.bind(itemView)
    init {
      binding.btnFollow.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListprofilepictureRowModel())
      }
    }
  }
}
