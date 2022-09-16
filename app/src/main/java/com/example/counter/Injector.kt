package com.example.counter

import com.example.counter.models.CounterModel
import com.example.counter.presenter.Presenter

class Injector {

    companion object {
        fun getPresenter(): Presenter {
            return Presenter()
        }

        fun getCounterModel(): CounterModel {
            return CounterModel()
        }
    }
}