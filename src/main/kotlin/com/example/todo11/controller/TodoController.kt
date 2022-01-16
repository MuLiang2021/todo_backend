package com.example.todo11.controller

import com.example.todo11.RequestVO.AddTodoCommand
import com.example.todo11.RequestVO.UpdateTodoCommand
import com.example.todo11.entity.Todo
import com.example.todo11.service.TodoService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/todo")
@CrossOrigin(origins = ["*"])
class TodoController(val todoService: TodoService){

    @GetMapping
    fun getAllTodos(): List<Todo> {
        return todoService.getAllTodos()
    }
    @PostMapping
    fun addTodo(addTodoCommand: AddTodoCommand): Integer{
        val todo = Todo(Integer(1), addTodoCommand.text, 0)
        todoService.addTodo(todo)
        return todo.id
    }

    @PutMapping("{id}")
    fun updateTodo(@PathVariable id: Int, updateTodoCommand: UpdateTodoCommand){
        todoService.updateTodo(id, updateTodoCommand.finished)
    }

    @DeleteMapping("{id}")
    fun updateTodo(@PathVariable id: Int){
        todoService.deleteTodo(id)
    }
}