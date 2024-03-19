package com.example.task01.model

object CalculatorModel {

    fun add(num1: Double, num2: Double): Double {
        return num1 + num2
    }

    fun subtract(num1: Double, num2: Double): Double {
        return num1 - num2
    }

    fun multiply(num1: Double, num2: Double): Double {
        return num1 * num2
    }

    fun divide(num1: Double, num2: Double): Double {
        if (num2 != 0.0) {
            return num1 / num2
        }
        return Double.NaN
    }
}
