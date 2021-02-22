package fr.esme.esme_map

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.squareup.picasso.Picasso
import fr.esme.esme_map.model.User

class UserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        val user: User? = Gson().fromJson(intent.getStringExtra("USER"), User::class.java)

        findViewById<TextView>(R.id.userName).text = user?.username
        Picasso.get().load(user?.imageUrl).into(findViewById<ImageView>(R.id.userImage))

    }
}