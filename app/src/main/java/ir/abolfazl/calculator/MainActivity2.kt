package ir.abolfazl.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ir.abolfazl.calculator.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding : ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)

        setContentView(binding.root)

        if (intent.getStringExtra(KEY_INTENT_NAME) != null){

            val textFromActivity1 = intent.getStringExtra(KEY_INTENT_NAME)

            binding.txtshowdata.text = textFromActivity1

        }

    }
}