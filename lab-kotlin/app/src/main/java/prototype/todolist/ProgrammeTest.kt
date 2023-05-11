package prototype.todolist

import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import prototype.todolist.data.TaskDao
import prototype.todolist.data.TaskEntry
import prototype.todolist.data.TaskRepository

fun main (){

    val taskrepo = TaskRepository()
    val task1 = TaskEntry(0,"Task 101",1,null)
    taskrepo.save(task1)
    //
    val task2 = TaskEntry(0,"Task 102",1,null)
    taskrepo.save(task2)
    task2.title = "Updated Task 102"
    taskrepo.save(task2)
    taskrepo.delete(9)
    //
    val display = TaskRepository()
    for (item in display.getAllTasks()) {
        println("Title : ${item.title} - ID : ${item.id}  ")
    }

}