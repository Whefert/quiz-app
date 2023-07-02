package com.example.myquizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<Question>{
        val questionsList= ArrayList<Question>()
        val que1 = Question(1,"What country does this flag belong to",
            R.drawable.ic_flag_of_argentina, "Argentina","Australia",
            "Vietnam", "Singapore", 1
        )
        questionsList.add(que1)

        val que2 = Question(2,"What country does this flag belong to",
            R.drawable.ic_flag_of_belgium, "Jamaica","Belgium",
            "Vietnam", "Japan", 2
        )
        questionsList.add(que2)

        val que3 = Question(3,"What country does this flag belong to",
            R.drawable.ic_flag_of_australia, "Fiji","Afghanistan",
            "Australia", "China", 3
        )
        questionsList.add(que3)

        val que4 = Question(4,"What country does this flag belong to",
            R.drawable.ic_flag_of_brazil, "Argentina","Australia",
            "Vietnam", "Brazil", 4
        )
        questionsList.add(que4)

        val que5 = Question(5,"What country does this flag belong to",
            R.drawable.ic_flag_of_fiji, "Fiji","Trinidad",
            "Spain", "Italy", 1
        )
        questionsList.add(que5)

        val que6 = Question(6,"What country does this flag belong to",
            R.drawable.ic_flag_of_denmark, "Norway","Denmark",
            "Finland", "St. Kitts & Nevis", 2
        )
        questionsList.add(que6)

        val que7 = Question(7,"What country does this flag belong to",
            R.drawable.ic_flag_of_germany, "Brazil","Panama",
            "Germany", "Nepal", 3
        )
        questionsList.add(que7)

        val que8 = Question(8,"What country does this flag belong to",
            R.drawable.ic_flag_of_india, "Nigeria","South Africa",
            "Kenya", "India", 4
        )
        questionsList.add(que8)

        val que9 = Question(9,"What country does this flag belong to",
            R.drawable.ic_flag_of_new_zealand, "New Zealand","Ghana",
            "Barbados", "Jamaica", 1
        )
        questionsList.add(que9)

        return questionsList
    }
}