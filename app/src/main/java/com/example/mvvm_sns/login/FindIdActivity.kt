package com.example.mvvm_sns.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.mvvm_sns.R
import com.example.mvvm_sns.utils.Constant.TAG

class FindIdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_id)
        Log.d(TAG, "FindIdActivity-onCreate() called")
    }
}