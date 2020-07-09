package com.example.home_work6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        main = findViewById(R.id.main)
    }

    private var main: TextView? = null

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)

    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {

            R.id.product -> startActivity(Intent(applicationContext, ProductsActivity::class.java))
            R.id.services -> startActivity(Intent(applicationContext, ServicesActivity::class.java))
            R.id.about_applications -> main?.text = getString(R.string.about_product)

        }
         return super.onOptionsItemSelected(item)

}
}






