package kg.kench.counter

interface CounterView {

    fun showCount(count: String)
    fun showToast(message: String)
    fun changeTextColor(color: Int)
    fun resetTextColor()
}