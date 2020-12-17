package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel(finalScore: Int): ViewModel() {
    private val _score = MutableLiveData<Int>()
    val score: LiveData<Int>
        get() = _score

    // Using the observer pattern for a event performed after a button click is really needed?
    // I'm doing it for the sake of exercising what I've learn, but it seems like an overkill.
    private val _eventPlayAgain = MutableLiveData<Boolean>()
    val eventPlayAgain: LiveData<Boolean>
        get() = _eventPlayAgain

    init {
        _score.value = finalScore
        Log.i("ScoreViewModel", "Final score is $finalScore")
    }

    fun onPlayAgain() {
        _eventPlayAgain.value = true
    }
    fun onPlayAgainComplete() {
        _eventPlayAgain.value = false
    }
}