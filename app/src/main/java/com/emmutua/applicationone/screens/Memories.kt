package com.emmutua.applicationone.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.emmutua.applicationone.R
import com.emmutua.applicationone.data.DataSource
import com.emmutua.applicationone.data.Memory

@Composable
fun Memories() {
    Column {
        LazyColumn(){
            items(DataSource.list){ item ->
                MemoryCard(memory = item)
            }
        }
    }
}


@Composable
fun MemoryCard(memory : Memory) {
    Card(modifier = Modifier.padding(14.dp)) {
        Row(
            modifier = Modifier.padding(5.dp)
        ){
            Column(
                modifier = Modifier.padding(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = stringResource(id = memory.day))
                Text(text = stringResource(id = memory.month))
            }
            if (memory.image == null){
                Text(text = stringResource(id = memory.desc))
            }else{
                Image(painter = painterResource(id = memory.image), contentDescription = null)
            }
        }
    }

}


@Preview(showSystemUi = true)
@Composable
fun MyMemoriesPrev() {
    Memories()
}

@Preview(showBackground = true)
@Composable
fun MyCardPrev() {
    MemoryCard(
        memory =  Memory(
            day = R.string.day1,
            month = R.string.august,
            image = null,
            desc = R.string.desc1
        ),
    )
}
