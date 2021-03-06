package com.github.ddnosh.arabbit.sample.jetpack.livedata

import androidx.lifecycle.ViewModel
import com.github.ddnosh.arabbit.jetpack.livedata.EventMutableLiveData

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
class LiveDataViewModel : ViewModel() {
    private val repository: LiveDataRepository = LiveDataRepository()
    val liveData: EventMutableLiveData<String> = repository.liveData
    fun test() {
        repository.test()
    }
}