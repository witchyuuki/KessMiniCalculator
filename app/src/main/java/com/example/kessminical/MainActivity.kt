package com.example.kessminical

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        PLUS.setOnClickListener {
            var eiei06 = 0
            var kess1 = num1.text.toString()
            val kess01 = kess1.toInt()
            var kess2 = num2.text.toString()
            val kess02 = kess2.toInt()
            if (kess2 == "" || kess1 == "") {
                Toast.makeText(
                    applicationContext,
                    "iput num 1 and num2 ",
                    Toast.LENGTH_SHORT
                ).show()
            }
            else {
                val kess02 = kess2.toInt()
                eiei06 = kess01 + kess02
                var eiei009 = eiei06.toDouble()
                eiei007.setText(eiei009.toString())
                numeiei007.setText("+")
            }
            CLEAR.setOnClickListener {
                num1.setText("")
                num2.setText("")
                eiei007.setText("")
                numeiei007.setText("")
            }
            MINUS.setOnClickListener {
                var eiei06 = 0
                var kess1 = num1.text.toString()
                val kess01 = kess1.toInt()
                var kess2 = num2.text.toString()
                val kess02 = kess2.toInt()
                if (kess2 == "" || kess1 == "") {
                    Toast.makeText(
                        applicationContext,
                        "iput num 1 and num2 ",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    val kess02 = kess2.toInt()
                    eiei06 = kess01 - kess02
                    var eiei009 = eiei06.toDouble()
                    eiei007.setText(eiei009.toString())
                    numeiei007.setText("-")
                }
                MULTIPLY.setOnClickListener {
                    var eiei06 = 0
                    var kess1 = num1.text.toString()
                    val kess01 = kess1.toInt()
                    var kess2 = num2.text.toString()
                    val kess02 = kess2.toInt()
                    if (kess2 == "" || kess1 == "") {
                        Toast.makeText(
                            applicationContext,
                            "iput num 1 and num2 ",
                            Toast.LENGTH_SHORT
                        ).show()

                    } else {
                        val kess02 = kess2.toInt()
                        eiei06 = kess01 * kess02
                        var eiei009 = eiei06.toDouble()
                        eiei007.setText(eiei009.toString())
                        numeiei007.setText("*")
                    }
                    DIVIDER.setOnClickListener {
                        var eiei06 = 0
                        var kess1 = num1.text.toString()
                        val kess01 = kess1.toInt()
                        var kess2 = num2.text.toString()
                        val kess02 = kess2.toInt()
                        if (kess2 == "" || kess1 == "") {
                            Toast.makeText(
                                applicationContext,
                                "iput num 1 and num2 ",
                                Toast.LENGTH_SHORT
                            ).show()
                        } else if (kess02 == 0) {
                            Toast.makeText(
                                applicationContext,
                                "Do Not Num2 Is Zero Or Null!!",
                                Toast.LENGTH_SHORT
                            ).show()
                            num2.setText("")
                        } else {
                            val kess02 = kess2.toInt()
                            eiei06 = kess01 / kess02
                            var eiei009 = eiei06.toDouble()
                            eiei007.setText(eiei009.toString())
                            numeiei007.setText("/")
                        }

                        MODULO.setOnClickListener {
                            var eiei06 = 0
                            var kess1 = num1.text.toString()
                            val kess01 = kess1.toInt()
                            var kess2 = num2.text.toString()
                            val kess02 = kess2.toInt()
                            if (kess2 == "" || kess1 == "") {
                                Toast.makeText(
                                    applicationContext,
                                    "iput num 1 and num2 ",
                                    Toast.LENGTH_SHORT
                                ).show()
                            } else if (kess02 == 0) {
                                Toast.makeText(
                                    applicationContext,
                                    "Do Not Num2 Is Zero Or Null!!",
                                    Toast.LENGTH_SHORT
                                ).show()
                                num2.setText("")
                            } else {
                                val kess02 = kess2.toInt()
                                eiei06 = kess01 % kess02
                                var eiei009 = eiei06.toDouble()
                                eiei007.setText(eiei009.toString())
                                numeiei007.setText("%")
                            }
                        }
                    }
                }
            }
        }
    }
}
