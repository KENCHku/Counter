package kg.kench.counter

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kg.kench.counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CounterView {

    private lateinit var binding: ActivityMainBinding
    private val presenter = Presenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        presenter.initView(this)
        initClick()
    }

    private fun initClick() = with(binding) {
        btnIncrement.setOnClickListener {
            presenter.increment()
        }
        btnDecrement.setOnClickListener {
            presenter.decrement()
        }
    }

    override fun showCount(count: String) {
        binding.tvCount.text = count

    }

    override fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun changeTextColor(color: Int) {
        binding.tvCount.setTextColor(color)
    }

    override fun resetTextColor() {
        binding.tvCount.setTextColor(Color.BLACK)
    }
}