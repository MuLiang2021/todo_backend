package com.example.todo11.service.impl

import com.example.todo11.entity.Todo
import com.example.todo11.mapper.TodoMapper
import com.example.todo11.service.TodoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service("todoService")
class TodoServiceImpl : TodoService {

    @Autowired
    private lateinit var todoMapper: TodoMapper

    override fun getAllTodos(): List<Todo> {
        return todoMapper.getAllTodos()
    }

    override fun addTodo(todo: Todo) {
         todoMapper.addTodo(todo)
    }

    override fun updateTodo(id: Int,finished: Int) {
        todoMapper.updateTodo(id, finished)
    }

}