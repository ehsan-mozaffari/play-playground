package controllers

import java.time.LocalDate

import daos.StudentDao
import javax.inject._
import play.api.libs.json.{JsError, Json, Reads}
import play.api.mvc._

import scala.concurrent.{ExecutionContext, Future}

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class StudentController @Inject()(val controllerComponents: ControllerComponents)(implicit ec: ExecutionContext) extends BaseController {

  def validateJson[A: Reads]: BodyParser[A] = parse.json.validate { x =>
     x.validate[A].asEither.left.map(e => BadRequest(JsError.toJson(e)))
  }

  def getStudentById(id: Long) = Action/*.async(validateJson[Long]) */{ implicit request: Request[AnyContent] =>
    Ok(Json.toJson[StudentDao](StudentDao(id = id, name = "John Doe", age = 25, gender = "Male", birthDate = LocalDate.parse("1990-02-26"))))
  }

  def addStudent: Action[StudentDao] = Action.async(validateJson[StudentDao]) { implicit request =>
    Future.successful(Ok(Json.toJson("added")))
  }
}
