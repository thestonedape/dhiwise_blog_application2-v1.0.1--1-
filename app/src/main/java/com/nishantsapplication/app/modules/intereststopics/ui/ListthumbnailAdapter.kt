package com.nishantsapplication.app.modules.intereststopics.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nishantsapplication.app.R
import com.nishantsapplication.app.databinding.RowListthumbnailBinding
import com.nishantsapplication.app.modules.intereststopics.`data`.model.ListthumbnailRowModel
import kotlin.Int
import kotlin.collections.List

class ListthumbnailAdapter(
  var list: List<ListthumbnailRowModel>
) : RecyclerView.Adapter<ListthumbnailAdapter.RowListthumbnailVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListthumbnailVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listthumbnail,parent,false)
    return RowListthumbnailVH(view)
  }

  override fun onBindViewHolder(holder: RowListthumbnailVH, position: Int) {
    val listthumbnailRowModel = ListthumbnailRowModel()
    // TODO uncomment following line after integration with data source
    // val listthumbnailRowModel = list[position]
    holder.binding.listthumbnailRowModel = listthumbnailRowModel
  }

  override fun getItemCount(): Int = 9
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListthumbnailRowModel>) {
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
      item: ListthumbnailRowModel
    ) {
    }
  }

  inner class RowListthumbnailVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListthumbnailBinding = RowListthumbnailBinding.bind(itemView)
    init {
      binding.btnFollow.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListthumbnailRowModel())
      }
    }
  }
}
