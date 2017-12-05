package cc.ava.androidexample

import android.app.Activity
import android.os.Bundle
import org.jetbrains.anko.button
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.textView
import org.jetbrains.anko.verticalLayout

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        verticalLayout()
        {
            textView("Welcome to Android example")
            button("Tap Counter") {
                onClick {
                    startActivity<TapCounterActivity>()
                }
            }
            button("ProgressBar demo") {
                onClick {
                    startActivity<ProgressBarActivity>()
                }
            }
        }
    }
}
