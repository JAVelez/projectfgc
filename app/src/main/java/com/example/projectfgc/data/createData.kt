package com.example.projectfgc.data

import com.example.projectfgc.R

object createData {

    val c: String = "CRUMPLE"
    val k: String = "KND"
    val la: String = "LAUNCH"
    val ls: String = "SCREW"
    val l: String = "low"
    val lg: String = "low grounded" //  low attack that finishes grounded
    val m: String = "mid"
    val mg: String = "mid grounded" //  mid attack that finishes grounded
    val h: String = "high"
    //val hg: String = "high grounded"
    val s: String = "special"



    fun initCharacters(): MutableList<characterFields> {
        val emptyMovesList = getEmptyMovesList()

        val charList = mutableListOf<characterFields>()
        charList.add( characterFields("Akuma", R.drawable.akuma, emptyMovesList) )
        charList.add( characterFields( "Alisa Bosconovitch", R.drawable.alisa, emptyMovesList ) )
        charList.add( characterFields( "Anna Williams", R.drawable.anna, emptyMovesList ) )
        charList.add( characterFields( "Armor King", R.drawable.armor_king, emptyMovesList ) )
        charList.add( characterFields( "Asuka Kazama", R.drawable.asuka, emptyMovesList ) )
        charList.add( characterFields( "Bob Richards", R.drawable.bob, emptyMovesList ) )
        charList.add( characterFields( "Bryan Fury", R.drawable.bryan, emptyMovesList ) )
        charList.add( characterFields( "Claudio Serafino", R.drawable.claudio, emptyMovesList ) )
        charList.add( characterFields( "Craig Marduk", R.drawable.marduk, emptyMovesList ) )
        charList.add( characterFields( "Devil Jin", R.drawable.devil_jin, emptyMovesList ) )
        charList.add( characterFields( "Eddy Gordo", R.drawable.eddy, emptyMovesList ) )
        charList.add( characterFields( "Eliza", R.drawable.eliza, emptyMovesList ) )
        charList.add( characterFields( "Feng Wei", R.drawable.feng, emptyMovesList ) )
        charList.add( characterFields( "Geese Howard", R.drawable.geese, emptyMovesList ) )
        charList.add( characterFields( "Gigas", R.drawable.gigas, emptyMovesList ) )
        charList.add( characterFields( "Heihachi Mishima", R.drawable.heihachi, emptyMovesList ) )
        charList.add( characterFields( "Hworarang", R.drawable.hwoarang, emptyMovesList ) )
        charList.add( characterFields( "Jack 7", R.drawable.jack, emptyMovesList ) )
        charList.add( characterFields( "Jin Kazama", R.drawable.jin, emptyMovesList ) )
        charList.add( characterFields( "Josie Rizal", R.drawable.josie, emptyMovesList ) )
        charList.add( characterFields( "Julia Chang", R.drawable.julia, emptyMovesList ) )
        charList.add( characterFields( "Katarina Alves", R.drawable.katarina, emptyMovesList ) )
        charList.add( characterFields( "Kazumi Mishima", R.drawable.kazumi, emptyMovesList ) )
        charList.add( characterFields( "Kazuya Mishima", R.drawable.kazuya, emptyMovesList ) )
        charList.add( characterFields( "King", R.drawable.king, emptyMovesList ) )
        charList.add( characterFields( "Kuma", R.drawable.kuma, emptyMovesList ) )
        charList.add( characterFields( "Lars Alexander", R.drawable.lars, emptyMovesList ) )
        charList.add( characterFields( "Lee Chaolan", R.drawable.lee, emptyMovesList ) )
        charList.add( characterFields( "Lei Wulong", R.drawable.lei, emptyMovesList ) )
        charList.add( characterFields( "Leo Kliesen", R.drawable.leo, emptyMovesList ) )
        charList.add( characterFields( "Lili de Rochefort", R.drawable.lili, emptyMovesList ) )
        charList.add( characterFields( "Ling Xiaoyu", R.drawable.ling, emptyMovesList ) )
        charList.add( characterFields( "Lucky Chloe", R.drawable.lucky_chloe, emptyMovesList ) )
        charList.add( characterFields( "Marshall Law", R.drawable.law, emptyMovesList ) )
        charList.add( characterFields( "Master Raven", R.drawable.master_raven, emptyMovesList ) )
        charList.add( characterFields( "Miguel Caballero Rojo", R.drawable.miguel, emptyMovesList ) )
        charList.add( characterFields( "Negan", R.drawable.negan, emptyMovesList ) )
        charList.add( characterFields( "Nina Williams", R.drawable.nina, emptyMovesList ) )
        charList.add( characterFields( "Noctis Lucis Caelum", R.drawable.noctis, emptyMovesList ) )
        charList.add( characterFields( "Panda", R.drawable.panda, emptyMovesList ) )
        charList.add( characterFields( "Paul Phoenix", R.drawable.paul, emptyMovesList ) )
        charList.add( characterFields( "Sergei Dragunov", R.drawable.dragunov, emptyMovesList ) )
        charList.add( characterFields( "Shaheen", R.drawable.shaheen, emptyMovesList ) )
        charList.add( characterFields( "Steve Fox", R.drawable.steve, emptyMovesList ) )
        charList.add( characterFields( "Yoshimitsu", R.drawable.yoshimitsu, emptyMovesList ) )
        charList.add( characterFields( "Zafina", R.drawable.zafina, emptyMovesList ) )
        charList.add( characterFields( "Mokujin", R.drawable.mokujin, emptyMovesList ) )

        //  Add them in order for more efficient code
        //val result = charList.sortedWith(compareBy{ it.name })

        return charList
    }

