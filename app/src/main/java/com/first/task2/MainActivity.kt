package com.first.task2

import android.os.Bundle
import android.provider.ContactsContract.Data
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.liveData
import com.first.task2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    val viewModel : liveViewmodel by  viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)

        viewModel.scoreA.observe(this){

            binding.teamAScore.text=it.toString()
        }

        viewModel.scoreB.observe(this){

            binding.teamBScore.text=it.toString()
        }

        binding.plusOneTeamA.setOnClickListener {
            viewModel.incrementScoreA(true)
        }

        binding.minOneTeamA.setOnClickListener {
            viewModel.decrementScoreA(true)
        }

        binding.plusOneTeamB.setOnClickListener {
            viewModel.incrementScoreB(true)
        }

        binding.minOneTeamB.setOnClickListener {
            viewModel.decrementScoreB(true)
        }

        binding.resetButton.setOnClickListener {

            viewModel.restart()
         }


    }
}