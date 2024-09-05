package com.first.task2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class liveViewmodel : ViewModel() {

    private val _scoreA = MutableLiveData<Int>(0)
    val scoreA: LiveData<Int>
        get() = _scoreA

    fun incrementScoreA(isTeamA: Boolean) {
        if (isTeamA) {
            _scoreA.value = _scoreA.value!!+1
        }

    }
    fun decrementScoreA(isTeamA: Boolean) {
        if (isTeamA) {
            if(_scoreA.value==0){
                _scoreA.value = 0
            }
            else {
                _scoreA.value = _scoreA.value!! - 1
            }
        }

    }
    private val _scoreB = MutableLiveData<Int>(0)
    val scoreB: LiveData<Int>
        get() = _scoreB

    fun incrementScoreB(isTeamB: Boolean) {
        if (isTeamB) {
            _scoreB.value = _scoreB.value!!+1
        }

    }
    fun decrementScoreB(isTeamB: Boolean) {
        if (isTeamB) {
            if(_scoreB.value ==0){
                _scoreB.value = 0
            }
            else{
                _scoreB.value = _scoreB.value!!-1
            }
        }

    }


    fun restart(){
        _scoreB.value=0
        _scoreA.value=0
    }

}