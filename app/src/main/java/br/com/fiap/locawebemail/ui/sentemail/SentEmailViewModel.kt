package br.com.fiap.locawebemail.ui.sentemail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SentEmailViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is sent email Fragment"
    }
    val text: LiveData<String> = _text
}