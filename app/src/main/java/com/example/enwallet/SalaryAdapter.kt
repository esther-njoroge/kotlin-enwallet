package com.example.enwallet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class SalaryAdapter (var salaryList: List<Salary>):
        RecyclerView.Adapter<SalaryViewHolder>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SalaryViewHolder{
                val itemView = LayoutInflater.from(parent.context)
                        .inflate(R.layout.money_list,parent,false)
                return SalaryViewHolder(itemView)
        }

        override fun onBindViewHolder(holder: SalaryViewHolder, position: Int) {
                val salary = salaryList[position]
                holder.tvSalary.text = salary.salary
                holder.tvAmount.text = salary.amount
                holder.tvDate.text = salary.date

        }

        override fun getItemCount(): Int {
                return salaryList.size
        }
}

class SalaryViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val tvSalary = itemView.findViewById<TextView>(R.id.tvSalary)
        val tvAmount = itemView.findViewById<TextView>(R.id.tvAmount)
        val tvDate = itemView.findViewById<TextView>(R.id.tvDate)

}