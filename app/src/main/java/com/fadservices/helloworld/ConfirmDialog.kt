package com.fadservices.helloworld

import android.app.AlertDialog
import android.app.Dialog
import android.app.DialogFragment
import android.content.DialogInterface
import android.os.Bundle
import android.util.Log

class ConfirmDialog : DialogFragment() {

    interface  ConfirmDialogListener{
        fun OnDialogPositiveClick()
        fun OnDialogNegativeClick()
    }
    val TAG= ConfirmDialog::class.java.simpleName
    var listener: ConfirmDialogListener?=null

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder= AlertDialog.Builder(activity)
        builder.setMessage("Supprimer tout le contenu du message?")
                .setPositiveButton("oh oui ", object:DialogInterface.OnClickListener{
                    override fun onClick(dialog: DialogInterface?, id: Int) {
                        Log.i(TAG, "Youpi on va tout casser")
                    }

                })
                .setNegativeButton("Euh...non", DialogInterface.OnClickListener { dialog, i ->
                    Log.i(TAG, "bon ben ce sera pour la prochaine fois")
                })


        return builder.create()
    }
}