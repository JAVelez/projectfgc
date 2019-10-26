package com.example.projectfgc.data

import java.io.Serializable


data class priorityMoveFields (
    val moveName: String,                       //  Move name
    val moveInput: String,                      //  Move's input
    val hitProperty: List<String>,                    //  Where does the move hit (LMH)
    val speed: Int,                             //  Startup frames :: !natural will display speed in between () ex. (10)
    val onBlock: Int,                           //  Frames when the move hits a blocking opponent
    val onHit: String,                          //  Opponent's state after being hit with the move (knockdown, launch, +-frames)
    val onCounterHit: String,                   //  Opponent's state after being hit with the move on COUNTERHIT (knockdown, launch, +-frames)
    val dmg: List<Int>,                         //  The base damage of the move(s) (does not include rage or counterhit)
    //val gif: Int                              //  Store gif information of get drawable or something
    val natural: Boolean,
    val crouch: Boolean,
    val forceCrouch: Boolean,
    var totalDmg: Int,                          //  stores sum of dmg to display and use in priority calculations
    var priority: Int                           //  stores value of priority to be sorted by
) : Serializable