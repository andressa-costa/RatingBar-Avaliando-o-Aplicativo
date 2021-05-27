package br.com.flap.projetocomratingbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var texto: TextView
    lateinit var ratingBar: RatingBar
    lateinit var botao: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.valorSelecionado)
        ratingBar = findViewById(R.id.ratingBar)
        botao = findViewById(R.id.button)

        ratingBar.setOnRatingBarChangeListener {
            ratingBar, rating, fromUser -> rating
            texto.text = "" + rating
        }
        botao.setOnClickListener {
            Toast.makeText(applicationContext, "Valor selecionado"  + ratingBar.rating, Toast.LENGTH_LONG).show()

        }
    }
}