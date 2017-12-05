package cc.ava.androidexample

import android.app.Activity
import android.os.Bundle
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick


class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        verticalLayout()
        {
            textView("Welcome to Android example")
            button("Tap Counter") {
                onClick {
                    startActivity<TapCounterActivity>("name" to "Counters")
                }
            }
            button("ProgressBar demo") {
                onClick {
                    startActivity<ProgressBarActivity>()
                }
            }
            button("Browser Demo") {
                onClick {

                    browse("http://kotlintc.com")
                }
            }
        }
    }
}
