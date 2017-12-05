package cc.ava.androidexample

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_tap_counter.*
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class TapCounterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tap_counter)
        val name = intent.extras.getString("name")
        verticalLayout() {
             textView("Welcome to the $name Example")
            {
                textSize = 30F
            }
            val counter = textView("0")
            {
                textSize = 64F
            }
            button("TAP") {
                onClick {
                    counter.text = counter.text.toString().toInt().inc().toString()
                }
            }
            button("RESET") {
                onClick {
                    counter.text = "0"
                }
            }

        }


    }

}
