package controllers

import java.time.LocalDate

import daos.StudentDao
import javax.inject._
import play.api.libs.json.Json
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class StudentController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def getStudentById(id: Long) = Action { implicit request: Request[AnyContent] =>
    Ok(Json.toJson[StudentDao](StudentDao(id = id, name = "John Doe", age = 25, gender = "Male", birthDate = LocalDate.parse("1990-02-26"))))
  }
}
