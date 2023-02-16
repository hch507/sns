package com.example.mvvm_sns.login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModel : ViewModel() {
    var email = MutableLiveData("")
    var password = MutableLiveData("")

    var login = MutableLiveData(false)
    var findId = MutableLiveData(false)
    var findPw = MutableLiveData(false)
}