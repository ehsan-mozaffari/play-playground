import daos.StudentDao
import play.api.libs.json.Json

package object controllers {
  implicit val StudentDaoFormats = Json.format[StudentDao]
}
