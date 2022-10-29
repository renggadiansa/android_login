package com.example.mylogin

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.mylogin.R.id.*

class wellcome : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wellcome)

        lateinit var diceImage: ImageView
        lateinit var diceimage2: ImageView


        val rollButton: Button = findViewById(R.id.roll_button)
        val rollButton2: Button = findViewById(R.id.roll_button2)
        val cekbutton: Button = findViewById(R.id.cek_button)
        val htr: Button = findViewById(R.id.hapus)
        htr.setOnClickListener{
            val tt = Intent(this@wellcome,History::class.java)
            startActivity(tt)
        }
        rollButton.setOnClickListener { rollDice() }
        rollButton2.setOnClickListener { rollDice2() }
        cekbutton.setOnClickListener { cekbutton ()}
        diceImage = findViewById(R.id.dice_Image)
        diceimage2 = findViewById(R.id.dice_Image2)
    }


    private fun rollDice(){
        val resulltText: TextView = findViewById(R.id.result_Text)
        val diceImage: ImageView = findViewById(R.id.dice_Image)
        val diceImage2: ImageView = findViewById(R.id.dice_Image2)


        val randomInt = (1..6).random()
        // Toast.makeText(this, "Roll Clicked",
        //   Toast.LENGTH_SHORT).show()

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val randomInt2 = (1..6).random()
        val drawableResource2 = when (randomInt2) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }
        resulltText.text = randomInt.toString()
        resulltText.text = randomInt2.toString()
        diceImage.setImageResource(drawableResource)
        diceImage2.setImageResource(drawableResource2)

        val hasil = randomInt + randomInt2.toInt()
        resulltText.text = hasil.toString()


    }
    private fun rollDice2(){
        val randomInt = (1..6).random()
        //  Toast.makeText(this, "Roll Clicked",
        //     Toast.LENGTH_SHORT).show()
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val randomInt2 = (1..6).random()
        val drawableResource2 = when (randomInt2) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val resultText2: TextView = findViewById(result_text2)
        val diceImage: ImageView = findViewById(R.id.dice_Image)
        val diceImage2: ImageView = findViewById(R.id.dice_Image2)
        resultText2.text = randomInt.toString()
        resultText2.text = randomInt2.toString()
        diceImage.setImageResource(drawableResource)
        diceImage2.setImageResource(drawableResource2)

        val hasil = randomInt + randomInt2.toInt()
        resultText2.text = hasil.toString()


    }

    internal class Book (var resultText: String, var title: String)

    private fun cekbutton () {
        val resultText : TextView = findViewById(result_Text)
        val resultText2 : TextView = findViewById(result_text2)
        val hasilhitung : EditText = findViewById(hasilhitung)
        val jawab : TextView = findViewById(R.id.jawab)



        val a = resultText.text.toString().toInt()
        val b = resultText2.text.toString().toInt()
        val hasil = a + b
        val input = hasilhitung.getText().toString()
        if (input.isEmpty()) {
            hasilhitung.error="Eitss Harus Diisi Yaaa"
        } else {

            val akhinput: Int = input.toInt()
            if (akhinput==hasil) {
                val bookList = ArrayList<Book>()


                Toast.makeText(this, "Horee Benarrr, jadi KITA PACARAN", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Yahhh Salahhh, gajadi PACARAN dong", Toast.LENGTH_SHORT).show()
            }
        }

    }



}