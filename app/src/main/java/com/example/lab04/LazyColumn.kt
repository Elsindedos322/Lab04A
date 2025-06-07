@Composable
fun ListaTareas(tareas: List<String>) {
    LazyColumn {
        items(tareas.size) { index ->
            Text(text = tareas[index], modifier = Modifier.padding(8.dp))
        }
    }
}
