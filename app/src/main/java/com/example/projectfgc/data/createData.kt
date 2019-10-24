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

            "Heihachi Mishima" -> char.moveList = getEmptyMovesList()

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

        //                           name input prop speed onB onH onCH dmg natural crouch forceCrouch
        result.add( priorityMoveFields( "", "1", h, 10, +1, "+8", "+8", 7, true, false, false ) )
        result.add( priorityMoveFields( "", "1, 2", h, 10, -2, "+5", "+5", 8, true, false, false ) )
        result.add( priorityMoveFields( "One Two Body Blow", "1, 2, 1", m, 10, -6, "+6", c, 18, false, false, false ) )
        result.add( priorityMoveFields( "One Two Low Kick", "1, 2, 3", l, 10, -12, "+2", k, 15, false, false, false ) )
        result.add( priorityMoveFields( "One Two High Kick", "1, 2, 4", h, 10, -3, k, k, 24, false, false, false ) )
        result.add( priorityMoveFields( "", "1, 4", h, 10, -7, "+4", "+4", 14, true, false, false ) )
        result.add( priorityMoveFields( "", "1, 4, 2", h, 10, -7, "+4", c, 18, false, false, false ) )
        result.add( priorityMoveFields( "", "1, 4, 2, 1", h, 10, -7, c, c, 17, false, false, false ) )
        result.add( priorityMoveFields( "Lair's Dance", "1, 4, 2, 1, 2", h, 10, -9, k, k, 22, false, false, false ) )
        result.add( priorityMoveFields( "Lair's Dance (cancel)", "1, 4, 2, 1, u or d", s, 10, -10, "+1", c, 18, false, false, false ) )
        result.add( priorityMoveFields( "Whipping Fury", "1, 4, 2, 4", m, 10, -5, k, k, 21, false, false, false ) )
        result.add( priorityMoveFields( "Cremation", "1, 4, 2, 1, 4", m, 10, -5, k, k, 21, false, false, false ) )
        result.add( priorityMoveFields( "", "1, 4, 3", m, 10, -10, "+1", "+1", 15, false, false, false ) )
        result.add( priorityMoveFields( "Running Blind", "1, 4, 3, 3", h, 10, -7, "+7", "+7", 18, false, false, false ) )
        result.add( priorityMoveFields( "", "2", h, 10, +1, "+7", "+7", 10, true, false, false ) )
        result.add( priorityMoveFields( "PK Combination", "2, 3", m, 10, -10, "+6", "+6", 14, true, false, false ) )
        result.add( priorityMoveFields( "", "3", m, 16, -4, "+7", "+7", 14, true, false, false ) )
        result.add( priorityMoveFields( "", "3, 2", m, 16, -10, "+1", "+1", 11, false, false, false ) )
        result.add( priorityMoveFields( "", "3, 2, 1", m, 16, -9, "+2", "+2", 10, false, false, false ) )
        result.add( priorityMoveFields( "Mid Kick to Rush", "3, 2, 1, 2", m, 16, -10, k, k, 14, false, false, false ) )
        result.add( priorityMoveFields( "Gatling Combination", "3, 2, 1, 4", l, 16, -11, "0", "0", 12, false, false, false ) )
        result.add( priorityMoveFields( "", "3, 3", h, 16, -6, "+6", "+6", 13, false, false, false ) )
        result.add( priorityMoveFields( "Anaconda Bite", "3, 3, 2", h, 16, -7, la, la, 20, false, false, false ) )
        result.add( priorityMoveFields( "Anaconda Rage", "3, 3, 4", m, 16, -12, k, k, 25, false, false, false ) )
        result.add( priorityMoveFields( "", "4", h, 12, -7, "+6", la, 15, true, false, false ) )
        result.add( priorityMoveFields( "", "4, 3", m, 12, -10, "+2", "+2", 12, true, false, false ) )
        result.add( priorityMoveFields( "Double Spin Tomahawk", "4, 3, 4", m, 12, -12, k, k, 16, false, false, false ) )
        result.add( priorityMoveFields( "Double Spin Tomahawk", "4, 3, 4(hold)", m, 12, -9, k, k, 25, false, false, false ) )
        result.add( priorityMoveFields( "Triple Spin Kick", "4, 3, f4", h, 12, -5, "+6", k, 18, false, false, false ) )
        result.add( priorityMoveFields( "", "1+2", m, 17, -7, "+6", "+5 (back turned)", 16, true, false, false ) )
        result.add( priorityMoveFields( "Snake Pit", "1+2, 2", m, 17, -14, k, k, 20, true, false, false ) )
        result.add( priorityMoveFields( "Middle Side Kick", "3+4", m, 18, -13, k, c, 20, true, false, false ) )
        result.add( priorityMoveFields( "", "f+2", m, 15, -10, "+1", "+1", 10, true, false, false ) )
        result.add( priorityMoveFields( "", "f+2, 1", m, 15, -10, "+1", "+1", 12, true, false, false ) )
        result.add( priorityMoveFields( "Right Left to Spin Kick", "f+2, 1, 4", m, 15, -13, k, k, 20, true, false, false ) )
        result.add( priorityMoveFields( "Knee Strike", "f+3", m, 16, 0, "+2", c, 18, true, false, false ) ) // On hit value is +1~3
        result.add( priorityMoveFields( "", "f+4", m, 18, -9, "0", "0", 10, true, false, false ) )
        result.add( priorityMoveFields( "Boa Crusher", "f+4, 1", m, 18, -13, la, la, 10, true, false, true ) )
        result.add( priorityMoveFields( "Side Step Elbow", "f+1+2", h, 22, -+8, k, k, 22, true, false, false ) )
        result.add( priorityMoveFields( "Gravity Blow", "f+1+4", "!", 28, -12, "-12", "-12", 21, true, false, false ) )
        result.add( priorityMoveFields( "", "d/f+1", m, 15, -5, "+1", "+1", 8, true, false, false ) )
        result.add( priorityMoveFields( "", "d/f+1, 1", m, 15, -10, "-4", "-4", 2, true, false, false ) )
        result.add( priorityMoveFields( "", "d/f+1, 1, 1", m, 15, -10, "-4", "-4", 2, true, false, false ) )
        result.add( priorityMoveFields( "Vulcan Cannon", "d/f+1, 1, 1, 1", m, 15, -10, "-4", "-4", 2, true, false, false ) )
        result.add( priorityMoveFields( "Double Body Blow", "d/f+1, 2", m, 15, -15, "+1", k, 20, true, false, false ) )
        result.add( priorityMoveFields( "", "d/f+2", m, 13, -6, "+5", "+5", 12, true, false, false ) )
        result.add( priorityMoveFields( "Blackout Combo", "d/f+2, 1", h, 13, -4, "+4", "+4", 11, true, false, false ) )
        result.add( priorityMoveFields( "Blackout Trap", "d/f+2, 3", m, 13, -13, k, c, 20, false, false, false ) )
        result.add( priorityMoveFields( "Snake Edge", "d/f+3", l, 29, -26, la, la, 20, true, false, false ) )
        result.add( priorityMoveFields( "Wolf's Tail", "d/f+4", m, 22, -5, k, k, 23, true, false, false ) )
        result.add( priorityMoveFields( "", "d+2", m, 14, -2, "+8", "+8", 17, true, false, false ) )
        result.add( priorityMoveFields( "Python Crush", "d+2, 3", m, 14, -10, k, la, 21, false, false, false ) )
        result.add( priorityMoveFields( "", "d+3", l, 16, -11, "0", "0", 10, true, false, false ) )
        result.add( priorityMoveFields( "Quick Low Screw Punch", "d+3, 2", h, 16, -7, k, k, 22, false, false, false ) )
        result.add( priorityMoveFields( "Low Kick", "d+4", l, 15, -11, "0", "0", 13, true, false, false ) )
        result.add( priorityMoveFields( "", "d+1+2 (first hit)", m, 17, -10, "+3", "+3", 10, true, false, false ) )
        result.add( priorityMoveFields( "", "d+1+2 (second hit)", m, 17, -10, "+3", "+3", 15, true, false, false ) )
        result.add( priorityMoveFields( "Hammer Drive Hatchet", "d+1+2, 3", l, 17, -13, "+4", k, 20, false, false, false ) )
        result.add( priorityMoveFields( "", "d+1+2, f (cd)", s, 17, -1, "+10", "+10", 0, false, false, false ) )
        result.add( priorityMoveFields( "", "d+1+2, b (sway)", s, 17, -8, "+3", "+3", 0, false, false, false ) )
        result.add( priorityMoveFields( "Snake Bomb", "d+1+2, 2", m, 17, +2, la, la, 24, false, false, false ) )
        result.add( priorityMoveFields( "", "d+3+4", l, 19, -12, "-1", "+4", 15, true, false, false ) )
        result.add( priorityMoveFields( "Side Low Knuckle Whip", "d+3+4 ,2", m, 19, -12, k, k, 23, false, false, false ) )
        result.add( priorityMoveFields( "", "d+3+4 ,2, d/b (cancel)", s, 19, -23, "-12", "-7", 0, false, false, false ) )
        result.add( priorityMoveFields( "Stomach Blow", "d/b+2", m, 15, -6, "+8", "+8", 13, true, false, false ) )
        result.add( priorityMoveFields( "Sweeper Kick", "d/b+3", l, 16, -12, "-1", "+4", 11, true, false, false ) )
        result.add( priorityMoveFields( "Crash Impact", "d/b+1+2", m, 15, -13, k, k, 39, true, false, false ) )
        result.add( priorityMoveFields( "Chopping Elbow", "b+1", m, 20, +4, "+7", la, 21, true, false, false ) )  // force crouch?
        result.add( priorityMoveFields( "", "b+2", h, 17, -7, "+4", c, 18, true, false, false ) )
        result.add( priorityMoveFields( "Double Back Knuckle", "b+2, 1", h, 17, 0, c, c, 17, false, false, false ) )
        result.add( priorityMoveFields( "Hands of Doom", "b+2, 1, 2", h, 17, -9, k, k, 22, false, false, false ) )
        result.add( priorityMoveFields( "", "b+2, 1, u or d", s, 17, -10, "+1", c, 22, false, false, false ) )
        result.add( priorityMoveFields( "Wolf Bite", "b+2, 1, 4", m, 17, -5, k, k, 21, false, false, false ) )
        result.add( priorityMoveFields( "Wolf Call", "b+2, 4", m, 17, -5, k, k, 21, false, false, false ) )
        result.add( priorityMoveFields( "", "b+3", m, 19, -7, "+4", "+4", 12, true, false, false ) )
        result.add( priorityMoveFields( "", "b+3, f or d/f", s, 19, +1, "+12", "+12", 12, false, false, false ) )
        result.add( priorityMoveFields( "", "b+3, 2", h, 19, -4, "+7", "+7", 12, true, false, false ) ) // verify natural
        result.add( priorityMoveFields( "", "b+3, 2, 1", m, 19, -4, "+2", "+2", 10, true, false, false ) ) // verify natural
        result.add( priorityMoveFields( "Front Kick to Rush", "b+3, 2, 1, 2", m, 19, -10, k, k, 14, false, false, false ) ) // verify natural
        result.add( priorityMoveFields( "Run For Cover", "b+3, 2, 1, 4", l, 19, -11, "0", "0", 12, false, false, false ) ) // verify natural
        result.add( priorityMoveFields( "", "b+3, 4", m, 19, -12, "-2", "-2", 18, false, false, false ) ) // verify natural
        result.add( priorityMoveFields( "Front Kick to Double Hammer", "b+3, 1+2", m, 19, -6, "+4", k, 25, false, false, false ) )
        result.add( priorityMoveFields( "", "b+3, 1+2, d", s, 19, -6, "+4", k, 0, false, false, false ) )
        result.add( priorityMoveFields( "Knee Break", "b+4", m, 16, -10, "+15", "+15", 18, true, false, false ) )
        //result.add( priorityMoveFields( "Parry", "b+1+3 or b+2+4", m, 16, -10, "+15", "+15", 18, false, false, false ) )
        //result.add( priorityMoveFields( "When Parrying 2", "1", h, 13, -10, k, k, 30, false, false, false ) )
        //result.add( priorityMoveFields( "When Parrying 2", "2", m, 15, -5, "+7", "+7", 22, false, false, false ) )
        result.add( priorityMoveFields( "Meteor Smash", "b+1+4", "!", 53, 0, k, k, 45, true, false, false ) )   //  unblockable
        result.add( priorityMoveFields( "Hook", "(u/b or u or u/f)+2", h, 15, -12, "+9", "+9", 17, true, false, false ) )
        result.add( priorityMoveFields( "", "u/b+1+2", m, 15, -16, "-6", "-6", 2, true, false, false ) )
        result.add( priorityMoveFields( "", "u/b+1+2 (second hit miss)", m, 15, -18, "-7", "-7", 5, true, false, false ) )
        result.add( priorityMoveFields( "", "u/b+1+2, 1", m, 15, -13, "-3", "-3", 2, true, false, false ) ) //  verify natural
        result.add( priorityMoveFields( "", "u/b+1+2, 1, 2", m, 15, -13, "-3", "-3", 2, true, false, false ) ) //  verify natural
        result.add( priorityMoveFields( "", "u/b+1+2, 1, 2, 1", m, 15, -13, "-3", "-3", 2, true, false, false ) ) //  verify natural
        result.add( priorityMoveFields( "", "u/b+1+2, 1, 2, 1, 2", m, 15, -16, "-6", "-6", 2, true, false, false ) ) //  verify natural
        result.add( priorityMoveFields( "", "u/b+1+2, 1, 2, 1, 2, 1", m, 15, -13, "-3", "-3", 2, true, false, false ) ) //  verify natural
        result.add( priorityMoveFields( "", "u/b+1+2, 1, 2, 1, 2, 1, 2", m, 15, -16, "-6", "-6", 2, true, false, false ) ) //  verify natural
        result.add( priorityMoveFields( "", "u/b+1+2, 1, 2, 1, 2, 1, 2, 1", m, 15, -13, "-3", "-3", 2, true, false, false ) ) //  verify natural
        result.add( priorityMoveFields( "", "u/b+1+2, 1, 2, 1, 2, 1, 2, 1, 2", m, 15, -16, "-6", "-6", 2, true, false, false ) ) //  verify natural
        result.add( priorityMoveFields( "", "u/b+1+2, 1, 2, 1, 2, 1, 2, 1, 2, 1", m, 15, -32, "-15", "-15", 2, true, false, false ) ) //  verify natural
        result.add( priorityMoveFields( "Gatling Rush", "u/b+1+2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 4", m, 15, -13, k, k, 14, true, false, false ) ) //  verify natural
        result.add( priorityMoveFields( "Rolling Driver", "u or u/f+3", m, 27, 0, k, k, 15, true, false, false ) )
        result.add( priorityMoveFields( "Orbital Heel Kick", "u+4", m, 24, -5, l, l, 21, true, false, false ) )
        result.add( priorityMoveFields( "Orbital Heel Kick", "u/f+4", m, 24, -5, l, l, 22, true, false, false ) )
        result.add( priorityMoveFields( "Mach Breaker", "f, f+2", h, 14, -9, k, k, 32, true, false, false ) )
        result.add( priorityMoveFields( "Slash Kick", "f, f+3", m, 23, -13, k, k, 25, true, false, false ) )
        result.add( priorityMoveFields( "Slash Kick (Hold)", "f, f+3", m, 34, +8, k, k, 33, true, false, false ) )
        result.add( priorityMoveFields( "Mach Kick", "f, f+4", h, 16, -10, k, k, 32, true, false, false ) )
        result.add( priorityMoveFields( "Jet Uppercut", "f, b+2", h, 14, -7, la, la, 20, true, false, false ) )
        result.add( priorityMoveFields( "Wedge Driver", "b, d/f+4", l, 29, -13, "+14", k, 25, true, false, false ) )
        //result.add( priorityMoveFields( "Wedge Driver (cancel)", "b, d/f+4, b", s, 29, 0, "", "", 25, true, false, false ) ) // verify - frames
        result.add( priorityMoveFields( "Flying Knee Kick", "b, b+4", m, 21, -19, "+8", "+8", 24, true, false, false ) )
        result.add( priorityMoveFields( "Snake Slash", "f, f, f+3", m, 22, +9, k, k, 30, true, false, false ) )
        result.add( priorityMoveFields( "Left Upper", "WS+1", m, 15, -16, l, l, 20, true, true, false ) )
        result.add( priorityMoveFields( "", "WS+2", m, 19, -10, "+1", "+1", 18, true, true, false ) )
        result.add( priorityMoveFields( "Fisherman Slam", "WS+2, b or f+2", m, 19, -10, l, l, 25, true, true, false ) )
        result.add( priorityMoveFields( "", "WS+3", m, 12, -10, "+4", l, 18, true, true, false ) )
        result.add( priorityMoveFields( "Double High Knee Kick", "WS+3, 4", m, 12, -10, "+4", "+29", 25, false, true, false ) )
        result.add( priorityMoveFields( "", "WS+4", m, 11, -6, "+5", "+5", 16, true, true, false ) )
        result.add( priorityMoveFields( "", "WS+1+2", m, 10, -5, "+6", "+6", 12, true, true, false ) )
        result.add( priorityMoveFields( "", "FC+d/f+2", m, 13, -8, "+4", "+4", 12, true, true, false ) )
        result.add( priorityMoveFields( "Snake Rampage", "FC+d/f+2, 1", h, 13, -8, k, k, 25, true, true, false ) )
        result.add( priorityMoveFields( "Northern Cross", "FC+d/f+4", m, 15, -10, "+13", ls, 21, true, true, false ) )
        result.add( priorityMoveFields( "Hellraiser", "SS+1", h, 17, -5, c, c, 23, true, false, false ) )
        result.add( priorityMoveFields( "", "SS+2", m, 20, -6, k, k, 20, true, false, false ) )
        result.add( priorityMoveFields( "Schock & Awe", "SS+2, 3", l, 20, -13, "+5", k, 20, false, false, false ) )
        result.add( priorityMoveFields( "Left Upper (from sway)", "qcf+1", m, 17, -16, l, l, 20, true, false, false ) )   //  may be 15 frame startup
        result.add( priorityMoveFields( "", "qcf+2", h, 16, -6, "+4", "+4", 18, true, false, false ) )
        result.add( priorityMoveFields( "Cross Bazooka", "qcf+2, 1", m, 16, -11, k, k, 26, false, false, false ) )  //  verify natural
        result.add( priorityMoveFields( "Requiem", "qcf+1+2", m, 17, -12, k, k, 28, true, false, false ) )
        result.add( priorityMoveFields( "", "qcf+3", m, 14, -10, "+4", l, 18, true, false, false ) )
        result.add( priorityMoveFields( "Double High Knee Kick (from sway)", "WS+3, 4", m, 14, -10, "+4", "+29", 25, false, false, false ) )
        result.add( priorityMoveFields( "", "qcf+4", m, 20, -5, "+1", "+3", 13, true, false, false ) )
        result.add( priorityMoveFields( "", "qcf+4, 1", h, 20, 0, c, c, 14, false, false, false ) )
        result.add( priorityMoveFields( "", "qcf+4, 1, d or u (cancel)", s, 20, -11, "-5", "-3", 0, true, false, false ) )
        result.add( priorityMoveFields( "Snake Spin Mach Breaker", "qcf+4, 1, 2", h, 20, -9, k, k, 22, true, false, false ) )
        result.add( priorityMoveFields( "Snake Spin Middle Kick", "qcf+4, 1, 4", m, 20, -5, k, k, 21, true, false, false ) )
        result.add( priorityMoveFields( "", "qcb+2", m, 17, -9, "+6", "+6", 16, true, false, false ) )
        result.add( priorityMoveFields( "Smash & Mach Kick", "qcb+2, 4", h, 17, -10, k, l, 25, true, false, false ) )
        result.add( priorityMoveFields( "Hatchet Kick", "qcb+3", l, 19, -13, "+4", k, 21, true, false, false ) )
        result.add( priorityMoveFields( "Kickoff", "qcb+4", m, 17, -12, l, l, 23, true, false, false ) )
        result.add( priorityMoveFields( "Taunt", "1+3+4", "!", 28, +16, "+16", "+16", 0, true, false, false ) )

        return result
    }

    fun getMardukMovesList(): MutableList<priorityMoveFields>{
        val result = mutableListOf<priorityMoveFields>()
        result.add( priorityMoveFields( "Jab", "1", h, 10, 1, "+8", "+8", 7, true, false, false ) )
        result.add( priorityMoveFields( "Left Right Combo", "1, 2", h, 10, 1, "+5", "+5", 12, true, false, false ) )
        result.add( priorityMoveFields( "Left Right Combo to Ready Position", "1, 2, 3+4", "STANCE", 10, -3, "+3", "+3", 0, true, false, false ) ) // Parecen numeros inventados
        result.add( priorityMoveFields( "Left Right Combo to Gut Check", "1, 2, 3", m, 10, -16, "-5", "-5", 12, false, false, false ) )
        result.add( priorityMoveFields( "Left Right Combo to Gut Check 4", "1, 2, 3, 1+2", m, 10, 0, "+4", "+4", 28, false, false, false ) )
        result.add( priorityMoveFields( "Left Right to Power Elbow Combo", "1, 2, f+1", h, 10, 4, "+6", k, 21, false, false, false ) )
        result.add( priorityMoveFields( "Jab Body Combo", "1, d+2", m, 10, -9, "+7", "+7", 13, true, false, false ) )


        return result
    }

    fun getMokujinMovesList(): MutableList<priorityMoveFields>{
        val result = mutableListOf<priorityMoveFields>()
        //                    name  inpt  prop speed onB onH onCH dmg natural crouch forceCrouch
        // mids
        result.add( priorityMoveFields( "-9f", "1", m, 50, -9, "0", "0", 0, false, false, false ) )
        result.add( priorityMoveFields( "-10f", "1", m, 50, -10, "0", "0", 0, false, false, false ) )
        result.add( priorityMoveFields( "-11f", "1", m, 50, -11, "0", "0", 0, false, false, false ) )
        result.add( priorityMoveFields( "-12f", "1", m, 50, -12, "0", "0", 0, false, false, false ) )
        result.add( priorityMoveFields( "-13f", "1", m, 50, -13, "0", "0", 0, false, false, false ) )
        result.add( priorityMoveFields( "-14f", "1", m, 50, -14, "0", "0", 0, false, false, false ) )
        result.add( priorityMoveFields( "-15f", "1", m, 50, -15, "0", "0", 0, false, false, false ) )
        result.add( priorityMoveFields( "-16f", "1", m, 50, -16, "0", "0", 0, false, false, false ) )
        result.add( priorityMoveFields( "-17f", "1", m, 50, -17, "0", "0", 0, false, false, false ) )
        result.add( priorityMoveFields( "-18f", "1", m, 50, -18, "0", "0", 0, false, false, false ) )
        result.add( priorityMoveFields( "-19f", "1", m, 50, -19, "0", "0", 0, false, false, false ) )
        result.add( priorityMoveFields( "-20f", "1", m, 50, -20, "0", "0", 0, false, false, false ) )
        result.add( priorityMoveFields( "-21f", "1", m, 50, -21, "0", "0", 0, false, false, false ) )
        result.add( priorityMoveFields( "-22f", "1", m, 50, -22, "0", "0", 0, false, false, false ) )
        result.add( priorityMoveFields( "-23f", "1", m, 50, -23, "0", "0", 0, false, false, false ) )
        result.add( priorityMoveFields( "-24f", "1", m, 50, -24, "0", "0", 0, false, false, false ) )

        // lows
        result.add( priorityMoveFields( "-9low", "1", l, 50, -9, "0", "0", 0, false, false, false ) )
        result.add( priorityMoveFields( "-10low", "1", l, 50, -10, "0", "0", 0, false, false, false ) )
        result.add( priorityMoveFields( "-11low", "1", l, 50, -11, "0", "0", 0, false, false, false ) )
        result.add( priorityMoveFields( "-12low", "1", l, 50, -12, "0", "0", 0, false, false, false ) )
        result.add( priorityMoveFields( "-13low", "1", l, 50, -13, "0", "0", 0, false, false, false ) )
        result.add( priorityMoveFields( "-14low", "1", l, 50, -14, "0", "0", 0, false, false, false ) )
        result.add( priorityMoveFields( "-15low", "1", l, 50, -15, "0", "0", 0, false, false, false ) )
        result.add( priorityMoveFields( "-16low", "1", l, 50, -16, "0", "0", 0, false, false, false ) )
        result.add( priorityMoveFields( "-17low", "1", l, 50, -17, "0", "0", 0, false, false, false ) )
        result.add( priorityMoveFields( "-18low", "1", l, 50, -18, "0", "0", 0, false, false, false ) )
        result.add( priorityMoveFields( "-19low", "1", l, 50, -19, "0", "0", 0, false, false, false ) )
        result.add( priorityMoveFields( "-20low", "1", l, 50, -20, "0", "0", 0, false, false, false ) )
        result.add( priorityMoveFields( "-21low", "1", l, 50, -21, "0", "0", 0, false, false, false ) )
        result.add( priorityMoveFields( "-22low", "1", l, 50, -22, "0", "0", 0, false, false, false ) )
        result.add( priorityMoveFields( "-23low", "1", l, 50, -23, "0", "0", 0, false, false, false ) )
        result.add( priorityMoveFields( "-24low", "1", l, 50, -24, "0", "0", 0, false, false, false ) )

        // mids that force crouch
        result.add( priorityMoveFields( "-9f FC", "1", m, 50, -9, "0", "0", 0, false, false, true ) )
        result.add( priorityMoveFields( "-10f FC", "1", m, 50, -10, "0", "0", 0, false, false, true ) )
        result.add( priorityMoveFields( "-11f FC", "1", m, 50, -11, "0", "0", 0, false, false, true ) )
        result.add( priorityMoveFields( "-12f FC", "1", m, 50, -12, "0", "0", 0, false, false, true ) )
        result.add( priorityMoveFields( "-13f FC", "1", m, 50, -13, "0", "0", 0, false, false, true ) )
        result.add( priorityMoveFields( "-14f FC", "1", m, 50, -14, "0", "0", 0, false, false, true ) )
        result.add( priorityMoveFields( "-15f FC", "1", m, 50, -15, "0", "0", 0, false, false, true ) )
        result.add( priorityMoveFields( "-16f FC", "1", m, 50, -16, "0", "0", 0, false, false, true ) )



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
                0,
                false,
                false,
                false
            )
        )
        return result
    }


}