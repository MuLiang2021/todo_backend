package com.example.todo11.mapper

import com.example.todo11.RequestVO.AddTodoCommand
import com.example.todo11.entity.Todo
import org.apache.ibatis.annotations.*

@Mapper
interface TodoMapper{

    @Select("select id,text,finished from todo")
    fun getAllTodos(): List<Todo>
    @Insert("insert into todo values (null, #{text}, 0)")
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
    fun addTodo(todo: Todo)
    @Update("update todo set finished = #{finished} where id = #{id}")
    fun updateTodo(id: Int, finished: Int)
    @Select("select id,text,finished from todo where id = #{id}")
    fun getTodoById(id: Int): Todo

}