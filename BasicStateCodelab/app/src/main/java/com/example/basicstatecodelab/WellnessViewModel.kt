package com.example.basicstatecodelab

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel

class WellnessViewModel : ViewModel() {
    private val _tasks = getWellnessTasksList().toMutableStateList()
    val tasks: List<WellnessTask> get() = _tasks

    fun changeTaskChecked(task: WellnessTask, newValue: Boolean) {
        _tasks.find { it.id == task.id }?.let { task ->
            task.checked = newValue
        }
    }

    fun remove(item: WellnessTask) {
        _tasks.remove(item)
    }
}

private fun getWellnessTasksList() = List(30) { i -> WellnessTask(i, "Task # $i") }