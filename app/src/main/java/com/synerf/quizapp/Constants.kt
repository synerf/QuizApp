package com.synerf.quizapp

import java.util.ArrayList

object Constants{

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
        1,
        "What country does this flag belong to?",
        R.drawable.ic_argentina,
        "Argentina",
        "Austria",
        "Armenia",
        "Costa Rica",
        1)
        questionsList.add(que1)

        val que2 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.ic_australia,
            "United Kingdom",
            "Australia",
            "USA",
            "France",
            2)
        questionsList.add(que2)

        val que3 = Question(
            3,
            "What country does this flag belong to?",
            R.drawable.ic_belgium,
            "France",
            "Poland",
            "Belgium",
            "Spain",
            3)
        questionsList.add(que3)

        val que4 = Question(
            4,
            "What country does this flag belong to?",
            R.drawable.ic_brazil,
            "South Africa",
            "Taiwan",
            "India",
            "Brazil",
            4)
        questionsList.add(que4)

        val que5 = Question(
            5,
            "What country does this flag belong to?",
            R.drawable.ic_denmark,
            "Canada",
            "Denmark",
            "Italy",
            "Jamaica",
            2)
        questionsList.add(que5)

        val que6 = Question(
            6,
            "What country does this flag belong to?",
            R.drawable.ic_fiji,
            "Malaysia",
            "Fiji",
            "Portugal",
            "Zimbabwe",
            2)
        questionsList.add(que6)

        val que7 = Question(
            7,
            "What country does this flag belong to?",
            R.drawable.ic_germany,
            "Germany",
            "Iceland",
            "Bulgaria",
            "Egypt",
            1)
        questionsList.add(que7)

        val que8 = Question(
            8,
            "What country does this flag belong to?",
            R.drawable.ic_india,
            "Dominica",
            "Singapore",
            "Mexico",
            "India",
            4)
        questionsList.add(que8)

        val que9 = Question(
            9,
            "What country does this flag belong to?",
            R.drawable.ic_kuwait,
            "Israel",
            "Poland",
            "Kuwait",
            "Qatar",
            3)
        questionsList.add(que9)

        val que10 = Question(
            10,
            "What country does this flag belong to?",
            R.drawable.ic_new_zealand,
            "Portugal",
            "New Zealand",
            "South Korea",
            "United Kingdom",
            2)
        questionsList.add(que10)

        return questionsList
    }
}