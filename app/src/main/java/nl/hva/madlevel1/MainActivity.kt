package nl.hva.madlevel1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        textViewHeaderFirstRow.text = Html.fromHtml(getString(R.string.first_row))
        textViewHeaderSecondRow.text = Html.fromHtml(getString(R.string.second_row))
        submitButton.setOnClickListener {
            checkAnswers()
        }
    }

    private fun checkAnswers() {
        var result = true
        if (editText1.text.toString() != "T") result = false
        if (editText2.text.toString() != "F") result = false
        if (editText3.text.toString() != "F") result = false
        if (editText4.text.toString() != "F") result = false

        val textToShow = if (result) "Correct!"
        else "Not correct..."

        Toast.makeText(this, textToShow, Toast.LENGTH_SHORT).show()
    }

}