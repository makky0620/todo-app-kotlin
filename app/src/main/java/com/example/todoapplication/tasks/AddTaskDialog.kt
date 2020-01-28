package com.example.todoapplication.tasks

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import com.example.todoapplication.R
import com.example.todoapplication.databinding.FragmentAddTaskDialogBinding

/**
 * A simple [Fragment] subclass.
 */
class AddTaskDialog : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(context!!)

        val binding = DataBindingUtil.inflate<FragmentAddTaskDialogBinding>(LayoutInflater.from(activity), R.layout.fragment_add_task_dialog, null, false)
        val view = binding.root

        builder.setView(view)
            .setTitle(R.string.add_task)
            .setIcon(R.mipmap.ic_launcher)
            .setPositiveButton(R.string.add) { dialog, _ ->
                Toast.makeText(activity, binding.taskName.text, Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton(R.string.close) { dialog, _ -> dialog.dismiss() }

        return builder.create()
    }
}
