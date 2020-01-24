package com.example.todoapplication.tasks

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

import com.example.todoapplication.R

/**
 * A simple [Fragment] subclass.
 */
class AddTaskDialog : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(context!!)
        val inflater = requireActivity().layoutInflater

        builder.setView(inflater.inflate(R.layout.fragment_add_task_dialog, null))
            .setTitle(R.string.add_task)
            .setPositiveButton(R.string.add) { dialog, _ -> dialog.dismiss() }
            .setNegativeButton(R.string.close) { dialog, _ -> dialog.dismiss() }

        return builder.create()
    }
}
