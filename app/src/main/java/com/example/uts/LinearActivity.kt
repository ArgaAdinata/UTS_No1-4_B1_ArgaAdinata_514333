package com.example.uts

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.uts.databinding.ActivityLinearBinding

class LinearActivity : AppCompatActivity() {
    private val binding: ActivityLinearBinding by lazy {
        ActivityLinearBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")

        binding.txtNama.text = name

        binding.btnKeluar.setOnClickListener {
            Toast.makeText(this, "You have successfully logged out", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ConstraintActivity::class.java)
            startActivity(intent)
        }
    }
}