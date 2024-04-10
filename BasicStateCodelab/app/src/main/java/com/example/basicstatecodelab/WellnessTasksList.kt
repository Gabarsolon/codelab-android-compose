package com.example.basicstatecodelab

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun SurveyAnswer() {
    Row {
        Row {
            
        }
    }
}

@Composable
fun WellnessTasksList(
    tasks: List<WellnessTask>,
    onCloseTask: (task: WellnessTask) -> Unit,
    onCheckedChanged: (WellnessTask, Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier) {
        items(items = tasks, key = { task -> task.id }) { task ->
            WellnessTaskItem(
                taskName = task.label,
                onClose = { onCloseTask(task) },
                checked = task.checked,
                onCheckChanged = {checked -> onCheckedChanged(task, checked)},
            )
        }
    }
}