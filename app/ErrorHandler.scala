import javax.inject.Singleton
import play.api.Environment
import play.api.http.JsonHttpErrorHandler
import play.api.http.Status.{BAD_REQUEST, FORBIDDEN, NOT_FOUND}
import play.api.mvc.{RequestHeader, Result}
import play.core.SourceMapper

import scala.concurrent.Future

/**
 * https://code-maze.com/top-rest-api-best-practices/
 * @param environment
 * @param sourceMapper
 */
@Singleton
class ErrorHandler(environment: Environment, sourceMapper: Option[SourceMapper] = None)
  extends JsonHttpErrorHandler(environment: Environment, sourceMapper: Option[SourceMapper]) {

//  override def onClientError(request: RequestHeader, statusCode: Int, message: String): Future[Result] = statusCode match {
//    case BAD_REQUEST => onBadRequest(request, message)
//    case FORBIDDEN => onForbidden(request, message)
//    case NOT_FOUND => onNotFound(request, message)
//    case clientError if statusCode >= 400 && statusCode < 500 => onOtherClientError(request, statusCode, message)
//    case nonClientError =>
//      throw new IllegalArgumentException(
//        s"onClientError invoked with non client error status code $statusCode: $message"
//      )
//  }

  override def onServerError(request: RequestHeader, exception: Throwable): Future[Result] = super.onServerError(request, exception)
}
