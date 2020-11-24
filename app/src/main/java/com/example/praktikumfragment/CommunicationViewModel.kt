package com.example.praktikumfragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CommunicationViewModel : ViewModel() {
    //deklarasi variabel
    private val mName = MutableLiveData<String>()
    private val mNPM = MutableLiveData<String>()

    //deklarasi live data
    val name: LiveData<String>
        get() = mName
    val npm: LiveData<String>
        get() = mNPM

    //function set value
    fun setName(name: String) {
        mName.value = name
    }
    fun setNPM(npm: String){
        mNPM.value = npm
    }

}