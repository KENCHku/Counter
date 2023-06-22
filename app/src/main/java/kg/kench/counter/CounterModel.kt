package kg.kench.counter

import android.widget.Toast

class CounterModel {

    var count = 0

    fun increment(){
        count++
    }

    fun decrement(){
        count--
    }
}