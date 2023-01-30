package com.hfad.android.cleanarchitecture.cleancodetest.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.hfad.android.cleanarchitecture.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    private val viewModel by viewModel<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.resultLive.observe(this, Observer {
            binding.tvData.text = it
        })

        binding.btnPutData.setOnClickListener {
            val text = binding.edtSaveName.text.toString()
            viewModel.save(text)
        }

        binding.btnGetData.setOnClickListener {

            viewModel.load()

        }
    }

}