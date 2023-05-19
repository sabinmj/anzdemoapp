package com.sabin.anzdemoapp.ui.launch

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.sabin.anzdemoapp.data.model.SpaceXLaunchesModel
import com.sabin.anzdemoapp.ui.base.UiState
import com.sabin.anzdemoapp.viewmodel.MainViewModel


@Composable
fun LaunchScreen(viewModel: MainViewModel = hiltViewModel()) {
    val uiState by viewModel.uiState.collectAsState()

    when (uiState) {
        is UiState.Loading -> {
            // Show loading state
            ShowProgressBar()
        }
        is UiState.Success -> {
            val launches = (uiState as UiState.Success<List<SpaceXLaunchesModel>>).data
            // Use the list of launches here
            LaunchList(launches)
        }
        is UiState.Error -> {
            val error = (uiState as UiState.Error).message
            // Show error state
        }
    }
}

@Composable
fun ShowProgressBar() {
    Box(modifier = Modifier.fillMaxSize()) {
        CircularProgressIndicator()
    }
}


@Composable
fun LaunchList(launches: List<SpaceXLaunchesModel>) {
    // Display the list of launches here

    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(launches) { launch ->
            Card(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {

                    Text(
                        text = launch.mission_name,
                        style = MaterialTheme.typography.h4,
                        textAlign = TextAlign.Center
                    )

                    Text(
                        text = "Launch Date: ${launch.launch_date_local}",
                        style = MaterialTheme.typography.body1
                    )

                    Text(
                        text = "Launch Location: ${launch.launch_site.site_name}",
                        style = MaterialTheme.typography.body1
                    )

                    Text(
                        text = "Status: ${launch.launch_success}",
                        style = MaterialTheme.typography.body1
                    )
                }
            }

        }
    }
}
