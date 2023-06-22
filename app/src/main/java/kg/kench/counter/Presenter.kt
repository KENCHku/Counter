package kg.kench.counter

import android.graphics.Color

class Presenter {

    lateinit var view: CounterView
    var model = CounterModel()

    fun increment(){
        model.increment()
        view.showCount(model.count.toString())

        if (model.count == 10) {
            view.showToast("Congratulations!")
        }

        if (model.count == 15) {
            view.changeTextColor(Color.GREEN)
        } else {
            view.resetTextColor()
        }
    }

    fun decrement(){
        model.decrement()
        view.showCount(model.count.toString())
        view.resetTextColor()
    }

    fun initView(view: CounterView){
        this.view = view
    }
}