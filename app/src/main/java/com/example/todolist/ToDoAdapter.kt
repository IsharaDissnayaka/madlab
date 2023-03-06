package com.example.todolist

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class  ToDoAdapter ( private val todos :MutableList<Todo>) : RecyclerView.Adapter<ToDoAdapter.ToDoviewHolder>(){
    class ToDoviewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoviewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ToDoviewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}

