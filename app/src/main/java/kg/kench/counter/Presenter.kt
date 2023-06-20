package kg.kench.counter

class Presenter {

    lateinit var view: CounterView
    var model = CounterModel()

    fun increment(){
        model.increment()
        view.showCount(model.count.toString())
    }

    fun decrement(){
        model.decrement()
        view.showCount(model.count.toString())
    }

    fun initView(view: CounterView){
        this.view = view
    }
}