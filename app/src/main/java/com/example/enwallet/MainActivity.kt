package com.example.enwallet

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.enwallet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun displaySalary(){
        val salary1 = Salary("Rent","KES 16000","2 July 2024")
        val salary2 = Salary("Dividends","KES 2400","4 July 2024")
        val salary3 = Salary("Electricity","KES 800","5 July 2024")
        val salary4 = Salary("Internet","KES 25000","5 July 2024")
        val salary5 = Salary("Shopping","KES 3500","5 July 2024")
        val salary6 = Salary("Bus Fare","KES 500","11 July 2024")


        val salaryList = listOf(salary1,salary2,salary3,salary4,salary5,salary6)
        val salaryAdapter =SalaryAdapter(salaryList)
        binding.rvSalary.adapter = salaryAdapter










    }

}