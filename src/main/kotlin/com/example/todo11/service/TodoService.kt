package com.example.todo11.service

import com.example.todo11.RequestVO.AddTodoCommand
import com.example.todo11.entity.Todo

interface TodoService{
    fun getAllTodos(): List<Todo>
    fun addTodo(todo: Todo)
    fun updateTodo(id: Int, finished: Int)
    fun deleteTodo(id: Int)
}