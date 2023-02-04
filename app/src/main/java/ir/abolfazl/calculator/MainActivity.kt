package ir.abolfazl.calculator

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.core.widget.addTextChangedListener
import ir.abolfazl.calculator.databinding.ActivityMainBinding

const val KEY_INTENT_NAME = "data"

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.buttonWebsite.setOnClickListener {

            val address = "https://dunijet.ir"

            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(address))

            startActivity(intent)
        }

        binding.textinputlayoutMain1.setEndIconOnClickListener {

            val txt = binding.textinputlayoutMain1.editText?.text.toString()

            Toast.makeText(this, txt, Toast.LENGTH_SHORT).show()
        }

        binding.textinputlayoutMain1.editText?.addTextChangedListener {

            if (it!!.length > 11) {
                binding.textinputlayoutMain1.error = "شماره اشتباه است!"

            } else {
                binding.textinputlayoutMain1.error = null
            }

        }
        val City = listOf(
            "Tehran",
            "Kerman",
            "Yazd",
            "Rasht",
            "Mashhad",
        )
        val myAdapter = ArrayAdapter(this,R.layout.item_textview,City)
        (binding.textinputlayoutMain1.editText as AutoCompleteTextView).setAdapter(myAdapter)

    }

}
