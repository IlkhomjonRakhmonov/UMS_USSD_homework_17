package uz.rakhmonov.i.homework_17

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun setActionBarTitle(title: String?) {
        supportActionBar!!.title = title
    }

}