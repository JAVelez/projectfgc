package com.example.projectfgc.data

import java.io.Serializable

data class characterFields(
    val name: String,
    val imageName: Int,
    var moveList: MutableList<priorityMoveFields>,
    val ss: String
) : Serializable