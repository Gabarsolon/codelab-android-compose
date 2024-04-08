package com.example.basicstatecodelab

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier


@Composable
fun WellnessTasksList(
    tasks: List<WellnessTask>,
    onCloseTask: (task: WellnessTask) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier) {
        items(items = tasks, key = { task -> task.id }) { task ->
            WellnessTaskItem(taskName = task.label, onClose = { onCloseTask(task) })
        }
    }
}