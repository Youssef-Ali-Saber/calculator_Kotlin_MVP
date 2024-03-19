package com.example.task01

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.task01.presenter.MainPresenter

class MainActivity : AppCompatActivity(), MainPresenter.View {

    private lateinit var presenter: MainPresenter
    private lateinit var num1EditText: EditText
    private lateinit var num2EditText: EditText
    private lateinit var addButton: Button
    private lateinit var subtractButton: Button
    private lateinit var multiplyButton: Button
    private lateinit var divideButton: Button
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainPresenter(this)

        num1EditText = findViewById(R.id.editTextNum1)
        num2EditText = findViewById(R.id.editTextNum2)
        addButton = findViewById(R.id.buttonAdd)
        subtractButton = findViewById(R.id.buttonSubtract)
        multiplyButton = findViewById(R.id.buttonMultiply)
        divideButton = findViewById(R.id.buttonDivide)
        resultTextView = findViewById(R.id.textViewResult)

        addButton.setOnClickListener {
            presenter.performAddition(
                num1EditText.text.toString().toDouble(),
                num2EditText.text.toString().toDouble()
            )
        }

        subtractButton.setOnClickListener {
            presenter.performSubtraction(
                num1EditText.text.toString().toDouble(),
                num2EditText.text.toString().toDouble()
            )
        }

        multiplyButton.setOnClickListener {
            presenter.performMultiplication(
                num1EditText.text.toString().toDouble(),
                num2EditText.text.toString().toDouble()
            )
        }

        divideButton.setOnClickListener {
            presenter.performDivision(
                num1EditText.text.toString().toDouble(),
                num2EditText.text.toString().toDouble()
            )
        }
    }

    override fun displayResult(result: Double) {
        resultTextView.text = "Result: $result"
    }
}