    fun setCharMovesList(char: characterFields): characterFields {
        when(char.name){
            "Akuma" -> char.moveList = getEmptyMovesList()

            "Alisa Bosconovitch" -> char.moveList = getEmptyMovesList()

            "Anna Williams" -> char.moveList = getEmptyMovesList()

            "Armor King" -> char.moveList = getEmptyMovesList()

            "Asuka Kazama" -> char.moveList = getEmptyMovesList()

            "Bob Richards" -> char.moveList = getEmptyMovesList()

            "Bryan Fury" -> char.moveList = getBryanMovesList()

            "Claudio Serafino" -> char.moveList = getEmptyMovesList()

            "Craig Marduk" -> char.moveList = getMardukMovesList()

            "Devil Jin" -> char.moveList = getEmptyMovesList()

            "Eddy Gordo" -> char.moveList = getEmptyMovesList()

            "Eliza" -> char.moveList = getEmptyMovesList()

            "Feng Wei" -> char.moveList = getEmptyMovesList()

            "Geese Howard" -> char.moveList = getEmptyMovesList()

            "Gigas" -> char.moveList = getEmptyMovesList()

            "Heihachi Mishima" -> char.moveList = getHeihachiMovesList()

            "Hworarang" -> char.moveList = getEmptyMovesList()

            "Jack 7" -> char.moveList = getEmptyMovesList()

            "Jin Kazama" -> char.moveList = getEmptyMovesList()

            "Josie Rizal" -> char.moveList = getEmptyMovesList()

            "Julia Chang" -> char.moveList = getEmptyMovesList()

            "Katarina Alves" -> char.moveList = getEmptyMovesList()

            "Kazumi Mishima" -> char.moveList = getEmptyMovesList()

            "Kazuya Mishima" -> char.moveList = getEmptyMovesList()

            "King" -> char.moveList = getEmptyMovesList()

            "Kuma" -> char.moveList = getEmptyMovesList()

            "Lars Alexander" -> char.moveList = getEmptyMovesList()

            "Lee Chaolan" -> char.moveList = getEmptyMovesList()

            "Lei Wulong" -> char.moveList = getEmptyMovesList()

            "Leo Kliesen" -> char.moveList = getEmptyMovesList()

            "Lili de Rochefort" -> char.moveList = getEmptyMovesList()

            "Ling Xiaoyu" -> char.moveList = getEmptyMovesList()

            "Lucky Chloe" -> char.moveList = getEmptyMovesList()

            "Marshall Law" -> char.moveList = getEmptyMovesList()

            "Master Raven" -> char.moveList = getEmptyMovesList()

            "Miguel Caballero Rojo" -> char.moveList = getEmptyMovesList()

            "Negan" -> char.moveList = getEmptyMovesList()

            "Nina Williams" -> char.moveList = getEmptyMovesList()

            "Panda" -> char.moveList = getEmptyMovesList()

            "Paul Phoenix" -> char.moveList = getEmptyMovesList()

            "Sergei Dragunov" -> char.moveList = getEmptyMovesList()

            "Shaheen" -> char.moveList = getEmptyMovesList()

            "Steve Fox" -> char.moveList = getEmptyMovesList()

            "Yoshimitsu" -> char.moveList = getEmptyMovesList()

            "Zafina" -> char.moveList = getEmptyMovesList()

            "Mokujin" -> char.moveList = getMokujinMovesList()

        }
        return char
    }

