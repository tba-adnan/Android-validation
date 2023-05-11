package prototype.todolist.data

import androidx.annotation.Nullable


data class TaskEntry (
    var id: Int,
    var title: String,
    var priority: Int,
    var timestamp: Long?
)

