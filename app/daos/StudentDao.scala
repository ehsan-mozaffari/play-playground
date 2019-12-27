package daos

import java.time.LocalDate

import enums.Gender.Gender

case class StudentDao(id: Long, name: String, age: Int, gender: String, birthDate: LocalDate)
