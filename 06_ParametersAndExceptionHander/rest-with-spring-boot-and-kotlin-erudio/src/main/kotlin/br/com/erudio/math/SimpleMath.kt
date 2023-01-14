package br.com.erudio.math

import kotlin.math.pow
import kotlin.math.sqrt
class SimpleMath {
        fun sum(numberOne: Double, numberTwo: Double) = numberOne + numberTwo
        fun subtraction(numberOne: Double, numberTwo: Double) = numberOne - numberTwo
        fun division(numberOne: Double, numberTwo: Double) = numberOne / numberTwo
        fun multiplication(numberOne: Double, numberTwo: Double) = numberOne * numberTwo
        fun pow(numberOne: Double, numberTwo: Double) = numberOne.pow(numberTwo)
        fun mean(numberOne: Double, numberTwo: Double) = (numberOne + numberTwo) / 2
        fun squareRoot(numberOne: Double) = sqrt(numberOne)
    }
