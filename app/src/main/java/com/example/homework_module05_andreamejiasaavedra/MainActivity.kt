package com.example.homework_module05_andreamejiasaavedra

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.homework_module05_andreamejiasaavedra.ui.theme.Homework_Module05_andreamejiasaavedraTheme

class MainActivity : ComponentActivity() {
    var userAnswer = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        Handler(Looper.getMainLooper()).postDelayed({
            question01()
        }, 2000)

    }

    private fun question01() {
        setContentView(R.layout.question_1)

        val userScore: TextView = findViewById(R.id.textView4)
        val choiceAnswer: RadioButton = findViewById(R.id.answerChoice)
        val confirmButton: Button = findViewById(R.id.button01Confirm)

        userScore.text = userAnswer.toString()

        confirmButton.setOnClickListener {
            if (choiceAnswer.isChecked) {
                userAnswer += 100
                userScore.text = userAnswer.toString()
                Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show()
            }
            question02()
        }
    }

    private fun question02() {
        setContentView(R.layout.question_2)

        val userScore: TextView = findViewById(R.id.textView4)
        val choiceAnswer: RadioButton = findViewById(R.id.answer02Choice)
        val confirmButton: Button = findViewById(R.id.button02Confirm)

        userScore.text = userAnswer.toString()

        confirmButton.setOnClickListener {
            if (choiceAnswer.isChecked) {
                userAnswer += 100
                userScore.text = userAnswer.toString()
                Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show()
            }
            question03()
        }

    }

    private fun question03() {
        setContentView(R.layout.question_3)

        val userScore: TextView = findViewById(R.id.textView4)
        val choiceAnswer: RadioButton = findViewById(R.id.choice03Answer)
        val confirmButton: Button = findViewById(R.id.button03Confirm)

        userScore.text = userAnswer.toString()

        confirmButton.setOnClickListener {
            if (choiceAnswer.isChecked) {
                userAnswer += 100
                userScore.text = userAnswer.toString()
                Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show()
            }
            question04()
        }

    }

    private fun question04() {
        setContentView(R.layout.question_4)

        val userScore: TextView = findViewById(R.id.textView4)
        val choiceAnswer: RadioButton = findViewById(R.id.choice04Answer)
        val confirmButton: Button = findViewById(R.id.button04Confirm)

        userScore.text = userAnswer.toString()

        confirmButton.setOnClickListener {
            if (choiceAnswer.isChecked) {
                userAnswer += 100
                userScore.text = userAnswer.toString()
                Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show()
            }
            question05()
        }

    }

    private fun question05() {
        setContentView(R.layout.question_5)

        val userScore: TextView = findViewById(R.id.textView4)
        val choiceAnswer: RadioButton = findViewById(R.id.choice05Answer)
        val confirmButton: Button = findViewById(R.id.button05Confirm)

        userScore.text = userAnswer.toString()

        confirmButton.setOnClickListener {
            if (choiceAnswer.isChecked) {
                userAnswer += 100
                userScore.text = userAnswer.toString()
                Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show()
            }
            question06()
        }

    }

    private fun question06() {
        setContentView(R.layout.question_6)

        val userScore: TextView = findViewById(R.id.textView4)
        val choiceAnswer: RadioButton = findViewById(R.id.choice06Answer)
        val confirmButton: Button = findViewById(R.id.button06Confirm)

        userScore.text = userAnswer.toString()

        confirmButton.setOnClickListener {
            if (choiceAnswer.isChecked) {
                userAnswer += 100
                userScore.text = userAnswer.toString()
                Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show()
            }
            question07()
        }

    }

    private fun question07() {
        setContentView(R.layout.question_7)

        val userScore: TextView = findViewById(R.id.textView4)
        val choiceAnswer: RadioButton = findViewById(R.id.choice07Answer)
        val confirmButton: Button = findViewById(R.id.button07Confirm)

        userScore.text = userAnswer.toString()

        confirmButton.setOnClickListener {
            if (choiceAnswer.isChecked) {
                userAnswer += 100
                userScore.text = userAnswer.toString()
                Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show()
            }
            statistics()
        }

    }

    private fun statistics(){
        setContentView(R.layout.statistics)

        val playAgainButton: Button = findViewById(R.id.buttonPlayAgain)
        val correctAmount: TextView = findViewById(R.id.correctTextView)
        val earningsAmount: TextView = findViewById(R.id.earningsTextView)

        earningsAmount.text = "$" + userAnswer.toString()
        val correctAnswers = (userAnswer / 100).toInt()
        correctAmount.text = "$correctAnswers/7"


        playAgainButton.setOnClickListener {
            userAnswer = 0;
            question01()
        }

    }
}
