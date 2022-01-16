package com.example.todo11.RequestVO

import org.jetbrains.annotations.NotNull

data class UpdateTodoCommand(@get: NotNull val finished: Int)