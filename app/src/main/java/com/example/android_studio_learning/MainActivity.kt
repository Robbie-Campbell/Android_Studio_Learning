package com.example.android_studio_learning

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log.d
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.content_main.*
import java.net.URL

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        goToAddProduct.setOnClickListener {
            startActivity(Intent(this, AddProductActivity::class.java))
        }


        /* val preferences = getSharedPreferences("database", Context.MODE_PRIVATE)
        val savedName = preferences.getString("savedProductName", "This value does not exist.")
        productName.text = savedName */



        val specialMessage = URL("https://www.youtube.com/redirect?redir_token=gNctk4e23GkQIdhYMwCvzflyXJN8MTU5MjEyNTk0NkAxNTkyMDM5NTQ2&q=https%3A%2F%2Ffinepointmobile.com%2Fapi%2Finventory%2Fv1%2Fmessage&v=KVgYR5LEDrk&event=video_description").readText()
        d("Robbie", "The message is: $specialMessage")
    }
}