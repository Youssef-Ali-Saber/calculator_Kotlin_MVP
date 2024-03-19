package com.example.task01.presenter

import com.example.task01.model.CalculatorModel

class MainPresenter(private val view: View) {

    interface View {
        fun displayResult(result: Double)
    }

    fun performAddition(num1: Double, num2: Double) {
        val result = CalculatorModel.add(num1, num2)
        view.displayResult(result)
    }

    fun performSubtraction(num1: Double, num2: Double) {
        val result = CalculatorModel.subtract(num1, num2)
        view.displayResult(result)
    }

    fun performMultiplication(num1: Double, num2: Double) {
        val result = CalculatorModel.multiply(num1, num2)
        view.displayResult(result)
    }

    fun performDivision(num1: Double, num2: Double) {
        val result = CalculatorModel.divide(num1, num2)
        view.displayResult(result)
    }
}