    fun getBryanMovesList(): MutableList<priorityMoveFields>{
        val result = mutableListOf<priorityMoveFields>()

        //                           name input prop speed onB onH onCH dmg natural crouch forceCrouch totaldmg propoerty
        result.add( getCompleteMove(priorityMoveFields( "", "1", h, 10, +1, "+8", "+8", listOf(7), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "1, 2", h, 10, -2, "+5", "+5", listOf(7, 8), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "One Two Body Blow", "1, 2, 1", m, 10, -6, "+6", c, listOf(7, 8, 18), false, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "One Two Low Kick", "1, 2, 3", l, 10, -12, "+2", k, listOf(7, 8, 15), false, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "One Two High Kick", "1, 2, 4", h, 10, -3, k, k, listOf(7, 8, 24), false, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "1, 4", h, 10, -7, "+4", "+4", listOf(7, 14), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "1, 4, 2", h, 10, -7, "+4", c, listOf(7, 14, 18), false, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "1, 4, 2, 1", h, 10, -7, c, c, listOf(7, 14, 18, 17), false, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Lair's Dance", "1, 4, 2, 1, 2", h, 10, -9, k, k, listOf(7, 14, 18, 17, 22), false, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Cremation", "1, 4, 2, 1, 4", m, 10, -5, k, k, listOf(7, 14, 18, 17, 21), false, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Lair's Dance (cancel)", "1, 4, 2, 1, u or d", s, 10, -10, "+1", c, listOf(7, 14, 18, 17, 0), false, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Whipping Fury", "1, 4, 2, 4", m, 10, -5, k, k, listOf(7, 14, 18, 21), false, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "1, 4, 3", m, 10, -10, "+1", "+1", listOf(7, 14, 15), false, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Running Blind", "1, 4, 3, 3", h, 10, -7, "+7", "+7", listOf(7, 14, 15, 18), false, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "2", h, 10, +1, "+7", "+7", listOf(10), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "PK Combination", "2, 3", m, 10, -10, "+6", "+6", listOf(10, 14), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "3", m, 16, -4, "+7", "+7", listOf(14), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "3, 2", m, 16, -10, "+1", "+1", listOf(14, 11), false, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "3, 2, 1", m, 16, -9, "+2", "+2", listOf(14, 11, 10), false, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Mid Kick to Rush", "3, 2, 1, 2", m, 16, -10, k, k, listOf(14, 11, 10, 14), false, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Gatling Combination", "3, 2, 1, 4", l, 16, -11, "0", "0", listOf(14, 11, 10, 12), false, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "3, 3", h, 16, -6, "+6", "+6", listOf(14, 13), false, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Anaconda Bite", "3, 3, 2", h, 16, -7, la, la, listOf(14, 13, 20), false, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Anaconda Rage", "3, 3, 4", m, 16, -12, k, k, listOf(14, 13, 25), false, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "4", h, 12, -7, "+6", la, listOf(15), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "4, 3", m, 12, -10, "+2", "+2", listOf(15, 12), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Double Spin Tomahawk", "4, 3, 4", m, 12, -12, k, k, listOf(15, 12, 16), false, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Double Spin Tomahawk", "4, 3, 4(hold)", m, 12, -9, k, k, listOf(15, 12, 25), false, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Triple Spin Kick", "4, 3, f4", h, 12, -5, "+6", k, listOf(15, 12, 18), false, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "1+2", m, 17, -7, "+6", "+5 (back turned)", listOf(16), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Snake Pit", "1+2, 2", m, 17, -14, k, k, listOf(16, 20), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Middle Side Kick", "3+4", m, 18, -13, k, c, listOf(20), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "f+2", m, 15, -10, "+1", "+1", listOf(10), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "f+2, 1", m, 15, -10, "+1", "+1", listOf(10, 12), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Right Left to Spin Kick", "f+2, 1, 4", m, 15, -13, k, k, listOf(10, 12, 20), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Knee Strike", "f+3", m, 16, 0, "+2", c, listOf(18), true, false, false, 0, 0 ) ) ) // On hit value is +1~3
        result.add( getCompleteMove(priorityMoveFields( "", "f+4", m, 18, -9, "0", "0", listOf(10), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Boa Crusher", "f+4, 1", m, 18, -13, la, la, listOf(10, 10), true, false, true, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Side Step Elbow", "f+1+2", h, 22, -+8, k, k, listOf(22), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Gravity Blow", "f+1+4", "!", 28, -12, "-12", "-12", listOf(21), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "d/f+1", m, 15, -5, "+1", "+1", listOf(8), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "d/f+1, 1", m, 15, -10, "-4", "-4", listOf(8, 2), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "d/f+1, 1, 1", m, 15, -10, "-4", "-4", listOf(8, 2, 2), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Vulcan Cannon", "d/f+1, 1, 1, 1", m, 15, -10, "-4", "-4", listOf(8, 2, 2, 2), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Double Body Blow", "d/f+1, 1, 1, 1, 2", m, 15, -15, "+1", k, listOf(8, 2, 2, 2, 20), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "d/f+2", m, 13, -6, "+5", "+5", listOf(12), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Blackout Combo", "d/f+2, 1", h, 13, -4, "+4", "+4", listOf(12, 11), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Blackout Trap", "d/f+2, 3", m, 13, -13, k, c, listOf(12, 20), false, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Snake Edge", "d/f+3", l, 29, -26, la, la, listOf(20), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Wolf's Tail", "d/f+4", m, 22, -5, k, k, listOf(23), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "d+2", m, 14, -2, "+8", "+8", listOf(17), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Python Crush", "d+2, 3", m, 14, -10, k, la, listOf(17, 21), false, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "d+3", l, 16, -11, "0", "0", listOf(10), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Quick Low Screw Punch", "d+3, 2", h, 16, -7, k, k, listOf(10, 22), false, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Low Kick", "d+4", l, 15, -11, "0", "0", listOf(13), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "d+1+2 (first hit)", m, 17, -10, "+3", "+3", listOf(10), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "d+1+2 (both hits)", m, 17, -10, "+3", "+3", listOf(10, 15), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Hammer Drive Hatchet", "d+1+2, 3", l, 17, -13, "+4", k, listOf(10, 15, 20), false, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "d+1+2, f (cd)", s, 17, -1, "+10", "+10", listOf(10, 15, 0), false, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "d+1+2, b (sway)", s, 17, -8, "+3", "+3", listOf(10, 15, 0), false, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "d+3+4", l, 19, -12, "-1", "+4", listOf(15), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Side Low Knuckle Whip", "d+3+4 ,2", m, 19, -12, k, k, listOf(15, 23), false, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "d+3+4 ,2, d/b (cancel)", s, 19, -23, "-12", "-7", listOf(15, 23, 0), false, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Stomach Blow", "d/b+2", m, 15, -6, "+8", "+8", listOf(13), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Sweeper Kick", "d/b+3", l, 16, -12, "-1", "+4", listOf(11), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Crash Impact", "d/b+1+2", m, 15, -13, k, k, listOf(14, 25), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Chopping Elbow", "b+1", m, 20, +4, "+7", la, listOf(21), true, false, false, 0, 0 ) )  ) // force crouch?
        result.add( getCompleteMove(priorityMoveFields( "", "b+2", h, 17, -7, "+4", c, listOf(18), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Double Back Knuckle", "b+2, 1", h, 17, 0, c, c, listOf(18, 17), false, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Hands of Doom", "b+2, 1, 2", h, 17, -9, k, k, listOf(18, 17, 22), false, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Wolf Bite", "b+2, 1, 4", m, 17, -5, k, k, listOf(18, 17, 21), false, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "b+2, 1, u or d", s, 17, -10, "+1", c, listOf(18, 17, 0), false, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Wolf Call", "b+2, 4", m, 17, -5, k, k, listOf(18, 21), false, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "b+3", m, 19, -7, "+4", "+4", listOf(12), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "b+3, 2", h, 19, -4, "+7", "+7", listOf(12, 12), true, false, false, 0, 0 ) ) ) // verify natural
        result.add( getCompleteMove(priorityMoveFields( "", "b+3, 2, 1", m, 19, -4, "+2", "+2", listOf(12, 12, 10), true, false, false, 0, 0 ) ) ) // verify natural
        result.add( getCompleteMove(priorityMoveFields( "Front Kick to Rush", "b+3, 2, 1, 2", m, 19, -10, k, k, listOf(12, 12, 10, 14), false, false, false, 0, 0 ) ) ) // verify natural
        result.add( getCompleteMove(priorityMoveFields( "Run For Cover", "b+3, 2, 1, 4", l, 19, -11, "0", "0", listOf(12, 12, 10, 12), false, false, false, 0, 0 ) ) ) // verify natural
        result.add( getCompleteMove(priorityMoveFields( "", "b+3, 4", m, 19, -12, "-2", "-2", listOf(12, 18), false, false, false, 0, 0 ) ) ) // verify natural
        result.add( getCompleteMove(priorityMoveFields( "Front Kick to Double Hammer", "b+3, 1+2", m, 19, -6, "+4", k, listOf(12, 25), false, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "b+3, 1+2, d", s, 19, -6, "+4", k, listOf(12, 25, 0), false, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "b+3, f or d/f", s, 19, +1, "+12", "+12", listOf(12, 0), false, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Knee Break", "b+4", m, 16, -10, "+15", "+15", listOf(18), true, false, false, 0, 0 ) ) )
        //result.add( priorityMoveFields( "Parry", "b+1+3 or b+2+4", m, 16, -10, "+15", "+15", 18, false, false, false ) )
        //result.add( priorityMoveFields( "When Parrying 2", "1", h, 13, -10, k, k, 30, false, false, false ) )
        //result.add( priorityMoveFields( "When Parrying 2", "2", m, 15, -5, "+7", "+7", 22, false, false, false ) )
        result.add( getCompleteMove(priorityMoveFields( "Meteor Smash", "b+1+4", "!", 53, 0, k, k, listOf(45), true, false, false, 0, 0 ) )  )  //  unblockable
        result.add( getCompleteMove(priorityMoveFields( "Hook", "(u/b or u or u/f)+2", h, 15, -12, "+9", "+9", listOf(17), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "u/b+1+2", m, 15, -16, "-6", "-6", listOf(5, 2), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "u/b+1+2 (second hit miss)", m, 15, -18, "-7", "-7", listOf(5), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "u/b+1+2, 1", m, 15, -13, "-3", "-3", listOf(5, 2, 2), true, false, false, 0, 0 ) )  )//  verify natural
        result.add( getCompleteMove(priorityMoveFields( "", "u/b+1+2, 1, 2", m, 15, -13, "-3", "-3", listOf(5, 2, 2, 2), true, false, false, 0, 0 ) ) ) //  verify natural
        result.add( getCompleteMove(priorityMoveFields( "", "u/b+1+2, 1, 2, 1", m, 15, -13, "-3", "-3", listOf(5, 2, 2, 2, 2), true, false, false, 0, 0 ) )  )//  verify natural
        result.add( getCompleteMove(priorityMoveFields( "", "u/b+1+2, 1, 2, 1, 2", m, 15, -16, "-6", "-6", listOf(5, 2, 2, 2, 2, 2), true, false, false, 0, 0 ) ) ) //  verify natural
        result.add( getCompleteMove(priorityMoveFields( "", "u/b+1+2, 1, 2, 1, 2, 1", m, 15, -13, "-3", "-3", listOf(5, 2, 2, 2, 2, 2, 2), true, false, false, 0, 0 ) ) ) //  verify natural
        result.add( getCompleteMove(priorityMoveFields( "", "u/b+1+2, 1, 2, 1, 2, 1, 2", m, 15, -16, "-6", "-6", listOf(5, 2, 2, 2, 2, 2, 2, 2), true, false, false, 0, 0 ) ) ) //  verify natural
        result.add( getCompleteMove(priorityMoveFields( "", "u/b+1+2, 1, 2, 1, 2, 1, 2, 1", m, 15, -13, "-3", "-3", listOf(5, 2, 2, 2, 2, 2, 2, 2, 2), true, false, false, 0, 0 ) )  )//  verify natural
        result.add( getCompleteMove(priorityMoveFields( "", "u/b+1+2, 1, 2, 1, 2, 1, 2, 1, 2", m, 15, -16, "-6", "-6", listOf(5, 2, 2, 2, 2, 2, 2, 2, 2, 2), true, false, false, 0, 0 ) )  )//  verify natural
        result.add( getCompleteMove(priorityMoveFields( "", "u/b+1+2, 1, 2, 1, 2, 1, 2, 1, 2, 1", m, 15, -32, "-15", "-15", listOf(5, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2), true, false, false, 0, 0 ) ) ) //  verify natural
        result.add( getCompleteMove(priorityMoveFields( "Gatling Rush", "u/b+1+2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 4", m, 15, -13, k, k, listOf(5, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 14), true, false, false, 0, 0 ) ) ) //  verify natural

        result.add( getCompleteMove(priorityMoveFields( "Rolling Driver", "u or u/f+3", m, 27, 0, k, k, listOf(15), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Orbital Heel Kick", "u+4", m, 24, -5, l, l, listOf(21), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Orbital Heel Kick", "u/f+4", m, 24, -5, l, l, listOf(22), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Mach Breaker", "f, f+2", h, 14, -9, k, k, listOf(32), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Slash Kick", "f, f+3", m, 23, -13, k, k, listOf(25), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Slash Kick (Hold)", "f, f+3", m, 34, +8, k, k, listOf(33), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Mach Kick", "f, f+4", h, 16, -10, k, k, listOf(32), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Jet Uppercut", "f, b+2", h, 14, -7, la, la, listOf(20), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Wedge Driver", "b, d/f+4", l, 29, -13, "+14", k, listOf(25), true, false, false, 0, 0 ) ) )
        //result.add( priorityMoveFields( "Wedge Driver (cancel)", "b, d/f+4, b", s, 29, 0, "", "", 25, true, false, false ) ) // verify - frames
        result.add( getCompleteMove(priorityMoveFields( "Flying Knee Kick", "b, b+4", m, 21, -19, "+8", "+8", listOf(24), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Snake Slash", "f, f, f+3", m, 22, +9, k, k, listOf(30), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Left Upper", "WS+1", m, 15, -16, l, l, listOf(20), true, true, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "WS+2", m, 19, -10, "+1", "+1", listOf(18), true, true, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Fisherman Slam", "WS+2, b or f+2", m, 19, -10, l, l, listOf(18, 25), true, true, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "WS+3", m, 12, -10, "+4", l, listOf(18), true, true, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Double High Knee Kick", "WS+3, 4", m, 12, -10, "+4", "+29", listOf(18, 25), false, true, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "WS+4", m, 11, -6, "+5", "+5", listOf(16), true, true, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "WS+1+2", m, 10, -5, "+6", "+6", listOf(12), true, true, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "FC+d/f+2", m, 13, -8, "+4", "+4", listOf(12), true, true, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Snake Rampage", "FC+d/f+2, 1", h, 13, -8, k, k, listOf(12, 25), true, true, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Northern Cross", "FC+d/f+4", m, 15, -10, "+13", ls, listOf(21), true, true, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Hellraiser", "SS+1", h, 17, -5, c, c, listOf(23), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "SS+2", m, 20, -6, k, k, listOf(20), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Shock & Awe", "SS+2, 3", l, 20, -13, "+5", k, listOf(20, 20), false, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Left Upper (from sway)", "qcf+1", m, 17, -16, l, l, listOf(20), true, false, false, 0, 0 ) )   ) //  may be 15 frame startup
        result.add( getCompleteMove(priorityMoveFields( "", "qcf+2", h, 16, -6, "+4", "+4", listOf(18), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Cross Bazooka", "qcf+2, 1", m, 16, -11, k, k, listOf(18, 26), false, false, false, 0, 0 ) )  ) //  verify natural
        result.add( getCompleteMove(priorityMoveFields( "Requiem", "qcf+1+2", m, 17, -12, k, k, listOf(28), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "qcf+3", m, 14, -10, "+4", l, listOf(18), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Double High Knee Kick (from sway)", "WS+3, 4", m, 14, -10, "+4", "+29", listOf(18, 25), false, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "qcf+4", m, 20, -5, "+1", "+3", listOf(13), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "qcf+4, 1", h, 20, 0, c, c, listOf(13, 14), false, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "qcf+4, 1, d or u (cancel)", s, 20, -11, "-5", "-3", listOf(13, 14, 0), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Snake Spin Mach Breaker", "qcf+4, 1, 2", h, 20, -9, k, k, listOf(13, 14, 22), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Snake Spin Middle Kick", "qcf+4, 1, 4", m, 20, -5, k, k, listOf(13, 14, 21), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "qcb+2", m, 17, -9, "+6", "+6", listOf(16), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Smash & Mach Kick", "qcb+2, 4", h, 17, -10, k, l, listOf(16, 25), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Hatchet Kick", "qcb+3", l, 19, -13, "+4", k, listOf(21), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Kickoff", "qcb+4", m, 17, -12, l, l, listOf(23), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Taunt", "1+3+4", "!", 28, +16, "+16", "+16", listOf(0), true, false, false, 0, 0 ) ) )
        result.add( getDickJab())

        return result
    }

    fun getMardukMovesList(): MutableList<priorityMoveFields>{
        val result = mutableListOf<priorityMoveFields>()
//        result.add( priorityMoveFields( "Jab", "1", h, 10, 1, "+8", "+8", 7, true, false, false ) )
//        result.add( priorityMoveFields( "Left Right Combo", "1, 2", h, 10, 1, "+5", "+5", 12, true, false, false ) )
//        result.add( priorityMoveFields( "Left Right Combo to Ready Position", "1, 2, 3+4", "STANCE", 10, -3, "+3", "+3", 0, true, false, false ) ) // Parecen numeros inventados
//        result.add( priorityMoveFields( "Left Right Combo to Gut Check", "1, 2, 3", m, 10, -16, "-5", "-5", 12, false, false, false ) )
//        result.add( priorityMoveFields( "Left Right Combo to Gut Check 4", "1, 2, 3, 1+2", m, 10, 0, "+4", "+4", 28, false, false, false ) )
//        result.add( priorityMoveFields( "Left Right to Power Elbow Combo", "1, 2, f+1", h, 10, 4, "+6", k, 21, false, false, false ) )
//        result.add( priorityMoveFields( "Jab Body Combo", "1, d+2", m, 10, -9, "+7", "+7", 13, true, false, false ) )


        return result
    }

    fun getHeihachiMovesList(): MutableList<priorityMoveFields>{

        val result = mutableListOf<priorityMoveFields>()

        result.add( getCompleteMove(priorityMoveFields( "", "1", 				h,	10,	+1	,"+8"	,"+8"	, listOf(7), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "1, 1", 				h,	10,	-1	,"+8"	,"+8"	, listOf(7,6), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Flash Punch Combo", "1, 1, 2", 				m,	10,	-17	,k	,k	, listOf(7,6,12	), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "1, 2", 				h,	10,	-1	,"+7"	,"+7"	, listOf(7,8), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Demon Slayer", "1, 2, 2", 				h,	10,	-12	,"+4"	,"+4"	, listOf(7,8,12), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Demon Executioner", "1, 2, 2~1+2", 			m,	10,	-6	,k	,k	, listOf(7,8,25), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "1, 2, 2~1+2 u or d", 		s,	10,	-16	,"-9"	,"-9"	, listOf(7,8), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Demon Kicker", "1, 2, 4", 				h,	10,	-9	,k	,ls	, listOf(7,8,21), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "1, b+2", 				m,	10,	-2	,"+8"	,"+8"	, listOf(7,21),	 true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Demon Massacre", "1, b+2, 1", 			m,	10,	-15	,k	,k	, listOf(7,21,20), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Demon Lair", "1, b+2, 4", 			m,	10,	+5	,k	,k	, listOf(7,21,30), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "2", 				h,	10,	0	,"+9"	,"+9"	, listOf(10), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Demon Backhand Spin", "2, 2", 				h,	10,	-13	,"-2"	,"-2"	, listOf(10,18), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Quick Executioner", "2, 2~1+2", 			m,	10,	-6	,k	,k	, listOf(10,25), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "2, 2~1+2 u or d", 			s,	10,	-14	,"-5"	,"-5"	, listOf(10), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "3", 				h,	14,	-10	,"+1"	,"+1"	, listOf(15), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Monzenbarai", "3, 4", 				m,	14,	-14	,"+3"	,ls	, listOf(15,20), true, false, false, 0, 0 ) ) )			//ch prop
        result.add( getCompleteMove(priorityMoveFields( "", "4", 				h,	16,	-9	,k	,ls	, listOf(21), true, false, false, 0, 0 ) ) )			//ch
        result.add( getCompleteMove(priorityMoveFields( "Demon Scissors", "4~3 or WS+4~3", 			mg,	36,	-11	,k	,k	, listOf(25), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Demon Breath", "1+2", 				m,	12,	-12	,k	,k	, listOf(25), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "f+2", 				h,	15,	-9	,"+2"	,"+2"	, listOf(13), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Pressure Point", "f+2, 3", 				m,	15,	-3	,k	,c	, listOf(13,20), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Demon Shout", "f+2~1+2", 				m,	17,	-6	,k	,k	, listOf(25), true, false, false, 0, 0 ) ) )
        //result.add( getCompleteMove(priorityMoveFields( "", "f+2~1+2 u or d (cancel)", 	s,	16,
        result.add( getCompleteMove(priorityMoveFields( "Lightning Crush", "f+3", 				m,	18,	-3	,k	,c	, listOf(20), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Right Splits Kick", "f+4", 				m,	19,	+4	,"+7"	,k	, listOf(20),	 true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Chrome Dome", "f+1+2", 				h,	12,	-14	,k	,k	, listOf(15),	 true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "d/f+1", 				m,	13,	-1	,"+9"	,"+9"	, listOf(10),	 true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Double Palm Strike", "d/f+1, 1", 			h,	13,	-2	,"+4"	,"+4"	, listOf(10,8),	 true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Musso Tetsui", "d/f+1, 2", 			m,	13,	-13	,k	,k	, listOf(10,24), true, false, true, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "d/f+2", 				m,	15,	-7	,"+4"	,la	, listOf(14), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "d/f+4", 				m,	12,	-6	,"+5"	,"+5"	, listOf(15),	 true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "d/f+1+2", 				m,	24,	-14	,k	,k	, listOf(25),	 true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Hammer Punch", "d+1", 				m,	17,	-9	,"+2"	,"+2"	, listOf(16),	 true, false, false, 0, 0 ) ) )
        //result.add( getCompleteMove(priorityMoveFields( "", "d+1, D", 			m,	17,	-9	,"+2"	,"+2"	, listOf(16),	 true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Hammer Breathing", "d+1, 2", 				m,	17,	-9	,"+6"	,k	, listOf(16,17), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Jichinsai", "d+3 or d/f+3+4", 			m,	22,	-7	,k	,k	, listOf(25), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "d+4",				l,	12,	-13,	"-2",	"-2",   listOf(7),	 true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "d+1+4", 				"!,",	60,	0	,k	,k	, listOf(50),	 true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "d+2+3", 				"!",	63,	0	,"-3"	,"-3"	, listOf(0), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Eishomon (HASHISH)", "d/b+2", 				l,	23,	-18	,"+5"	,"+5"	, listOf(23),	 true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Angekisai", "d/b+1+2", 				m,	21,	-13	,"+5"	,"+5"	, listOf(10,20), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "b+1", 				h,	15,	-11	,"-5"	,"-5"	, listOf(14), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Funkei Uraken", "b+1, 2", 				h,	15,	-9	,"+15"	,k	, listOf(14,20), true, false, false, 0, 0 ) ) )			//verify ch prop
        result.add( getCompleteMove(priorityMoveFields( "Funkei Goshoha", "b+1, 2~1+2", 			m,	15,	-6	,k	,k	, listOf(14,25), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "b+1, 2~1+2 u or d", 		s,	15,	-19	,"-13"	,"-13"	, listOf(14), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Rashomon", "b+2", 				m,	22,	-2	,k	,k	, listOf(20),	 true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "b+3", 				h,	14,	-4	,"+7"	,"+7"	, listOf(14),	 true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Hooking Crescent Kick", "b+3, 3", 				m,	14,	-12	,k	,k	, listOf(14,25), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Shingetsusen", "b+4", 				m,	18,	-9	,k	,k	, listOf(20),	 true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "b+1+2", 				m,	19,	-9	,"+2"	,"+2"	, listOf(17),	 true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Twin Hammer Volley", "b+1+2, 1+2", 			m,	19,	-13	,k	,k	, listOf(18,24), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "u/f+3", 				m,	28,	-10	,k	,k	, listOf(17),	 true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Hell Axle", "u/f+3, 4", 			m,	28,	+3	,k	,k	, listOf(17,20),	 true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Wind Slicer", "u/f+4", 				m,	24,	-5	,k	,k	, listOf(25),	 true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Demon Uppercut", "f, F+2", 				m,	20,	-16	,la	,la	, listOf(22),	 true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Left Split Kick", "f, F+3", 				m,	21,	-3	,k	,k	, listOf(25),	 true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "b, f+2", 				m,	15,	-7	,"+4"	,"+4"	, listOf(12),	 true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Tenma Destroyer", "b, f+2, 1", 			h,	15,	-9	,k	,k	, listOf(12,24),	 true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Subjagator", "b, f+2, 2", 			m,	15,	-12	,"+1"	,k	, listOf(12,21), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Tenma Barrage", "b, f+2, 3", 			h,	15,	-9	,k	,k	, listOf(12,20),	 true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Deity Slayer", "b, B+1+2", 			m,	36,	+8	,k	,k	, listOf(25),	 true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Shadow Step", "b, B+3+4", 			    s,  0,  0,  "0", "0", listOf(0), false, false, false, 0, 0) ) )
        result.add( getCompleteMove(priorityMoveFields( "Iron Hand", "qcf+2", 				m,	15,	-17	,k	,k	, listOf(30),	 true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Leaping Side Kick", "f, f, f+3", 			m,	22,	+9	,k	,k	, listOf(30),	 true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Quick Iron Fist", "WS+1", 				m,	14,	-14	,k	,k	, listOf(20),	 true, true, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Dark Thrust", "WS+2", 				m,	18,	-6	,"+11"	,k	, listOf(20),		 true, true, false, 0, 0 ) ) )	// verify ch prop
        result.add( getCompleteMove(priorityMoveFields( "", "WS+3", 				m,	18,	-11	,"0"	,"0"	, listOf(10),	 true, true, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Holy Demon Cross", "WS+3,1+2", 			m,	18,	-14	,la	,la	, listOf(10,20),	 true, true, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "WS+4", 				m,	11,	-3	,"+8"	,"+8"	, listOf(13),	 true, true, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Tsunami Kick", "WS+4, 4", 				m,	11,	-15	,"0"	,"0"	, listOf(13,16),	 true, true, true, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Crouching Dragon Kick", "FC+d/f+4", 			l,	19,	-23	,k	,k	, listOf(20),	 true, true, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "SS+2", 				m,	19,	-9	,"-1"	,"-1"	, listOf(10),	 true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Kidney Crush Combo", "SS+2, 1", 				m,	19,	-14	,c	,c	, listOf(10,20), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Gas Stomp", "Opponent Down, d+4", 		l,	19,	-14	,"-3"	,"-3"	, listOf(24),	 true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Auger", "2+3+4", 				s,	19, 0,  "0", "0", listOf(0), false, false, false, 0, 0) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "When ki-charged d, u, u or u/f+3", m,	28,	-10	,k	,k	, listOf(36),	 true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "When ki-charged d, u, u or u/f+3, 4",	m,	28,	+1	,k	,k	, listOf(36,24), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Raijin Stance", "f+3+4", 		s,	20, 0,  "0", "0", listOf(0), false, false, false, 0, 0) ) )
        //result.add( getCompleteMove(priorityMoveFields( "", "f+3+4, u or d", 			s,	20,
        result.add( getCompleteMove(priorityMoveFields( "", "RAI 1", 				h,	37,	-2	,k	,c	, listOf(20),	 true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "RAI 2", 				m,	35,	-13	,k	,k	, listOf(20),	 true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "RAI 2, 1", 			m,  35,	-17	,k	,k	, listOf(20,23),	 true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "RAI 1+2", 			    "!",    76,	+20 ,c	,c	, listOf(35),	 true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Crouch Dash", "f, n, d, D/F", 			s,	56, 0,  "0", "0", listOf(0), false, false, false, 0, 0) ) )
        result.add( getCompleteMove(priorityMoveFields( "Dragon Uppercut", "f, n, d, d/f+1", 			m,	22,	-15	,k	,k	, listOf(25),	 true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Dragon Uppercut (Blue Spark)", "f, n, d/f+1", 			m,	21,	-10	,la	,la	, listOf(35),	 true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Wind God Fist", "f, n, d, d/F+2", 			h,	15,	-10	,la	,la	, listOf(20),	 true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Electric Wind God Fist", "f, n, d, d/f+2", 			h,	14,	+5	,la	,la	, listOf(23),	 true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Jumping Mid Kick", "f, n, d, d/f+3", 			m,	30,	+7	,k	,k	, listOf(30),	 true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "f, n, d, D/F+3", 			l,	37,	-23	,k	,k	, listOf(24),	 true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "f, n, d, d/f+4", 			l,	19,	-23	,"+5"	,k	, listOf(15),	 true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Spinning Dragon Uppercut", "f, n, d, d/f+4, 1", 			m,	19,	-15	, k, k, listOf(15),	 false, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "f, n, d, d/f+4, 4", 		l,	19,	-10	,k	,k	, listOf(15,10), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "f, n, d, d/f+4, 4 (Single hit)",	l,	19,	-10	,"+3"	,k	, listOf(15,10), true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Spinning Demon", "f, n, d, d/f+4, 4, 4", 		l,	19,	-10	,k	,k	, listOf(15,10,8),	 true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "f, n, d, d/f+4, 4, 4 (Single hit)",l,	19,	-10	,"+3"	,k	, listOf(15,10,8),	 true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "HS n, 1", 				m,	28,	-15	,k	,k	, listOf(20),	 true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "", "HS n, 4", 				m,	28,	-3	,"+8"	,"+8"	, listOf(10),	 true, false, false, 0, 0 ) ) )
        result.add( getCompleteMove(priorityMoveFields( "Tsunami Kick", "HS n, 4, 4", 			m,	28,	-16	,"-5"	,"-5"	, listOf(10,20), true, false, true, 0, 0 ) ) )

        result.add( getDickJab())


        return result
    }

    fun getMokujinMovesList(): MutableList<priorityMoveFields>{
        val result = mutableListOf<priorityMoveFields>()
        //                    name  inpt  prop speed onB onH onCH dmg natural crouch forceCrouch
        // mids
        result.add( priorityMoveFields( "-9f", "1", m, 50, -9, "0", "0", listOf(0), false, false, false, 0, 0 ) )
        result.add( priorityMoveFields( "-10f", "1", m, 50, -10, "0", "0", listOf(0), false, false, false, 0, 0 ) )
        result.add( priorityMoveFields( "-11f", "1", m, 50, -11, "0", "0", listOf(0), false, false, false, 0, 0 ) )
        result.add( priorityMoveFields( "-12f", "1", m, 50, -12, "0", "0", listOf(0), false, false, false, 0, 0 ) )
        result.add( priorityMoveFields( "-13f", "1", m, 50, -13, "0", "0", listOf(0), false, false, false, 0, 0 ) )
        result.add( priorityMoveFields( "-14f", "1", m, 50, -14, "0", "0", listOf(0), false, false, false, 0, 0 ) )
        result.add( priorityMoveFields( "-15f", "1", m, 50, -15, "0", "0", listOf(0), false, false, false, 0, 0 ) )
        result.add( priorityMoveFields( "-16f", "1", m, 50, -16, "0", "0", listOf(0), false, false, false, 0, 0 ) )
        result.add( priorityMoveFields( "-17f", "1", m, 50, -17, "0", "0", listOf(0), false, false, false, 0, 0 ) )
        result.add( priorityMoveFields( "-18f", "1", m, 50, -18, "0", "0", listOf(0), false, false, false, 0, 0 ) )
        result.add( priorityMoveFields( "-19f", "1", m, 50, -19, "0", "0", listOf(0), false, false, false, 0, 0 ) )
        result.add( priorityMoveFields( "-20f", "1", m, 50, -20, "0", "0", listOf(0), false, false, false, 0, 0 ) )
        result.add( priorityMoveFields( "-21f", "1", m, 50, -21, "0", "0", listOf(0), false, false, false, 0, 0 ) )
        result.add( priorityMoveFields( "-22f", "1", m, 50, -22, "0", "0", listOf(0), false, false, false, 0, 0 ) )
        result.add( priorityMoveFields( "-23f", "1", m, 50, -23, "0", "0", listOf(0), false, false, false, 0, 0 ) )
        result.add( priorityMoveFields( "-24f", "1", m, 50, -24, "0", "0", listOf(0), false, false, false, 0, 0 ) )

        // lows
        result.add( priorityMoveFields( "-9low", "1", l, 50, -9, "0", "0", listOf(0), false, false, false, 0, 0 ) )
        result.add( priorityMoveFields( "-10low", "1", l, 50, -10, "0", "0", listOf(0), false, false, false, 0, 0 )  )
        result.add( priorityMoveFields( "-11low", "1", l, 50, -11, "0", "0", listOf(0), false, false, false, 0, 0 )  )
        result.add( priorityMoveFields( "-12low", "1", l, 50, -12, "0", "0", listOf(0), false, false, false, 0, 0 )  )
        result.add( priorityMoveFields( "-13low", "1", l, 50, -13, "0", "0", listOf(0), false, false, false, 0, 0 )  )
        result.add( priorityMoveFields( "-14low", "1", l, 50, -14, "0", "0", listOf(0), false, false, false, 0, 0 )  )
        result.add( priorityMoveFields( "-15low", "1", l, 50, -15, "0", "0", listOf(0), false, false, false, 0, 0 )  )
        result.add( priorityMoveFields( "-16low", "1", l, 50, -16, "0", "0", listOf(0), false, false, false, 0, 0 )  )
        result.add( priorityMoveFields( "-17low", "1", l, 50, -17, "0", "0", listOf(0), false, false, false, 0, 0 )  )
        result.add( priorityMoveFields( "-18low", "1", l, 50, -18, "0", "0", listOf(0), false, false, false, 0, 0 )  )
        result.add( priorityMoveFields( "-19low", "1", l, 50, -19, "0", "0", listOf(0), false, false, false, 0, 0 )  )
        result.add( priorityMoveFields( "-20low", "1", l, 50, -20, "0", "0", listOf(0), false, false, false, 0, 0 )  )
        result.add( priorityMoveFields( "-21low", "1", l, 50, -21, "0", "0", listOf(0), false, false, false, 0, 0 )  )
        result.add( priorityMoveFields( "-22low", "1", l, 50, -22, "0", "0", listOf(0), false, false, false, 0, 0 )  )
        result.add( priorityMoveFields( "-23low", "1", l, 50, -23, "0", "0", listOf(0), false, false, false, 0, 0 )  )
        result.add( priorityMoveFields( "-24low", "1", l, 50, -24, "0", "0", listOf(0), false, false, false, 0, 0 )  )
        // mids that force crouch
        result.add( priorityMoveFields( "-9f FC", "1", m, 50, -9, "0", "0", listOf(0), false, false, true, 0, 0 ) )
        result.add( priorityMoveFields( "-10f FC", "1", m, 50, -10, "0", "0", listOf(0), false, false, true , 0, 0 ) )
        result.add( priorityMoveFields( "-11f FC", "1", m, 50, -11, "0", "0", listOf(0), false, false, true , 0, 0 ) )
        result.add( priorityMoveFields( "-12f FC", "1", m, 50, -12, "0", "0", listOf(0), false, false, true , 0, 0 ) )
        result.add( priorityMoveFields( "-13f FC", "1", m, 50, -13, "0", "0", listOf(0), false, false, true , 0, 0 ) )
        result.add( priorityMoveFields( "-14f FC", "1", m, 50, -14, "0", "0", listOf(0), false, false, true , 0, 0 ) )
        result.add( priorityMoveFields( "-15f FC", "1", m, 50, -15, "0", "0", listOf(0), false, false, true, 0, 0 ) )
        result.add( priorityMoveFields( "-16f FC", "1", m, 50, -16, "0", "0", listOf(0), false, false, true , 0, 0 ) )



        return result
    }

    fun getEmptyMovesList(): MutableList<priorityMoveFields>{
        val result = mutableListOf<priorityMoveFields>()
        result.add(
            priorityMoveFields(
                "",
                "",
                "",
                0,
                0,
                "",
                "",
                listOf(0),
                false,
                false,
                false,
                0,
                0
            )
        )
        return result
    }

    fun getCompleteMove(move: priorityMoveFields): priorityMoveFields{
        for (d in move.dmg){
            move.totalDmg = move.totalDmg + d
        }

        //  Determine priority based on hit property and total string damage
        when(move.onHit){
            "LAUNCH" -> move.priority = 100 + move.totalDmg
            "CRUMPLE" -> move.priority = 90 + move.totalDmg
            "SCREW" -> move.priority = 80 + move.totalDmg
            "KND" -> move.priority = 60 + move.totalDmg
            "+15" -> move.priority = 40 + move.totalDmg
            "+14" ->  move.priority = 38 + move.totalDmg
            "+13" -> move.priority = 36 + move.totalDmg
            "+12" -> move.priority = 34 + move.totalDmg
            "+11" -> move.priority = 32 + move.totalDmg
            "+10" -> move.priority = 30 + move.totalDmg
            "+9" -> move.priority = 28 + move.totalDmg
            "+8" -> move.priority = 26 + move.totalDmg
            "+7" -> move.priority = 24 + move.totalDmg
            "+6" -> move.priority = 22 + move.totalDmg
            "+5" -> move.priority = 20 + move.totalDmg
            "+4" -> move.priority = 18 + move.totalDmg
            "+3" -> move.priority = 16 + move.totalDmg
            "+2" -> move.priority = 14 + move.totalDmg
            "+1" -> move.priority = 12 + move.totalDmg
            "0" -> move.priority = 10 + move.totalDmg
            else -> move.priority = move.totalDmg
        }

        return move
    }

    fun getDickJab() : priorityMoveFields{
        return priorityMoveFields( "Left dick jab", "FC, d+1", m, 10, -5, "+6", "+6", listOf(5), true, true, false, 5, 0)
    }


}