package cc.ava.androidexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.progressBar
import org.jetbrains.anko.sdk25.coroutines.onDrag
import org.jetbrains.anko.sdk25.coroutines.onSeekBarChangeListener

import org.jetbrains.anko.seekBar
import org.jetbrains.anko.toast
import org.jetbrains.anko.verticalLayout
import org.jetbrains.anko.textView

class ProgressBarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress_bar)

        verticalLayout()
        {
            val msg = textView() {
                textSize = 24F
            }
            seekBar() {
                onSeekBarChangeListener {
                    onProgressChanged { seekBar, progress, fromUser ->
                        msg.text = progress.toString()
                    }

                }
            }
        }
    }
}
