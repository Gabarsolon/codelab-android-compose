package com.example.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier,
    wellnessViewModel: WellnessViewModel = viewModel(),
) {
    Column(modifier) {
        StatefulCounter()

        val list = wellnessViewModel.tasks
        WellnessTasksList(
            tasks = list,
            onCheckedChanged = { task, newValue ->
                wellnessViewModel.changeTaskChecked(
                    task,
                    newValue
                )
            },
            onCloseTask = { task -> wellnessViewModel.remove(task) }
        )
    }
}
