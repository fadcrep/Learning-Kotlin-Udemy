package com.fadservices.helloworld

import android.app.AlertDialog
import android.app.Dialog
import android.app.DialogFragment
import android.os.Bundle


class FileListDialogFragment : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(activity)

        val inflater= activity.layoutInflater

        builder.setView(inflater.inflate(R.layout.dialog_file_list, null))
                .setPositiveButton("Supprimer", null)
                .setNegativeButton("Annuler", null)
                .setTitle("contenu supprimé")

        return builder.create()
    }

}