import com.github.vonnagy.service.container.ContainerBuilder
import com.typesafe.config.ConfigFactory

object Main extends App {

  // Here we establish the container and build it while
  // applying extras.
  val service = new ContainerBuilder()
    // Register the API routes
    .withRoutes(classOf[BenchmarkEndpoints]).build

  service.start
}

