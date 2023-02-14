package com.example.mvvm_sns.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.mvvm_sns.R
import com.example.mvvm_sns.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding : ActivityLoginBinding
    lateinit var viewModel: ViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //viewmodel과 loginActivity의 생명주기를 같게함
        viewModel = ViewModelProvider(this)[ViewModel::class.java]
        binding=DataBindingUtil.setContentView(this,R.layout.activity_login)
        binding.viewmodel = viewModel
        binding.loginactivity=this
        binding.lifecycleOwner = this



    }
    fun login(){
        print("로그인 버튼을 클릭하셨습니다.")
    }
    fun find(){
        print("아이디 찾기 클릭")
    }
}