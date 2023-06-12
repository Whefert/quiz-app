package com.example.myquizapp

object Constants {
    fun getQuestions(): ArrayList<Question>{
        val questionsList= ArrayList<Question>()
        val que1 = Question(1,"What country does this flag belong to",
            R.drawable.ic_flag_of_argentina, "Argentina","Australia",
            "Vietnam", "Signapore", 1
        )
        questionsList.add(que1)

        val que2 = Question(1,"What country does this flag belong to",
            R.drawable.ic_flag_of_argentina, "Argentina","Australia",
            "Vietnam", "Signapore", 1
        )
        questionsList.add(que2)

        val que3 = Question(1,"What country does this flag belong to",
            R.drawable.ic_flag_of_argentina, "Argentina","Australia",
            "Vietnam", "Signapore", 1
        )
        questionsList.add(que3)

        val que4 = Question(1,"What country does this flag belong to",
            R.drawable.ic_flag_of_argentina, "Argentina","Australia",
            "Vietnam", "Signapore", 1
        )
        questionsList.add(que4)

        val que5 = Question(1,"What country does this flag belong to",
            R.drawable.ic_flag_of_argentina, "Argentina","Australia",
            "Vietnam", "Signapore", 1
        )
        questionsList.add(que5)

        val que6 = Question(1,"What country does this flag belong to",
            R.drawable.ic_flag_of_argentina, "Argentina","Australia",
            "Vietnam", "Signapore", 1
        )
        questionsList.add(que6)

        val que7 = Question(1,"What country does this flag belong to",
            R.drawable.ic_flag_of_argentina, "Argentina","Australia",
            "Vietnam", "Signapore", 1
        )
        questionsList.add(que7)

        val que8 = Question(1,"What country does this flag belong to",
            R.drawable.ic_flag_of_argentina, "Argentina","Australia",
            "Vietnam", "Signapore", 1
        )
        questionsList.add(que8)

        val que9 = Question(1,"What country does this flag belong to",
            R.drawable.ic_flag_of_argentina, "Argentina","Australia",
            "Vietnam", "Signapore", 1
        )
        questionsList.add(que9)

        return questionsList
    }
}