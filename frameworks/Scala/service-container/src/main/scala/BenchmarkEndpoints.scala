import akka.actor.{ActorSystem, ActorRefFactory}
import com.github.vonnagy.service.container.http.routing.RoutedEndpoints
import spray.http.MediaTypes._

case class Message(message: String)

class BenchmarkEndpoints(implicit system: ActorSystem,
                         actorRefFactory: ActorRefFactory) extends RoutedEndpoints {

  val route = {
    get {
      path("json") {
        implicit val marshaller = jsonMarshaller
        respondWithMediaType(`application/json`) {
          complete(Message("Hello, World!"))
        }
      } ~
        path("plaintext") {
          complete("Hello, World!")
        }
    }
  }
}