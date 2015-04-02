package scalaParser

import scala.util._

import org.scalatest._
import org.parboiled2._


trait ParserTestsHelper {this: Matchers =>

  def check[T](r: Scala => Rule1[T])(in: String, expected: => T) = {
    val p = new Scala(in)
    p.__run(r(p)) shouldBe Success(expected)
  }

}
