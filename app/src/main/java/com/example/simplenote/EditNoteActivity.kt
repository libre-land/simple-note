package com.example.simplenote

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.simplenote.databinding.ActivityEditNoteBinding

class EditNoteActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityEditNoteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityEditNoteBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)


    }

    fun onClickSaveNote(view: View) {

    }
}