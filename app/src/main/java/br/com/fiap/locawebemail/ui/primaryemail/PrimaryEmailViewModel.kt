package br.com.fiap.locawebemail.ui.primaryemail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PrimaryEmailViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is primary email Fragment"
    }
    val text: LiveData<String> = _text
}