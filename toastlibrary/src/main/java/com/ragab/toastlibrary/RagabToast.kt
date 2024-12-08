package com.ragab.toastlibrary

import android.content.Context
import android.widget.Toast

class RagabToast(meesage:String="",val context: Context) {

    fun showToast(){
        Toast.makeText(context,"test",Toast.LENGTH_LONG).show()
    }
}