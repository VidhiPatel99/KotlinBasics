package com.example.vidhi.kotlincalc

import android.content.Intent
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.vidhi.kotlincalc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityMainBinding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.cal=this
        binding.btnTask2.setOnClickListener {
            val intent=Intent(this,Task2Activity::class.java)
            startActivity(intent)

        }
        binding.btnAdd.setOnClickListener {

            var str1: String = binding.et1.text.toString()
            var str2: String = binding.et2.text.toString()

            var r: Int = sum(str1, str2)
            println(r)
//            binding.tvResult.setText(r.toString())
            binding.tvResult.text=r.toString();
        }

        binding.btnSub.setOnClickListener {
            var str1: String = binding.et1.text.toString()
            var str2: String = binding.et2.text.toString()

            var r: Int = sub(str1, str2)
            println(r)
            binding.tvResult.setText(r.toString())
        }

        binding.btnMul.setOnClickListener {
            var str1: String = binding.et1.text.toString()
            var str2: String = binding.et2.text.toString()

            var r: Int = mul(str1, str2)
            println(r)
            binding.tvResult.setText(r.toString())
        }

        binding.btnDiv.setOnClickListener {
            var str1: String = binding.et1.text.toString()
            var str2: String = binding.et2.text.toString()

            var r: Int = div(str1, str2)
            println(r)
            binding.tvResult.setText(r.toString())
        }


    }

    fun sum(a: String, b: String): Int {
        var x= Integer.parseInt(a)
        var y =Integer.parseInt(b)
        return x+y
    }

    fun sub(a: String, b: String): Int {
        var x= Integer.parseInt(a)
        var y =Integer.parseInt(b)
        return x-y
    }

    fun mul(a: String, b: String): Int {
        var x= Integer.parseInt(a)
        var y =Integer.parseInt(b)
        return x*y
    }

    fun div(a: String, b: String): Int {
        var x= Integer.parseInt(a)
        var y =Integer.parseInt(b)
        return x/y
    }
}
