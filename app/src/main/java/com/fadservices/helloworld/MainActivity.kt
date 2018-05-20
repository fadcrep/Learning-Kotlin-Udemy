package com.fadservices.helloworld

import android.app.FragmentManager
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton= my_button
        val user=User("fad", 25)

        myButton.setOnClickListener {
           /* val intent=Intent(this, GreenActivity::class.java)
            intent.putExtra("user", user)
            startActivity(intent) */
            val dialog= ConfirmDialog()
            dialog.listener= object: ConfirmDialog.ConfirmDialogListener{
                override fun OnDialogPositiveClick() {
                    Log.i("MainActivity", "OnPositiveClick")


                    val fileListeFragment = FileListDialogFragment ()
                    fileListeFragment.show(fragmentManager, "FileList")

                }

                override fun OnDialogNegativeClick() {
                    Log.i("MainActivity", "OnNegativeClick")

                }

            }
            dialog.show(fragmentManager,"dialog")
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.menu_main,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.action_add -> {
                Toast.makeText(this, "Ajouter", Toast.LENGTH_SHORT).show()
            }

            R.id.action_business ->{
                Toast.makeText(this, "Business", Toast.LENGTH_SHORT).show()
            }

            else -> return  super.onOptionsItemSelected(item)
        }

        return true

    }

}
